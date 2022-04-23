package kz.mvp.keloyna.controller.auth;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kz.mvp.keloyna.config.jwt.JwtAuthenticationResponse;
import kz.mvp.keloyna.dto.LoginDto;
import kz.mvp.keloyna.dto.UserRegistrationDto;
import kz.mvp.keloyna.entity.Users;
import kz.mvp.keloyna.service.api.auth.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Api(value = "API для авторизаций")
@RestController
@RequestMapping("v1/api")
@AllArgsConstructor
public class AuthController {
    private final AuthService authService;

    @ApiOperation(value = "Логин пользователя", notes = "Логин пользователя")
    @PostMapping("/login")
    public ResponseEntity<JwtAuthenticationResponse> login(@RequestBody LoginDto dto){
        return ResponseEntity.ok(authService.login(dto));
    }

    @ApiOperation(value = "Регистрация пользователя", notes = "Регистрация пользователя")
    @PostMapping("/register")
    public ResponseEntity<JwtAuthenticationResponse> registerUser(@RequestBody UserRegistrationDto registrationRequest) {
        return ResponseEntity.ok(authService.registration(registrationRequest));
    }

    @ApiOperation(value = "Получения пользователя", notes = "Получения пользователя")
    @GetMapping("/me")
    public ResponseEntity<Users> getMe() {
        return ResponseEntity.ok(authService.getMe());
    }
}
