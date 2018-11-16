package ru.avanin.cloud.customservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CustomServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomServiceApplication.class, args);
    }
}
