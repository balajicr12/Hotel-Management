package com.example.hotelmanagemenet.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Customer {
	@Id
	private Integer roomId;
	private String name;
	private String singlebedordoublebed;
	private String persons;
	private String howmanynights;
	private String foodbuffet;
	private String phonenumber;
	private String price;
	public Integer getRoomId() {
		return roomId;
	}
	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSinglebedordoublebed() {
		return singlebedordoublebed;
	}
	public void setSinglebedordoublebed(String singlebedordoublebed) {
		this.singlebedordoublebed = singlebedordoublebed;
	}
	public String getPersons() {
		return persons;
	}
	public void setPersons(String persons) {
		this.persons = persons;
	}
	public String getHowmanynights() {
		return howmanynights;
	}
	public void setHowmanynights(String howmanynights) {
		this.howmanynights = howmanynights;
	}
	public String getFoodbuffet() {
		return foodbuffet;
	}
	public void setFoodbuffet(String foodbuffet) {
		this.foodbuffet = foodbuffet;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	

}
