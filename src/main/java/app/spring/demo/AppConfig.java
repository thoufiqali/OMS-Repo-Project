package app.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import app.spring.DAO.EmployeeDAOImpl;
import app.spring.config.CustomerConfig;
import app.spring.config.EmployeeConfig;
@EnableWebMvc
@EnableAutoConfiguration
@Configuration
@ComponentScan({ "app.spring.service" })
@PropertySource("classpath:database.properties")
@Import({ EmployeeConfig.class, CustomerConfig.class })
public class AppConfig {

//	@Bean
//	   ServletRegistrationBean h2servletRegistration(){
//	   ServletRegistrationBean registrationBean = new 
//			   ServletRegistrationBean( new WebServlet());
//	    registrationBean.addUrlMappings("/console/*");
//	     return registrationBean;
//}	 

	@Autowired
	Environment environment;
	Logger logger = LoggerFactory.getLogger(AppConfig.class);
	private final String URL = "url";
	private final String USER = "user";
	private final String DRIVER = "driverClassName";
	private final String PASSWORD = "password";

	@Bean
	@Autowired
	DataSource dataSource_mydb() {
		logger.debug("in data source");
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUrl(environment.getProperty(URL));
		driverManagerDataSource.setUsername(environment.getProperty(USER));
		driverManagerDataSource.setPassword(environment.getProperty(PASSWORD));
		driverManagerDataSource.setDriverClassName(environment.getProperty(DRIVER));
		return driverManagerDataSource;
	}

	@Bean
	@Autowired
	@Qualifier("dataSource_mydb")
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		logger.debug("in data ");
		return new JdbcTemplate(dataSource);
	}
	
	
}