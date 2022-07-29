package com.erica.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name ="shoppers")
public class Shopper implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -621268214961734378L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long idShopper;
	
	@Column(name= "shopper_first_name")
	String shopperFirstName;
	
	@Column(name = "shopper_surname")
	String shopperSurname;
	
	@Column(name= "shopper_account_ref")
	String shopperAccountRef;
	
	@Column(name="shopper_email_address")
	String shopperEmailAddress;
	
	@Column(name="date_of_birth")
	LocalDate date_of_birth;
	
	@Column(name= "gender")
	Character gender;
	
	@Column(name= "date_joined")
	LocalDate dateJoined;

	public Shopper() {
		
	}

	public Shopper(String shopperFirstName, String shopperSurname, String shopperAccountRef,
			String shopperEmailAddress, LocalDate date_of_birth, Character gender, LocalDate dateJoined) {
		this.shopperFirstName = shopperFirstName;
		this.shopperSurname = shopperSurname;
		this.shopperAccountRef = shopperAccountRef;
		this.shopperEmailAddress = shopperEmailAddress;
		this.date_of_birth = date_of_birth;
		this.gender = gender;
		this.dateJoined = dateJoined;
	}

	public Long getIdShopper() {
		return idShopper;
	}

	public void setIdShopper(Long idShopper) {
		this.idShopper = idShopper;
	}

	public String getShopperFirstName() {
		return shopperFirstName;
	}

	public void setShopperFirstName(String shopperFirstName) {
		this.shopperFirstName = shopperFirstName;
	}

	public String getShopperSurname() {
		return shopperSurname;
	}

	public void setShopperSurname(String shopperSurname) {
		this.shopperSurname = shopperSurname;
	}

	public String getShopperAccountRef() {
		return shopperAccountRef;
	}

	public void setShopperAccountRef(String shopperAccountRef) {
		this.shopperAccountRef = shopperAccountRef;
	}

	public String getShopperEmailAddress() {
		return shopperEmailAddress;
	}

	public void setShopperEmailAddress(String shopperEmailAddress) {
		this.shopperEmailAddress = shopperEmailAddress;
	}

	public LocalDate getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(LocalDate date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public LocalDate getDateJoined() {
		return dateJoined;
	}

	public void setDateJoined(LocalDate dateJoined) {
		this.dateJoined = dateJoined;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
