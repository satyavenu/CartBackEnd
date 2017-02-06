package com.niit.CartBackEnd;
import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.CartBackEnd.dao.CartDAO;
import com.niit.CartBackEnd.dao.CategoryDAO;
import com.niit.CartBackEnd.dao.CheckoutDAO;
import com.niit.CartBackEnd.dao.ProductDAO;
import com.niit.CartBackEnd.dao.SupplierDAO;
import com.niit.CartBackEnd.dao.UserDAO;
import com.niit.CartBackEnd.daoimpl.CartDAOImpl;
import com.niit.CartBackEnd.daoimpl.CategoryDAOImpl;
import com.niit.CartBackEnd.daoimpl.CheckoutDAOImpl;
import com.niit.CartBackEnd.daoimpl.ProductDAOImpl;
import com.niit.CartBackEnd.daoimpl.SupplierDAOImpl;
import com.niit.CartBackEnd.daoimpl.UserDAOImpl;
import com.niit.CartBackEnd.model.Cart;
import com.niit.CartBackEnd.model.Category;
import com.niit.CartBackEnd.model.Checkout;
import com.niit.CartBackEnd.model.Product;
import com.niit.CartBackEnd.model.Supplier;
import com.niit.CartBackEnd.model.User;





@Configuration
@ComponentScan("com.niit.CartBackEnd")
@EnableTransactionManagement
public class ApplicationContextConfig {

		
		
		@Bean(name = "dataSource")
		public DataSource getDataSource() {
			DriverManagerDataSource dataSource = new DriverManagerDataSource();
			dataSource.setDriverClassName("org.h2.Driver");
			dataSource.setUrl("jdbc:h2:tcp://localhost/~/test");
			dataSource.setUsername("sa");
			dataSource.setPassword("sa");
			System.out.println("Datasource");
			return dataSource;

		}

		private Properties getHibernateProperties() {
			Properties properties = new Properties();
			properties.put("hibernate.show_sql", "true");
			properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
			properties.put("hibernate.hbm2ddl.auto", "update");
			System.out.println("Hibernate Properties");
			return properties;

		}

		@Autowired
		@Bean(name = "sessionFactory")
		public SessionFactory getSessionFactory(DataSource dataSource) {
			LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
			sessionBuilder.addProperties(getHibernateProperties());
		    sessionBuilder.addAnnotatedClasses(User.class);
		    sessionBuilder.addAnnotatedClasses(Supplier.class);
		    sessionBuilder.addAnnotatedClasses(Product.class);
		    sessionBuilder.addAnnotatedClasses(Category.class);
		    sessionBuilder.addAnnotatedClasses(Cart.class);
		    sessionBuilder.addAnnotatedClasses(Checkout.class);
			System.out.println("Session");
			
			return sessionBuilder.buildSessionFactory();
			
		}

		@Autowired
		@Bean(name = "transactionManager")
		public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
			HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
			System.out.println("Transaction");
			return transactionManager;
		}
/*		@Autowired
		@Bean(name = "userDAO")
		public UserDAO getUserDao(SessionFactory sessionFactory){
					return  new UserDAOImpl(sessionFactory);
		}
		
		@Autowired
		@Bean(name = "supplierDAO")
		public SupplierDAO getsupplierDao(SessionFactory sessionFactory){
					return  new SupplierDAOImpl(sessionFactory);
		}
				
		
		@Autowired
		@Bean(name = "categoryDAO")
		public CategoryDAO getcategoryDao(SessionFactory sessionFactory){
					return  new CategoryDAOImpl(sessionFactory);
		}*/
		@Autowired
		@Bean(name = "productDAO")
		public ProductDAO getproductDao(SessionFactory sessionFactory){
					return  new ProductDAOImpl(sessionFactory);
		}
		@Autowired
		@Bean(name = "cartDAO")
		public CartDAO getcartDao(SessionFactory sessionFactory){
					return  new CartDAOImpl(sessionFactory);
		}
		@Autowired
		@Bean(name = "CheckoutDAO")
		public CheckoutDAO getcheckoutDao(SessionFactory sessionFactory){
					return  new CheckoutDAOImpl(sessionFactory);
		}
			
}