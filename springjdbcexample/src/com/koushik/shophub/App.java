package com.koushik.shophub;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dom.jagadish.com.ProjectProduct.DAO.ProductDAOImpl;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		ProductDAOImpl dao = (ProductDAOImpl)context.getBean("productdao");
		System.out.println("Data Added");
		dao.add(new Product(101, "Shirt", 400));
		dao.add(new Product(102, "Pant", 500));
		dao.add(new Product(103, "T-Shirt", 300));
		System.out.println("Data Deleted");
		dao.remove(103);
		System.out.println("Data Updated");
		dao.update(new Product(102, "Short", 150));
		dao.getAll();

		List<Product> list = dao.getAll();

		for (Product product : list)
			System.out.println(product);
	}
}
/*CREATE TABLE PRODUCTS(PRODUCT_ID INTEGER NOT NULL PRIMARY KEY,
PRODUCT_NAME VARCHAR(30),PRODUCT_PRICE NUMERIC(20,3) NOT NULL);*/

