package com.niit.CartBackEnd.dao;

import java.util.List;

import com.niit.CartBackEnd.model.Checkout;

public interface CheckoutDAO {
	public boolean saveOrUpdate(Checkout checkout);

	public boolean delete(Checkout checkout);

	public List<Checkout> list();

	public Checkout get(int id);
}

