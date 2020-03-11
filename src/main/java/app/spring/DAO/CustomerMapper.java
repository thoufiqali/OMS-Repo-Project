package app.spring.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import app.spring.DTO.Customer;
import app.spring.DTO.Employee;

public class CustomerMapper implements RowMapper {

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Customer customer = new Customer();
		  customer.setName(rs.getString("name"));
		  customer.setAge(rs.getInt("age"));
		  customer.setId(rs.getInt("id"));
	      return customer;
	}

}
