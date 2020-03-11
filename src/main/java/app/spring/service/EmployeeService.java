package app.spring.service;

import java.util.List;

import app.spring.DTO.Employee;

public interface EmployeeService 
{
	public void createEmployeeService(String name,Integer age);
	public Employee getEmployeeService(Integer id);
	public List<Employee> listEmployeeService();
	public void deleteEmployeeService(Integer id);
	public void updateEmployeeService(Integer id,Integer age);
}
