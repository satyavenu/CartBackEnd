package com.niit.CartBackEnd.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

import javax.persistence.Id;
//map to specify database entity(table)
//which table you have map
//create singleton instance/object
@Entity
@Table          //if the table name and domine object is same
@Component
public class User {
	@Id

	//what are the properties same as database table fieldsuser.setId("1096");
	
	private String id; 

	private String name; 
	
	private String password; 
	
	private String Mobile;
	
	private String Role; 
	
	private String contact; 
	
	private String Mail;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
	public String getMobile() {
		return Mobile;
	}

	public void setMobile(String Mobile) {
		this.Mobile = Mobile;
	}

	

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		this.Role = role;
	} 
	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	
public String getMail() {
	return Mail;
}

public void setMail(String mail) {
	this.Mail = mail;
}}

