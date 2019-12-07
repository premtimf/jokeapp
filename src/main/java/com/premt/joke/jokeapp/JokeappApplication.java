package com.premt.joke.jokeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.premt.joke.jokeapp","com.premt.joke"})
public class JokeappApplication {

    public static void main(String[] args) {
        SpringApplication.run(JokeappApplication.class, args);
    }

}
