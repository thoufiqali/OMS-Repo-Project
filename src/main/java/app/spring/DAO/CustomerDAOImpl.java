package app.spring.DAO;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import app.spring.DTO.Customer;
import app.spring.DTO.Employee;

public class CustomerDAOImpl implements CustomerDAO{

	 Logger logger = LoggerFactory.getLogger(CustomerDAOImpl.class);
		
		@Autowired
		private JdbcTemplate jdbcTemplateObject;
	
	public void setupDB() {
			
			jdbcTemplateObject.execute("DROP TABLE customer IF EXISTS");
			
			jdbcTemplateObject.
			execute("CREATE TABLE customer"
					+ "(" + "name VARCHAR(255), age INT, id SERIAL)");
		}
	
	@Override
	public void create(String name, Integer age) {
		String SQL = "insert into customer (name, age) values (?, ?)";
		logger.debug("Created Record Name = " + name + " Age = " + age);
		      
	 jdbcTemplateObject.update( SQL, name, age);
	 
	}

	@Override
	public Customer getCustomer(Integer id) {
		
		String SQL = "select * from customer where id = ?";
	      Customer customer = (Customer)jdbcTemplateObject.queryForObject(SQL,new Object[]{id},new CustomerMapper());
	      logger.debug("value "+customer.toString());
	      return customer;
		
	}

	@Override
	public List<Customer> listCustomers() {
		
		 String SQL = "select * from customer";
	      List <Customer> customer = jdbcTemplateObject.query(SQL, 
	                                new CustomerMapper());
	    	      logger.debug("in debug");
	      return customer;
	
	}

	@Override
	public void delete(Integer id) {
		
		 String SQL = "delete from customer where id = ?";
	      jdbcTemplateObject.update(SQL, id);
	      logger.debug("Deleted Record with ID = " + id );
	      return;
	
	}

	@Override
	public void update(Integer id, Integer age) {
		// TODO Auto-generated method stub
		 String SQL = "update customer set age = ? where id = ?";
	      jdbcTemplateObject.update(SQL, age, id);
	      logger.debug("Updated Record with ID = " + id );
	      return;
	
	}

}

