package com.niit.CartBackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
@Table
@Entity
@Component
public class Product {
private static final MultipartFile Name = null;
@Id
@GeneratedValue
	private int id;
	private String name;
	private String description;
	private int category_id;
	private int supplierid;
	@SuppressWarnings("unused")
	private int price;
	private int categoryid;
	
	public int getId() {
		return id;
	}
	public void setId(String string, int id) {
		this.id = id;
	}
	public MultipartFile getName() {
		return Name;
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
	public int getprice() {
		return supplierid;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	public void setCategoryid(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setSupplier_id(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setPrice(String string) {
		// TODO Auto-generated method stub
		
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public void setId(String string) {
		// TODO Auto-generated method stub
		
	}
}