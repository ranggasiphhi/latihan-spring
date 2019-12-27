package com.payroll.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.payroll.api.model.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
    
}