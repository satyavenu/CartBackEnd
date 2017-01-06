package com.niit.CartBackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


import org.springframework.stereotype.Component;
@Table
@Entity
@Component
public class Product {
@Id
@GeneratedValue
	private int id;
	private String name;
	private String description;
	private int categoryid;
	private int supplierid;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	
	public int getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}
	public int getSupplierid() {
		return supplierid;
	}
	public void setSupplierid(int supplierid)
	{
		this.supplierid = supplierid;
	}
}