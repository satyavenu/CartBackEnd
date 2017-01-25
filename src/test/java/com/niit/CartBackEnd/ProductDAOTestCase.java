package com.niit.CartBackEnd;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.CartBackEnd.dao.ProductDAO;
import com.niit.CartBackEnd.model.Product;
import com.niit.CartBackEnd.model.User;

import junit.framework.Assert;

public class ProductDAOTestCase {
	
	@Autowired
	 static  ProductDAO productDAO;
	
	@Autowired
	 static Product product;
	
	@Autowired
	static	AnnotationConfigApplicationContext context;
	
	@BeforeClass
	public static void init()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("com.niit.CartBackEnd");
		context.refresh();
		
		product=(Product)context.getBean("product");
		productDAO=(ProductDAO)context.getBean("productDAOImpl");
		
	}
	  
	
@Test
	public void saveTestCase()
	{
	product.setName("mobile");
	product.setDescription("mobile");
	product.setCategory_id(10);
	product.setSupplier_id(10);
	product.setPrice(100000);
	product.setDescription("mobile sale");
		
	Assert.assertEquals("save Test Case",true,productDAO.saveOrUpdate(product));
	}

}
