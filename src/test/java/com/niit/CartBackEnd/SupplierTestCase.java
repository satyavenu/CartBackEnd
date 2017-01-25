package com.niit.CartBackEnd;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.CartBackEnd.dao.SupplierDAO;
import com.niit.CartBackEnd.dao.UserDAO;
import com.niit.CartBackEnd.model.Supplier;
import com.niit.CartBackEnd.model.User;

import junit.framework.Assert;

public class SupplierTestCase {
	@Autowired
	 static SupplierDAO supplierDAO;
	@Autowired
	 static Supplier supplier;
	
	@Autowired
	static	AnnotationConfigApplicationContext context;
	
	@BeforeClass
	public static void init()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("com.niit.CartBackEnd");
		context.refresh();
		
		supplier=(Supplier)context.getBean("supplier");
		supplierDAO=(SupplierDAO)context.getBean("supplierDAOImpl");
		
	}
	
	
@Test
	public void saveTestCase()
	{
		supplier.setName("satya");
		supplier.setAddress("hyd");
		
	Assert.assertEquals("save Test Case",true,supplierDAO.saveOrUpdate(supplier));
	}

	
		

	}


