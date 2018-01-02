package com.furniturebackend;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dao.ProductDAO;
import com.domain.Product;



public class ProductTestcases
{
	
static ProductDAO productDAO;
	
	@BeforeClass
	public static void initialize()
	{
		System.out.println("Starting into Initiailze User Test case ");
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com");
		context.refresh();
		productDAO=(ProductDAO)context.getBean("productDAO");
		System.out.println("Ending into Initialization user test case ");;
		
	
	}

	@Test
	public void createProducttest()
	{
		
		System.out.println("Starting into creating User Test case ");
		
		Product product=new Product();
		product.setPid(1238);
		product.setPname("sweety");
		product.setPrice(458.9);
		product.setDescription("in progress");
		product.setStock(25);
		

		assertTrue("problem in User", productDAO.addProduct(product));
		
		System.out.println("Ending..... into Creating Category....");
		
	}

	
}
