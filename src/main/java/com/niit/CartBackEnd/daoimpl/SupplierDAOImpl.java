package com.niit.CartBackEnd.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.CartBackEnd.dao.SupplierDAO;
import com.niit.CartBackEnd.model.Supplier;
import com.niit.CartBackEnd.model.User;

@SuppressWarnings({ "unused", "deprecation" })
@Repository
public class SupplierDAOImpl implements SupplierDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	 public SupplierDAOImpl(SessionFactory sessionFactory)
	    {
	    	this.sessionFactory=sessionFactory;
	    }

	@Transactional
	public boolean save(Supplier supplier) {
		try
		{
			System.out.println("save method is executed in supplier");
		sessionFactory.getCurrentSession().save(supplier);
		return true; 
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	
	}

	@Transactional
	public boolean update(Supplier supplier) {
		try
		{
		sessionFactory.getCurrentSession().update(supplier);
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Transactional
	public boolean delete(Supplier supplier) {
		
		return false;
	}

	public List<User> list() {
		
		return null;
	}

	public User get(String id) {
	
		return null;
	}

	public boolean save(java.util.function.Supplier supplier) {
	
		return false;
	}

	public boolean delete(int id) {
	
		return false;
	}

	public java.util.function.Supplier get(int id) {
	
		return null;
	}
}
