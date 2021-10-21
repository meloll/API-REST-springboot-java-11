package com.apiweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiweb.entities.User;

public interface UserRepository extends JpaRepository<User, Long > {

}
