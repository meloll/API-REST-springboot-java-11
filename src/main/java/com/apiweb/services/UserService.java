package com.apiweb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.apiweb.entities.User;
import com.apiweb.repositories.UserRepository;
import com.apiweb.services.exceptions.DatabaseException;
import com.apiweb.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		try {
			repository.deleteById(id);
		}catch(EmptyResultDataAccessException e){
			throw new ResourceNotFoundException(id);
		}catch(DataIntegrityViolationException e ) {
			throw new DatabaseException(e.getMessage());
		}
		
	}
	
	public User update(Long id,User user) {
		User entity = repository.getOne(id);
		updateData(entity,user);
		return repository.save(entity);
	}

	private void updateData(User entity, User user) {
		entity.setName(user.getName());
		entity.setEmail(user.getEmail());
		entity.setPhone(user.getPhone());
		
	}

}
