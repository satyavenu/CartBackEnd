package com.niit.CartBackEnd.dao;
import java.util.List;

import com.niit.CartBackEnd.model.Supplier;


public interface SupplierDAO {
	public List<Supplier> list();

	public Supplier get(String id);

	
		
		public boolean delete(Supplier supplier);

	
		public com.niit.CartBackEnd.model.Supplier get(int id);

		

		public boolean saveOrUpdate(Supplier supplier);

		
	
	}


