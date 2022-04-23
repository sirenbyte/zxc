package kz.mvp.keloyna.controller;

import kz.mvp.keloyna.service.api.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/api/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

}
