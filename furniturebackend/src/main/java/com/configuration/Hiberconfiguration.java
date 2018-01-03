package com.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.domain.*;
import com.dao.*;
import com.daoimpl.*;
/*import com.dao.SupplierDAO;
import com.dao.UserDAO;
import com.daoimpl.SupplierDAOImpl;
import com.daoimpl.UserDAOImpl;
import com.domain.Category;
import com.domain.Supplier;
import com.domain.User;*/


@Configuration
@ComponentScan("com")
@EnableTransactionManagement

public class Hiberconfiguration
{

	
	@Bean(name="dataSource")
	public DataSource getH2Data()
	{
		DriverManagerDataSource datasource=new DriverManagerDataSource();
		
		
		datasource.setDriverClassName("org.h2.Driver");
		datasource.setUrl("jdbc:h2:tcp://localhost/~/furniturefrontend");
		datasource.setUsername("sa");
		datasource.setPassword("");
		
		return datasource;
		
		
	}
	
	private Properties getH2properties()
	{
		Properties p=new Properties();
		
		p.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		
		p.put("hibernate.hbm2ddl.auto","update");
		p.put("hibernate.show_sql","true");
		
		System.out.println("Hibernate properties created .....");
		return p;
		
		
	}
	
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory()
	{
		LocalSessionFactoryBuilder slfb=new LocalSessionFactoryBuilder(getH2Data());
		
		slfb.addProperties(getH2properties());
		
		slfb.addAnnotatedClass(User.class);
		
		slfb.addAnnotatedClass(Supplier.class);
		
		slfb.addAnnotatedClass(Category.class);
		
		slfb.addAnnotatedClass(Product.class);
		
		System.out.println("Session Factory created....");
		return slfb.buildSessionFactory();
		
	}
	
	@Bean("transactionManager")
	public HibernateTransactionManager getHibernateTransactionManager(SessionFactory sessionFactory)
	{
		return new HibernateTransactionManager(sessionFactory);
		
		
	}
	
	/*@Bean
	public UserDAO getUserDAO(SessionFactory sessionFactory)
	{
		return new UserDAOImpl(sessionFactory);
	}
	
	@Bean
	public SupplierDAO getSupplierDAO(SessionFactory sessionFactory)
	{
		return new SupplierDAOImpl(sessionFactory);
	}*/
	
}
