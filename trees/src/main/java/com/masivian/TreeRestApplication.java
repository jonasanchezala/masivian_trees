package com.masivian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableAutoConfiguration
@SpringBootApplication
public class TreeRestApplication {
    public static void main(String[] args) {
        SpringApplication.run(TreeRestApplication.class, args);
    }
}
