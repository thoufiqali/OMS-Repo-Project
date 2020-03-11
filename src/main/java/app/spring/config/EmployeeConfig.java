package app.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import app.spring.DAO.EmployeeDAOImpl;

@Configuration
//@EnableTransactionManagement
@ComponentScan({"app.spring"})
public class EmployeeConfig {

//	@Bean(name="empBean")
//	public EmployeeDAOImpl emp()
//	{
//		return new EmployeeDAOImpl();
//	}


}
