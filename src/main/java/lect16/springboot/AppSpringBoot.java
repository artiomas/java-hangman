package lect16.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "lect16.*" })
public class AppSpringBoot {

    public static void main(String[] args) {

        SpringApplication.run(AppSpringBoot.class, args);


    }

}