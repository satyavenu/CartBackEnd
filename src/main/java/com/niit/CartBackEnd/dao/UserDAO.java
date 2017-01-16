package com.niit.CartBackEnd.dao;

import java.util.List;

import com.niit.CartBackEnd.model.User;

public interface UserDAO {

	public List<User> list();

	public User get(String id);

	public User validate(String id, String password);

	public boolean save(User user);

	public boolean update(User user);

	public boolean saveOrUpdate(User user);

}
