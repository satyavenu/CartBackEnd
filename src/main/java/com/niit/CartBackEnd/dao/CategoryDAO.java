package com.niit.CartBackEnd.dao;



import java.util.List;

import com.niit.CartBackEnd.model.Category;

public interface CategoryDAO {
	public List<Category> list();
	
	public boolean save(Category category);
	public boolean delete(int id);
	public Category get(int id);

	
}

