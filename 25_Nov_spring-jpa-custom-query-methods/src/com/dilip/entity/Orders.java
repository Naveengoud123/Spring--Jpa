package com.dilip.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//orderid PK  price noOfItems  city  state pincode gender  

@Entity
//class name becomes table name 
@Table
public class Orders {

	@Id
	@Column(name = "ordr_id")
	private Integer orderId;

	// @Column(name="price")
	@Column
	private Double price;

	// no_Of_Items
	@Column
	private int noOfItems;

	@Column
	private String city;

	@Column
	private String state;

	@Column(name = "pincode")
	private int pincode;

	@Column(name = "gender")
	private String gender;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	
	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getNoOfItems() {
		return noOfItems;
	}

	public void setNoOfItems(int noOfItems) {
		this.noOfItems = noOfItems;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", price=" + price + ", noOfItems=" + noOfItems + ", city=" + city
				+ ", state=" + state + ", pincode=" + pincode + ", gender=" + gender + "]";
	}

	
}
