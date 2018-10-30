package ru.avanin.cloud.practiceconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PracticeConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticeConfigApplication.class, args);
    }
}