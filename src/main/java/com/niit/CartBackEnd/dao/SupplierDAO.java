package com.niit.CartBackEnd.dao;
import java.util.List;
import java.util.function.Supplier;

import com.niit.CartBackEnd.model.User;


public interface SupplierDAO {
	public List<User> list();

	public User get(String id);

	
		public boolean save(Supplier supplier);
		public boolean delete(int id);

		public Supplier get(int id);

		
	
	}


