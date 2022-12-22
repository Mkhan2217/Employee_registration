package com.skyhigh.employeeregistration.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
@ComponentScan(value = "com.skyhigh.employeeregistration")
public class AppConfiguration {
	@Bean
	public ModelMapper getModelMapperObject() {
		return new ModelMapper();
		}
	@Bean
	public LocalSessionFactoryBean getseSessionFactoryBean() {
		LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
		localSessionFactoryBean.setDataSource(getDataSource());
		localSessionFactoryBean.setPackagesToScan("com.skyhigh.employeeregistration");
		Properties properties = new Properties();
		properties.setProperty("hibernate.show_sql", "true");
		properties.setProperty("hibernate.hbm2ddl.auto", "update");
		properties.setProperty("hibernate.dialect","org.hibernate.dialect.MySQLDialect");
		localSessionFactoryBean.setHibernateProperties(properties);
		
		return localSessionFactoryBean;
		}
	
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("root");
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/kaliya");
		driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
		
		return driverManagerDataSource;
	}

}
