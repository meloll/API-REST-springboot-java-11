package com.apiweb.entities;

import java.io.Serializable;
import java.util.Objects;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class User implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String email;
	private String phone;
	private String password;
	
	
	public User()  {
	}


	public User(int id, String name, String email, String phone, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return id == other.id;
	}
	
	
	
	
	
	
	

}
