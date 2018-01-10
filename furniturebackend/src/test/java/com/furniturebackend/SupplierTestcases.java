package com.furniturebackend;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SupplierTestcases
{
/*	
	
	static SupplierDAO supplierDAO;
	
	@BeforeClass
	public static void initialize()
	{
		System.out.println("Starting into Initiailze Supplier Test case ");
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com");
		context.refresh();
		supplierDAO=(SupplierDAO)context.getBean("supplierDAO");
		System.out.println("Ending into Initialization user test case ");;
		
	
	}

	@Test
	public void createSupplierTest()
	{
		
		System.out.println("Starting into creating Supplier Test case ");
		
		Supplier supplier=new Supplier();
		supplier.setSid(5678);
		supplier.setSuppliername("sweety");


		assertTrue("problem in Supplier", supplierDAO.addSupplier(supplier));
		
		System.out.println("Ending..... into Creating Supplier....");
		
	}

	*/
}
