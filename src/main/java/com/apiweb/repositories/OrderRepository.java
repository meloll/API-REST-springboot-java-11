package com.apiweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiweb.entities.Order;



public interface OrderRepository extends JpaRepository<Order, Long > {

}
