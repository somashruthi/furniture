package com.textcases;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dao.CategoryDao;
import com.domain.Category;



public class CategoryTestcases 
{
static CategoryDao categoryDao;
	
	@BeforeClass
	public static void initialize()
	{
		System.out.println("Starting into Initiailze User Test case ");
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com");
		context.refresh();
		categoryDao=(CategoryDao)context.getBean("categoryDao");
		System.out.println("Ending into Initialization user test case ");;
		
	
	}

	@Test
	public void createCategorytest()
	{
		
		System.out.println("Starting into creating User Test case ");
		
		Category category=new Category();
		category.setCid(1235);
		category.setCname("shruthi");


		assertTrue("problem in User", categoryDao.insertCategory(category));
		
		System.out.println("Ending..... into Creating Category....");
		
	}

	
}


