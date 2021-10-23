package com.apiweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiweb.entities.Product;



public interface ProductRepository extends JpaRepository<Product, Long > {

}
