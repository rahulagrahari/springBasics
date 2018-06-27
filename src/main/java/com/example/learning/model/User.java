package com.example.learning.model;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "user")
public class User {
	
	
	@Id
	@Column(name="user_Id")
	@GeneratedValue()
	private int id;
	private String active;
	private String name;
	private String email;
	private String password;
	
	@OneToMany
	@JoinTable	(name="")
	private Set<Role> roles;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User() {
		super();
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public User(int id, String active, String name, String email, String password, Set<Role> roles) {
		super();
		this.id = id;
		this.active = active;
		this.name = name;
		this.email = email;
		this.password = password;
		this.roles = roles;
	}

	public User(User user) {
		this.id = user.getId();
		this.active = user.getActive();
		this.name = user.getName();
		this.email = user.getEmail();
		this.password = user.getPassword();
		this.roles = user.getRoles();
	}

	
	

}
