package com.payroll.api.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import com.payroll.api.model.enumeration.Status;

@Data
@Entity
@Table(name = "CUSTOMER_ORDER")
public class Order{
    private @Id @GeneratedValue Long id;

    private String description;
    private Status status;

    public Order(){}
    
    public Order(String description, Status status){
        this.description = description;
        this.status = status;
    }


}