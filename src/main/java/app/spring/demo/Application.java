package app.spring.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import app.spring.DAO.EmployeeDAOImpl;
import app.spring.DTO.Employee;

@EnableWebMvc
@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		//ApplicationContext context = 
				SpringApplication.run(AppConfig.class, args);
	/*	EmployeeDAOImpl objEmployeeDAOImpl = (EmployeeDAOImpl) context.getBean("empBean");
		runEmployeeCURD(objEmployeeDAOImpl);
	}*/
	}

	/*
	 * public static void runEmployeeCURD(EmployeeDAOImpl objEmployeeDAOImpl) {
	 * 
	 * // create the employee data
	 * 
	 * // objEmployeeDaoImplement.setupDB();
	 * 
	 * System.out.println("------Records Creation--------");
	 * objEmployeeDAOImpl.create("siddu", 11); objEmployeeDAOImpl.create("bano", 2);
	 * objEmployeeDAOImpl.create("gridhar", 15);
	 * 
	 * System.out.println("------Listing Multiple Records--------"); List<Employee>
	 * employees = objEmployeeDAOImpl.listEmployees(); for (Employee record :
	 * employees) { System.out.print("ID : " + record.getId());
	 * System.out.print(", Name : " + record.getName());
	 * System.out.println(", Age : " + record.getAge()); }
	 * 
	 * }
	 */
}
