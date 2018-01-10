package com.domain;
import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@SuppressWarnings("deprecation")
@Entity					
@Table(name="User")		
public class User implements Serializable 		
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id											//it create email column as primary key
	@Email(message="Enter valid Email")			//@Email,@NotEmpty=hibernate validation
	@NotEmpty(message="Enter the Email")
	private String email;
	
	@NotEmpty(message="Enter the Name")
	@Column(name="name")						//@Column,@NotNull,@Size,@PAtteren=validation-api
	private String name;
	
	@NotNull(message="Password is Null")
	private String password;
	
	private String confirm_password;
	
	private String role;
	
	@NotNull(message="Address is Null")
	private String address;
	
	
	@Pattern(regexp="[\\d]{10}",message="Please enter 10 digits")			//regexp=regular expression is an object that describes a pattern of characters.
	@NotNull
	@Size(min=8,max=10,message="Enter Correct Phone no.")
	private String phone;
	
	private boolean enabled;
		
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
	public String getConfirm_password() {
		return confirm_password;
	}
	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
}
