package org.example.actividad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class ActividadApplication {
    public static void main(String[] args) {
        SpringApplication.run(ActividadApplication.class, args);
    }
}