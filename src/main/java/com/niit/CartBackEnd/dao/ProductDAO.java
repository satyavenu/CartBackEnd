
package com.niit.CartBackEnd.dao;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.niit.CartBackEnd.model.Product;
import com.niit.CartBackEnd.model.User;

@Repository
public interface ProductDAO {
	public List<User> list();
	public List<Product> getproduct(int id);
	

	public boolean saveOrUpdate(Product product);
	
	public boolean delete(Product product);
	public boolean save(Product product);
	public Object get(int id);
		
	
}
