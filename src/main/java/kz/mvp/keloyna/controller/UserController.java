package kz.mvp.keloyna.controller;

import kz.mvp.keloyna.service.api.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpMethod;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;

@RestController
@RequestMapping("v1/api/user")
@AllArgsConstructor
@Slf4j
public class UserController {

    private final UserService userService;

    @GetMapping("/time")
    public void getTime() {
        log.info("Time request {}", LocalDateTime.now());
    }

    @Scheduled(fixedRate = 1200000)
    public void loged() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://keloyna.herokuapp.com/v1/api/user/time";
        restTemplate.exchange(url, HttpMethod.GET, null, String.class);
    }
}
