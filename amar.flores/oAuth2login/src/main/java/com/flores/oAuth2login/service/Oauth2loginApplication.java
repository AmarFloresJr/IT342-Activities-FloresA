package com.flores.oAuth2login.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Oauth2loginApplication {

    public static void main(String[] args) {
        SpringApplication.run(Oauth2loginApplication.class, args);
        System.out.println("success");
    }

}