package com.example.sample;

import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class FirstSpringApp {

    public static void main(String[] args) {
        log.info("Log : Hello, Spring Boot!");
        System.out.println("Hello, Spring Boot!");
    }
}