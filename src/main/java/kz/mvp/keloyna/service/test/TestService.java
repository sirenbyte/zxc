package kz.mvp.keloyna.service.test;

import org.springframework.http.HttpMethod;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestTemplate;

public class TestService {
    @Scheduled(fixedRate = 1200000)
    public void loged() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://keloyna.herokuapp.com/";
        restTemplate.exchange(url, HttpMethod.GET, null, String.class);
    }
}
