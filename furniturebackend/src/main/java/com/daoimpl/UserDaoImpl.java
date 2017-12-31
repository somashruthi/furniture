package com.daoimpl;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dao.UserDao;
import com.domain.User1;

@Repository("userDAO")
public class UserDaoImpl implements UserDao 
{
	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	public UserDaoImpl(SessionFactory sessionFactory)
	{
		//super();
		this.sessionFactory = sessionFactory;
	}
	
	
	@Transactional
	public boolean insertUser(User1 user1)
	{
		Session session=sessionFactory.openSession();
		
		session.beginTransaction();
		session.saveOrUpdate(user1);
		session.getTransaction().commit();
		return false;
	}
}


