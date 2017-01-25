
package com.niit.CartBackEnd.dao;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.niit.CartBackEnd.model.Product;


@Repository
public interface ProductDAO {
	public List<Product> list();

	public Product get(int id);

	public boolean saveOrUpdate(Product product);

	public boolean update(Product product);

	public boolean delete(Product product);

	public List<Product> getproduct(int id);

	public List<Product> navproduct(int id);
		
	
}
