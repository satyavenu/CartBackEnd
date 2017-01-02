package com.niit.CartBackEnd;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.niit.CartBackEnd.dao.UserDAO;
import com.niit.CartBackEnd.model.User;

public class TestUserDAo {
	@Autowired
	UserDAO userDAO;
	@Autowired
	User user;
	@Autowired
	AnnotationConfigApplicationContext context;
	
	public TestUserDAo()
	{
		context = new AnnotationConfigApplicationContext();
		//specify in which package you defined the classes->scan
		context.scan("com.niit.CartBackEnd");
		context.refresh();
		//context->bean factory
		//ask context to get the instance
		userDAO=(UserDAO)context.getBean("userDAO");
		user=(User)context.getBean("user");
	}
	public boolean validate(String id,String password)
	{
		if (userDAO.validate(id, password)==null)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public static void main(String[] args)
	{
		TestUserDAo t=new TestUserDAo();
		t.validate("niit", "niit");
	
		}
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

