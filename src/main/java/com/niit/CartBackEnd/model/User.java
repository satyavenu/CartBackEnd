package com.niit.CartBackEnd.model;
import javax.ejb.EJB;
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
	//what are the properties same as database table fields
	private String id; 

	private String name; 
	
	private String password; 
	
	private String mail; 
	
	private String contact; 
	
	private String role;

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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	} 
	
}
