package com.textcases;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dao.UserDao;
import com.domain.User1;

public class UserTestcases
{
	
static UserDao userDao;
	
    @BeforeClass
	public static void initialize()
	{
		System.out.println("Starting into Initiailze User Test case ");
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com");
		context.refresh();
		userDao=(UserDao)context.getBean("userDao");
		System.out.println("Ending into Initialization user test case ");;
		
	
	}

	@Test
	public void createUserTest()
	{
		
		System.out.println("Starting into creating User Test case ");
		User1 user=new User1();
		
		user.setEmail("sruthi@gmail.com");
		user.setName("sruthi");
		user.setPassword("welcome");
		user.setPhone("92345222");
		user.setRole("ROLE_ADMIN");
		user.setAddress("Dilsuknagar,Hyderabad");
		user.setEnabled(true);
				
		assertTrue("problem in User", userDao.insertUser(user));
		
		System.out.println("Ending..... into Createing User....");
		
	}
                                                                                                                                                                                                        
}

