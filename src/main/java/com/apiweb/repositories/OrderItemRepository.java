package com.apiweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiweb.entities.OrderItem;



public interface OrderItemRepository extends JpaRepository<OrderItem, Long > {

}
