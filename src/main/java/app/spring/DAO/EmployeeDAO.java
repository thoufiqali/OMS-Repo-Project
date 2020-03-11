package app.spring.DAO;

import java.util.List;

import app.spring.DTO.Employee;

public interface EmployeeDAO {
	
	  public void create(String name, Integer age);
	   
	   public Employee getEmployee(Integer id);
	  
	   public List<Employee> listEmployees();
	  
	   public void delete(Integer id);
	  
	   public void update(Integer id, Integer age);


}
