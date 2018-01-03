package com.furniturebackend;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dao.CategoryDAO;
import com.domain.Category;



public class CategoryTestcases 
{
static CategoryDAO categoryDAO;
	
	@BeforeClass
	public static void initialize()
	{
		System.out.println("Starting into Initiailze User Test case ");
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com");
		context.refresh();
		categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
		System.out.println("Ending into Initialization user test case ");
		
	
	}

	@Test
	public void createCategorytest()
	{
		
		System.out.println("Starting into creating User Test case ");
		
		Category category=new Category();
		category.setCid(1235);
		category.setCname("shruthi");


		assertTrue("problem in Category", categoryDAO.addCategory(category));
		
		System.out.println("Ending..... into Creating Category....");
		
	}

	
}

