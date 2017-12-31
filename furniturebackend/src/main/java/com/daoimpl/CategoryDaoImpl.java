package com.daoimpl;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.dao.*;
import com.dao.CategoryDao;
import com.domain.Category;

@Repository("categoryDAO")

public class CategoryDaoImpl implements CategoryDao
{
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	public CategoryDaoImpl(SessionFactory sessionFactory)
	{
	this.sessionFactory = sessionFactory;
	}
	
	public void insertCategory(Category category)
	{
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.persist(category);
		session.getTransaction().commit();
	}

}
