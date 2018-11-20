package com.hibernateexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.hibernateexample.Repository")
@EntityScan(basePackages = "com.hibernateexample.Model")
public class HibernateExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(HibernateExampleApplication.class, args);
    }
}
