package kz.mvp.keloyna.service.api.auth;


import kz.mvp.keloyna.config.jwt.JwtAuthenticationResponse;
import kz.mvp.keloyna.dto.LoginDto;
import kz.mvp.keloyna.dto.UserRegistrationDto;
import kz.mvp.keloyna.entity.Users;

public interface AuthService {
    JwtAuthenticationResponse registration(UserRegistrationDto registrationDto);
    JwtAuthenticationResponse login(LoginDto loginDto);
    Users getMe();
}
