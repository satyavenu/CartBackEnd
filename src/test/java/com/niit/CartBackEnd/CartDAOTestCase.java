package com.niit.CartBackEnd;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.CartBackEnd.dao.CartDAO;
import com.niit.CartBackEnd.model.Cart;

import junit.framework.Assert;

public class CartDAOTestCase {
	@Autowired
	static CartDAO cartDAO;

	@Autowired
	static Cart cart;

	@Autowired
	static AnnotationConfigApplicationContext context;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.CartBackEnd");
		context.refresh();

		cart = (Cart) context.getBean("cart");
		cartDAO = (CartDAO) context.getBean("cartDAOImpl");

	}

	@Test
	public void  getUserTestCase1()
	{
		cart=cartDAO.getitem(248);
		Assert.assertNotNull("Get User Test Case",cart);
		
	}

}