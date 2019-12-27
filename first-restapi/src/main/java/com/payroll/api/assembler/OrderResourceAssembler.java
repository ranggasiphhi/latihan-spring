package com.payroll.api.assembler;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;
import com.payroll.api.controller.OrderController;
import com.payroll.api.model.entity.Order;
import com.payroll.api.model.enumeration.Status;

@Component
public class OrderResourceAssembler implements RepresentationModelAssembler<Order, EntityModel<Order>>{

    @Override
    public EntityModel<Order> toModel(Order order){
        EntityModel<Order> orderResource =  new EntityModel<>(order, 
        linkTo(methodOn(OrderController.class).one(order.getId())).withSelfRel(),
        linkTo(methodOn(OrderController.class).all()).withRel("orders"));

        if(order.getStatus() == Status.IN_PROGRESS){
            orderResource.add(
                linkTo(methodOn(OrderController.class)
                   .cancel(order.getId())).withRel("cancel"));
            orderResource.add(
                linkTo(methodOn(OrderController.class)
                   .complete(order.getId())).withRel("complete"));
        }

        return orderResource;
    }
}