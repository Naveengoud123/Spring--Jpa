package com.dilip.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface OrderRepository extends JpaRepository<Orders, Integer> {

	// Data based on city cloumn
	List<Orders> findByCity(String cityName);

	List<Orders> findByNoOfItems(int no);

	List<Orders> findByCityAndGender(String city, String gender);

	// get data of orders should belongs to either city or gender

	List<Orders> findByCityOrGender(String city, String gender);

	// Native SQL Query

	// SELECT * FROM orders

	// nativeQuery : default : false : JPQL :
	@Query(value = "SELECT * FROM Orders", nativeQuery = true)
	List<Orders> getOrdersInformation();

	// SELECT * FROM orders WHERE city= or gender=

	
	@Query(value = "SELECT * FROM orders WHERE city=?1 or gender=?2" , nativeQuery = true)
	List<Orders> getDataWithCityOrGender(String gender ,String city );

	
	
	//Named Query params 
	@Query(value = "SELECT * FROM orders WHERE city=:x or gender=:y" , nativeQuery = true)
	List<Orders> getOrdersWithCityOrGender( @Param("y") String gender, @Param("x") String city );
	

	@Modifying
	@Query(value = "INSERT INTO ORDERS(ORDR_ID,CITY, GENDER, NOOFITEMS, PINCODE, PRICE, STATE) values(?1,?2,?3,?4,?5,?6,?7)", nativeQuery = true)
	int addOrderInformation(int oid, String city, String gender, int noOfItems, int pincode, double price, String state);

	
	// Assignments 
   // Update : @Transactional
	// Delete  : @Transactional
	// Named Query parameters 
}
