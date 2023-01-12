package com.cffy.gradle01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cffy.gradle01.mapper")
public class Gradle01Application {
    public static void main(String[] args) {
        SpringApplication.run(Gradle01Application.class, args);
    }

}
