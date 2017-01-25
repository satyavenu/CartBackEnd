package com.niit.CartBackEnd.dao;



import java.util.List;

import com.niit.CartBackEnd.model.Category;

public interface CategoryDAO {
	public List<Category> list();
	
	
	public boolean delete(Category category);
	public Category get(int id);

	public boolean saveorupdate(Category category);

	
}

