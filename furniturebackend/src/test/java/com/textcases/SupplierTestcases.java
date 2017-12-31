package com.textcases;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.dao.SupplierDao;
import com.domain.Supplier;

public class SupplierTestcases
{
static SupplierDao supplierDao;
	
	@BeforeClass
	public static void initialize()
	{
		System.out.println("Starting into Initiailze User Test case ");
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com");
		context.refresh();
		supplierDao=(SupplierDao)context.getBean("supplierDao");
		System.out.println("Ending into Initialization user test case ");;
		
	
	}

	@Test
	public void createSuppliertest()
	{
		
		System.out.println("Starting into creating User Test case ");
		
		Supplier supplier=new Supplier();
		supplier.setSid(1235);
		supplier.setSuppliername("shruthi");


		assertTrue("problem in User", supplierDao.insertSupplier(supplier));
		
		System.out.println("Ending..... into Creating Supplier....");
		
	}

	
}
