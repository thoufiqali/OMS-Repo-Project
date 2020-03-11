package app.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.spring.DAO.EmployeeDAO;
import app.spring.DTO.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService 
{
	@Autowired
	private EmployeeDAO objEmployeeDAO;

	@Override
	public void createEmployeeService(String name, Integer age) 
	{
		// TODO Auto-generated method stub

	}

	@Override
	public Employee getEmployeeService(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> listEmployeeService() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployeeService(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateEmployeeService(Integer id, Integer age) {
		// TODO Auto-generated method stub

	}

}
