package com.dilip.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

	@Autowired
	OrderRepository repository;

	public void addOrders() {
		Orders order1 = new Orders();
		order1.setOrderId(5);
		order1.setCity("HYD");
		order1.setGender("MALE");
		order1.setNoOfItems(10);
		order1.setPincode(500072);
		order1.setPrice(10000.00);
		order1.setState("TG");

		Orders order2 = new Orders();
		order2.setOrderId(6);
		order2.setCity("CHN");
		order2.setGender("FEMALE");
		order2.setNoOfItems(5);
		order2.setPincode(400000);
		order2.setPrice(5000.00);
		order2.setState("TN");

		Orders order3 = new Orders();
		order3.setOrderId(7);
		order3.setCity("HYD");
		order3.setGender("FEMALE");
		order3.setNoOfItems(6);
		order3.setPincode(500080);
		order3.setPrice(43434.00);
		order3.setState("TG");

		Orders order4 = new Orders();
		order4.setOrderId(8);
		order4.setCity("BANG");
		order4.setGender("MALE");
		order4.setNoOfItems(4);
		order4.setPincode(600000);
		order4.setPrice(3232.00);
		order4.setState("KA");

		repository.saveAll(List.of(order1, order2, order3, order4));

	}

	// get data based on city

	public void getOrdersByCityName(String cityName) {

		List<Orders> orderBasedONcIty = repository.findByCity(cityName);

		for (Orders order : orderBasedONcIty) {
			System.out.println(order);
		}

	}

	public void getOrdersByItemsCount(int no) {

		List<Orders> orderBasedONcIty = repository.findByNoOfItems(no);

		for (Orders order : orderBasedONcIty) {
			System.out.println(order);
		}

	}

	public void getDataByCityNAdGender() {

		List<Orders> orders = repository.findByCityAndGender("HYD", "FEMALE");

		for (Orders order : orders) {
			System.out.println(order);
		}

	}
	
	public void getDataByCityOrGender() {

		List<Orders> orders = repository.findByCityOrGender("DELHI", "FEMALE");

		for (Orders order : orders) {
			System.out.println(order);
		}

	}

}
