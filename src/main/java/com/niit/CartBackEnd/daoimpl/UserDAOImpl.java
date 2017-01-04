package com.niit.CartBackEnd.daoimpl;

import java.util.List;
import javax.transaction.Transactional;

import com.niit.CartBackEnd.dao.UserDAO;
import com.niit.CartBackEnd.model.User;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class UserDAOImpl implements UserDAO
{
    @Autowired
	private SessionFactory sessionFactory;
	
    public UserDAOImpl(SessionFactory sessionFactory)
    {
    	this.sessionFactory=sessionFactory;
    }
	
    @Transactional
	public List<User> list() {
		String hql="from User";
		 Query query= sessionFactory.getCurrentSession().createQuery(hql);

		return query.list();
	}
	@Transactional
	public User get(String id) {
		return (User) sessionFactory.getCurrentSession().get(User.class,id);

		
	}
	
	
	@Transactional
    public User validate(String id, String password) {
		String hql="from User where id='"+id+"'and password='"+password+"'";
		Query  query= sessionFactory.getCurrentSession().createQuery(hql);
		return(User) query.uniqueResult();
		}
	@Transactional
	public boolean save(User user) {
		try
		{
		sessionFactory.getCurrentSession().save(user);
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	@Transactional
	public boolean update(User user) {
		try
		{
		sessionFactory.getCurrentSession().update(user);
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	



}
