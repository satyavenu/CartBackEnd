package com.niit.CartBackEnd;


import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.CartBackEnd.dao.UserDAO;
import com.niit.CartBackEnd.model.User;



public class UserDAOTestCase {

	@Autowired
	 static UserDAO userDAO;
	
	@Autowired
	static User user;
	
	@Autowired
	static AnnotationConfigApplicationContext context;
	
	//previously we written constructor
	//but in junit we need to write a method
	@BeforeClass
	public static void  init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.CartBackEnd");
		
		context.refresh();
		 user=(User)context.getBean("user");
		 userDAO=(UserDAO)context.getBean("userDAOImpl");
	}
	/*@Test
	public void getUserTestCase()
	{
		user=userDAO.get("niit");
		//assert statements
		Assert.assertNotNull("UserTestCase",user.getName());
		
		
	}
*/
	@Test
	public void validateCredentials()
	{
		user=   userDAO.validate("niit","niit");
		Assert.assertEquals("Invalid TestCAse",user,user);
		
		
	}
	
	public void getAllUserTestCase()
	{
	
	int size=userDAO.list().size();
	
	Assert.assertEquals("length check",8,size);
	}


@Test	
public void saveTestCase()
{
	user.setId("1097");
	user.setName("pallavi");
	user.setPassword("satya");
	user.setMobile("8106393169");
	user.setRole("role_user");
	user.setContact("hyd");
	user.setMail("satyaveni@gmail.com");
	Assert.assertEquals("saveTestCase",true, userDAO.save(user));
}
}
