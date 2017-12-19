package com.domain;

import java.io.Serializable;

import javax.persistence.*;

import org.springframework.stereotype.Component;

@Component;
@Entity;

public class User1 implements Serializable
{
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Id
	private String email;
	private int id;
	private String name;
	private String password;
	
	private String address;
	private String phone;
	private String role;

}
