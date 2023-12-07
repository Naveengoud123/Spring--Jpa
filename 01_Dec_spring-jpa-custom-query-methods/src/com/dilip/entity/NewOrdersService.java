package com.dilip.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NewOrdersService {

	@Autowired
	OrderRepository repository;

	public int addOrderInformation() {
													//int oid, String city, String gender, int noOfItems, int pincode, double price, String state
		int noFoRowsInserted = repository.addOrderInformation(206, "HYD","FEMALE", 15, 500072, 30000, "TS");
		
		System.out.println("No OF Rows inserted : "+noFoRowsInserted);
		
		return noFoRowsInserted; 
	}

}
