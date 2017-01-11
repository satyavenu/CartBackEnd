package com.niit.CartBackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Table
@Entity
@Component
public class Category {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String description;
	public int getId() {
		return id;
	}
	public void setId(String string, int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setId(String string) {
		// TODO Auto-generated method stub
		
	}
}