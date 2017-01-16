package com.niit.CartBackEnd;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.CartBackEnd.dao.ProductDAO;
import com.niit.CartBackEnd.model.Product;
import com.niit.CartBackEnd.model.User;

import junit.framework.Assert;

@SuppressWarnings({ "unused", "deprecation" })
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
	product.setId("101");
	product.setName("mobile");
	product.setDescription("");
	product.setCategoryid("111");
	product.setSupplier_id("102");
	product.setPrice("8000");
	product.setDescription("Mobiles");
		
	Assert.assertEquals("save Test Case",true,productDAO.save(product));
	}

}
