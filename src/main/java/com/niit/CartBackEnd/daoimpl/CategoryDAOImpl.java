package com.niit.CartBackEnd.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.CartBackEnd.dao.CategoryDAO;
import com.niit.CartBackEnd.model.Category;

@Repository
public class CategoryDAOImpl implements CategoryDAO {

	private static final Logger log = LoggerFactory.getLogger(ProductDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	public CategoryDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public boolean save(Category category) {
		try {
			log.debug("Save method Is Starting ");
			sessionFactory.getCurrentSession().save(category);
			log.debug("Save Method is Ending");
			return true;
		} catch (Exception e) {
			log.info("Exception Occureing save Method" + e.getMessage());
			e.printStackTrace();
			return false;
		}
	}

	@Transactional
	public boolean update(Category category) {
		try {
			log.debug("Update method Is Starting ");
			sessionFactory.getCurrentSession().save(category);
			log.debug("update Method is Ending");
			return true;

		} catch (Exception e) {
			log.info("Exception Occureing Update Method" + e.getMessage());
			e.printStackTrace();
			return false;
		}
	}

	public List<Category> list() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	public Category get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean delete(Category category) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean saveorupdate(Category category) {
		// TODO Auto-generated method stub
		return false;
	}
}