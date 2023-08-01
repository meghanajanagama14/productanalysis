package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.Product;
import com.ProductDB;
import com.ProductInformationSystem;

import static org.mockito.Mockito.*;
public class ProductInformationTest {

	@Test
	public void testGetProductInfo() {
	
		
		ProductDB productDB=mock(ProductDB.class);
		Product obj=new Product(1,"coffee",23);
		Product obj1=new Product(2,"espresso",100);
		when(productDB.getProduct(1)).thenReturn(obj);
		when(productDB.getProduct(2)).thenReturn(obj1);
		
		ProductInformationSystem prSystem=new ProductInformationSystem(productDB);
		Product product=prSystem.getProductInfo(1);
		String productName=product.getProductName();
        float price=product.getPrice();
        assertEquals("coffee",productName);
	}

}
