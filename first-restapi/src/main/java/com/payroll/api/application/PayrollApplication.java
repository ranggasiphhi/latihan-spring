package com.payroll.api.application;

import com.payroll.api.LoadDatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.payroll.api"})
@EnableJpaRepositories(basePackageClasses = LoadDatabase.class)
public class PayrollApplication{
    public static void main(String... args){
        SpringApplication.run(PayrollApplication.class, args);
    }
}