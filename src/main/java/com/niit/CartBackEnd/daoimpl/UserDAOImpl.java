package com.niit.CartBackEnd.daoimpl;

import com.niit.CartBackEnd.dao.UserDAO;

public class UserDAOImpl implements UserDAO {
	
	public boolean isValidCredentials(String id,String password){
			
		if(id.equals("niit")&&password.equals("niit@123"))
		{
			return true;
				}
		else
		{
			return false;
		}
		}

	}



