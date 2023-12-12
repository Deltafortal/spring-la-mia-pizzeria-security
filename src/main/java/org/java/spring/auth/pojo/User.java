package org.java.spring.auth.pojo;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;


@Entity
public class User {

	
	//Declaring variables
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	private String username;
	private String password;
	
	@ManyToMany
	private List<Role> roles;
	
	
	
	//Constructor
	public User() { }
	public User(String username, String password, Role...roles) {
		
		setUsername(username);
		setPassword(password);
	}
	
	
	
	
	
	//Id Functions
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	//Username FUnctions
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	//Password Functions
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	//Roles Functions
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	public void setRoles(Role... roles) {
		setRoles(List.of(roles));
	}
}
