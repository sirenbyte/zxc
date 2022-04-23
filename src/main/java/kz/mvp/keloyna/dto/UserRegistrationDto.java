package kz.mvp.keloyna.dto;

import lombok.Data;

@Data
public class UserRegistrationDto {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String phone;
}
