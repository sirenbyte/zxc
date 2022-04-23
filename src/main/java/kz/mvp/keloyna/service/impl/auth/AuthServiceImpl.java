package kz.mvp.keloyna.service.impl.auth;

import kz.mvp.keloyna.config.jwt.JwtAuthenticationResponse;
import kz.mvp.keloyna.config.jwt.JwtProvider;
import kz.mvp.keloyna.dto.LoginDto;
import kz.mvp.keloyna.dto.UserRegistrationDto;
import kz.mvp.keloyna.entity.Users;
import kz.mvp.keloyna.service.api.UserService;
import kz.mvp.keloyna.service.api.auth.AuthService;
import kz.mvp.keloyna.util.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static kz.mvp.keloyna.util.UserContext.getUserPhone;

@Service
@AllArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserService userService;
    private final JwtProvider jwtProvider;
    private final PasswordEncoder passwordEncoder;

    private Users mapToUser(UserRegistrationDto dto) {
        Users user = new Users();
        user.setFirstName(dto.getFirstName());
        user.setLastName(dto.getLastName());
        user.setPhone(dto.getPhone());
        user.setEmail(dto.getEmail());
        user.setPassword(passwordEncoder.encode(dto.getPassword()));
        return userService.save(user);
    }

    @Override
    public JwtAuthenticationResponse registration(UserRegistrationDto dto) {
        return Optional.ofNullable(dto.getPhone())
                .filter(it -> !userService.existByPhone(dto.getPhone()))
                .map(it -> mapToUser(dto))
                .map(it -> new JwtAuthenticationResponse(jwtProvider.generateToken(it.getPhone())))
                .orElseThrow(()->new EntityNotFoundException("User exist"));
    }

    @Override
    public JwtAuthenticationResponse login(LoginDto dto) {
        Users user = userService.getByPhone(dto.getPhone());
        return Optional.ofNullable(dto.getPassword())
                .filter(it -> passwordEncoder.matches(dto.getPassword(), user.getPassword()))
                .map(it -> new JwtAuthenticationResponse(jwtProvider.generateToken(user.getPhone())))
                .orElseThrow(() -> new EntityNotFoundException("Password wrong"));
    }

    @Override
    public Users getMe() {
        return userService.getByPhone(getUserPhone());
    }
}
