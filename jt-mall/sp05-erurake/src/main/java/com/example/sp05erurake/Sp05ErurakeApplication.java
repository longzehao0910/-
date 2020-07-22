package com.example.sp05erurake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Sp05ErurakeApplication {

    public static void main(String[] args) {
        SpringApplication.run(Sp05ErurakeApplication.class, args);
    }

}
