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
		   
		   context=new AnnotationConfigApplicationContext();
		   context.scan("com.niit.CartBackEnd");
		   
		   context.refresh();
		   
		   userDAO=(UserDAO) context.getBean("userDAOImpl");
		   
		   user=(User)context.getBean("user");
		   
	   }
	   public boolean validate(int username,String password)
	   {
		   if(userDAO.validate(username, password)==null)
		   {
			   System.out.println("User does not exit");
			   return false;
			}
		   else
			   {
			   System.out.println("User  exit");
			   return true;
			   }
		     
	   }
	   public static void main(String args[])
	   {
		   TestUserDAo t=new TestUserDAo();
		   t.validate(1,"satya");
	   }
	
	
	
	
}
