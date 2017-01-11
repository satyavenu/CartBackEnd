package com.niit.CartBackEnd.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.CartBackEnd.dao.ProductDAO;
import com.niit.CartBackEnd.model.Product;
import com.niit.CartBackEnd.model.User;

@Repository
public class ProductDAOImpl implements ProductDAO {
	private static final Logger log = LoggerFactory.getLogger(ProductDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	

	@Transactional
	public boolean save(Product product) {
		try {
			log.debug("Save method Is Starting...........S......! ");
			sessionFactory.getCurrentSession().save(product);
			log.debug("Save Method is Ending.........S.......!");
			return true;
		} catch (Exception e) {
			log.info("Exception Occureing save Method....S......!" + e.getMessage());
			e.printStackTrace();
			return false;
		}
	}

	@Transactional
	public boolean update(Product product) {

		try {
			log.debug("Update method Is Starting..........U.......! ");
			sessionFactory.getCurrentSession().save(product);
			log.debug("update Method is Ending.........U.......!");
			return true;

		} catch (Exception e) {
			log.info("Exception Occureing Update Method......U.....!" + e.getMessage());
			e.printStackTrace();
			return false;
		}
	}

	@Transactional
	public boolean delete(Product product) {
		try {
			log.debug("Delete method Is Starting..........D.......! ");
			sessionFactory.getCurrentSession().save(product);
			log.debug("Delete Method is Ending.........D.......!");
			return true;
		} catch (Exception e) {
			log.info("Exception Occureing Delete Method......D.....!" + e.getMessage());
			e.printStackTrace();
			return false;
		}
	}

	public List<User> list() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> getproduct(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean saveOrUpdate(Product product) {
		// TODO Auto-generated method stub
		return false;
	}
	
}