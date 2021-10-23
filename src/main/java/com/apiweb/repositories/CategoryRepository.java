package com.apiweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiweb.entities.Category;



public interface CategoryRepository extends JpaRepository<Category, Long > {

}
