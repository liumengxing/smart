package com.juju;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.juju.dao"})
public class SmartApplication {
    public static void main(String[] args) {
        SpringApplication.run(SmartApplication.class, args);
    }
}
