package com.erica.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.erica.model.emum.Gender;


@Entity(name ="shoppers")
public class Shopper implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -621268214961734378L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idShopper;
	
	@Column(name= "shopper_first_name", nullable = false, length=15)
	private String shopperFirstName;
	
	@Column(name = "shopper_surname", nullable = false, length=20)
	private String shopperSurname;
	
	@Column(name= "shopper_account_ref", nullable = false, length=8, unique=true)
	private String shopperAccountRef;
	
	@Column(name="shopper_email_address", nullable = false)
	private String shopperEmailAddress;
	
	@Column(name="date_of_birth")
	private LocalDate dateOfBirth;
	
	@Column(name= "gender", length=1)
	private Gender gender;
	
	@Column(name= "bank_balance", precision = 6, scale = 2)
	private BigDecimal bankBalance;
	
	@Column(name= "date_joined", nullable = false)
	private LocalDate dateJoined;

	public Shopper() {
		
	}



	public Shopper(Long idShopper, String shopperFirstName, String shopperSurname, String shopperAccountRef,
			String shopperEmailAddress, LocalDate dateOfBirth, Gender gender, BigDecimal bankBalance,
			LocalDate dateJoined) {
		super();
		this.idShopper = idShopper;
		this.shopperFirstName = shopperFirstName;
		this.shopperSurname = shopperSurname;
		this.shopperAccountRef = shopperAccountRef;
		this.shopperEmailAddress = shopperEmailAddress;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.bankBalance = bankBalance;
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
		return dateOfBirth;
	}

	public void setDate_of_birth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public LocalDate getDateJoined() {
		return dateJoined;
	}

	public void setDateJoined(LocalDate dateJoined) {
		this.dateJoined = dateJoined;
	}



	public BigDecimal getBankBalance() {
		return bankBalance;
	}



	public void setBankBalance(BigDecimal bankBalance) {
		this.bankBalance = bankBalance;
	}
	
	
	

}
