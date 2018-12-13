package com.vcs.hangman.v2.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({"com.vcs.hangman.v2.*"})
public class SpringbootApp {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootApp.class, args);


    }

}
