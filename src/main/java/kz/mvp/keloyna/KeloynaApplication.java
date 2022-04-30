package kz.mvp.keloyna;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class KeloynaApplication {

    public static void main(String[] args) {
        SpringApplication.run(KeloynaApplication.class, args);
    }

}
