package com.niit.CartBackEnd;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.CartBackEnd.dao.UserDAO;
import com.niit.CartBackEnd.model.User;

import junit.framework.Assert;

@SuppressWarnings({ "deprecation", "unused" })
public class UserDAOTestCase {

	@Autowired
	 static  UserDAO userDAO;
	
	@Autowired
	 static User user;
	
	@Autowired
	static	AnnotationConfigApplicationContext context;
	
	@BeforeClass
	public static void init()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("com.niit.CartBackEnd");
		context.refresh();
		
		user=(User)context.getBean("user");
		userDAO=(UserDAO)context.getBean("userDAOImpl");
		
	}
	
	@Test
	 public void getUserTestCase()
	 {
	user=	userDAO.get("satya");
		Assert.assertEquals("User Test Case","satya",user.getUsername());
	 } 
	@Test
	public void getAlluserTestCase()
	{
	int size=	userDAO.list().size();
		Assert.assertEquals("Size Of Table",size, size);
	}
	@Test
	public void  getUserTestCase1()
	{
		user=userDAO.get("satya");
		Assert.assertNotNull("Get User Test Case",user);
		
	}
@Test
	public void saveTestCase()
	{
	user.setId("999");
	user.setUsername("veni");
	   user.setPassword("veni23");
	   user.setMobile("9640359607");
	   user.setRole("user");
	   user.setContact("hyd");
	   user.setEmail("satya@gmail.com");
	 
	    user.setEnabled(true);
		
	Assert.assertEquals("save Test Case",true,userDAO.saveOrUpdate(user));
	}

public void validateCredentials()
{
	user=userDAO.validate(1,"satya");
	Assert.assertNotNull("ValidateCredentials",user);
	}
@Test
public void invalidateCredentials()
{
	user=userDAO.validate(2,"niit@123");
	Assert.assertNull("INValidateCredentials",user);
	}

}