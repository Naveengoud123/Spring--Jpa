package com.dilip.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

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
	List<Orders> getDataWithCityOrGender(String city, String gender);

	
	
	//Named Query params 
	@Query(value = "SELECT * FROM orders WHERE city=:cityName or gender=:gender" , nativeQuery = true)
	List<Orders> getOrdersWithCityOrGender(@Param("cityName") String city , @Param("gender") String gender);
	
	
	
	
	
	
	
	
	
	// JPQL -> SQL -> Excute
	// @Query(value="SELECT a FROM address", nativeQuery = false )

}
