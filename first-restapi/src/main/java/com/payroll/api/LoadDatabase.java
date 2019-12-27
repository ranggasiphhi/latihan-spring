package com.payroll.api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

import com.payroll.api.repository.*;
import com.payroll.api.model.entity.*;
import com.payroll.api.model.enumeration.Status;

@Configuration
@Slf4j
public class LoadDatabase{
    @Bean
    public CommandLineRunner initDatabase(EmployeeRepository repository, OrderRepository orderRepository){
        return args -> {
            log.info("Preloading" + repository.save(new Employee("Bilbo", "Babgilns","burglar")));
            log.info("Preloading" + repository.save(new Employee("Frodo", "Baggins", "thief")));

            orderRepository.save(new Order("MacBook Pro", Status.COMPLETED));
            orderRepository.save(new Order("iPhone", Status.IN_PROGRESS));

            orderRepository.findAll().forEach(order -> {
                log.info("Preloaded" + order);
            });
        };
    }
}