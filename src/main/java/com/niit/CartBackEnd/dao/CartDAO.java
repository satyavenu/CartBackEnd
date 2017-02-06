package com.niit.CartBackEnd.dao;

import java.util.List;

import com.niit.CartBackEnd.model.Cart;

public interface CartDAO {
	public List<Cart> list();

	public boolean saveorupdate(Cart cart);

	public boolean update(Cart cart);

	public boolean delete(Cart cart);

	public List<Cart> get(int userid);
	
	public Cart getitem(int cartId);

	public Cart getproduct(int id,int userid);
	
	//public Cart getproduct(int cartid);

	public long Cartsize(int userId);

	public long CartPrice(int userId);

	public void pay(int userId);
	}
