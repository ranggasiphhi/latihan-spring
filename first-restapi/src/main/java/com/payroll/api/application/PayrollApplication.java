package com.payroll.api.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.payroll.api"})
public class PayrollApplication{
    public static void main(String... args){
        SpringApplication.run(PayrollApplication.class, args);
    }
}