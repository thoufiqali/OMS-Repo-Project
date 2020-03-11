package app.spring.restcontroller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.ResourceAccessException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import app.spring.DTO.Employee;
import app.spring.service.EmployeeService;

@RestController
//@RequestMapping("/employee")
public class EmployeeController 
{
	
	Logger logger=LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	private EmployeeService refEmployeeService;

	@RequestMapping(value = "/fetchall", method = RequestMethod.GET)
	public List<Employee> getAllEmployee() 
	{
		return refEmployeeService.listEmployeeService();
	}
	@RequestMapping(value ="/employee/{id}",method=RequestMethod.GET)
	public Employee getEmployeeService(@PathVariable("Employee id") Integer employeeId)
	{
		logger.debug("ID of Employee -----",+employeeId);
		return refEmployeeService.getEmployeeService(employeeId);
		
	}
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	
	
	
	public ResponseEntity<Void> deleteEmployeeService(@PathVariable("Employee Id")Integer employeeId)
	{
		try
		{
			refEmployeeService.deleteEmployeeService(employeeId);
			return ResponseEntity.ok().build();
		}
		catch(ResourceAccessException e)
		{
			return ResponseEntity.notFound().build();
		}
	}

}
