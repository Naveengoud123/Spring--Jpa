package com.dilip.entity;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dilip.config.JPAConfiguration;

public class SpringCustomQueryMethods {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(JPAConfiguration.class);
		context.refresh();
		
		
		OrderService service = context.getBean(OrderService.class);
		//service.addOrders();
		//service.getOrdersByCityName("DELHI");
		
		//service.getOrdersByItemsCount(10);
		
		//service.getDataByCityNAdGender();
		service.getDataByCityOrGender();

	}

}
