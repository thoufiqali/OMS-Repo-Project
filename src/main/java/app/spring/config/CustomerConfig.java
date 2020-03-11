package app.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import app.spring.DAO.CustomerDAOImpl;

@Configuration
//@EnableTransactionManagement
@ComponentScan({"app.spring"})

public class CustomerConfig {
//	@Bean(name="cusBean")
//	public CustomerDAOImpl emp()
//	{
//		return new CustomerDAOImpl();
//	}
}
