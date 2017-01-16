package com.niit.CartBackEnd.dao;
import java.util.List;
import java.util.function.Supplier;

import com.niit.CartBackEnd.model.User;


public interface SupplierDAO {
	public List<User> list();

	public User get(String id);

	
		
		public boolean delete(com.niit.CartBackEnd.model.Supplier supplier);

		@SuppressWarnings("rawtypes")
		public Supplier get(int id);

		public boolean save(com.niit.CartBackEnd.model.Supplier supplier);

		public void saveOrUpdate(com.niit.CartBackEnd.model.Supplier supplier);

		
	
	}


