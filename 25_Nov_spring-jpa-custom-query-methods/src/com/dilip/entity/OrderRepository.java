package com.dilip.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orders, Integer> {

	// Data based on city cloumn
	List<Orders> findByCity(String cityName);

	List<Orders> findByNoOfItems(int no);
	
	List<Orders> findByCityAndGender(String city, String gender);
	
	//get data of orders should belongs to either city or gender
	
	List<Orders> findByCityOrGender(String city, String gender);

}
