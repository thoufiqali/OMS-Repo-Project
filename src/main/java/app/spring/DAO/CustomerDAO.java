package app.spring.DAO;

import java.util.List;

import app.spring.DTO.Customer;

public interface CustomerDAO {
	
	 public void create(String name, Integer age);
	   
	   public Customer getCustomer(Integer id);
	  
	   public List<Customer> listCustomers();
	  
	   public void delete(Integer id);
	  
	   public void update(Integer id, Integer age);

}
