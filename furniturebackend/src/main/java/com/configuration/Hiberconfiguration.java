package com.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;

public class Hiberconfiguration 
{
	@Autowired
	@Bean("name=datasource")
	public DataSource getH2Data()
	{
	DriverManagerDataSource dsource=new DriverManagerDataSource();
	dsource.setDriverClassName("");
	dsource.seturl("");
	dsource.setUsername("sa");
	dsource.setPassword(""); 
	System.out.println("h2 connected");
	return dsource;
	
}

private Properties getHiber()
{
	Properties p=new Properties();
	p.put("hibernate.dialect","org.hibernate.dialect.H2dialect");
	p.put("hibernate.hbm2ddl.auto", "update");
	p.put("hibernate.show_sql", "true");

	System.out.println("table created");
	return p;
}

	@Autowired
	@Bean(name="sessionFactory")
	public SessionFactory getHiberSession(DataSource datasource)
	{
		LocalSessionFactoryBuilder lsfb=new LocalSessionFactoryBuilder(datasource);
		lsfb.addProperties(getHiber());
		lsfb.addAnnotedClass(User1.class);
		return lsfb.buildSessionFactory();
				
	}
	
	@Autowired
	@Bean(name="transactionManager")
	public HibernateTransactionManager getTrans(SessionFactory sf)
	{
		HibernateTransactionManager tm=new HibernateTransactionManager(sf);
		return tm;
	

















}





























	
