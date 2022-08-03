package com.erica.model.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

import com.erica.model.Shopper;
import com.erica.model.emum.Gender;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ShopperDto {
	
	
	@JsonProperty("id_shopper")
	private String idShopper;
	
	@JsonProperty("shopper_first_name")
	@NotEmpty(message = "First name is required")
	private String shopperFirstName;
	
	@JsonProperty("shopper_surname")
	@NotEmpty(message = "Surname is required")
	private String shopperSurname;
	
	@JsonProperty("shopper_account_ref")
	@NotEmpty(message = "Account ref is required")
	private String shopperAccountRef;
	
	@JsonProperty("shopper_email_address")
	@NotEmpty(message = "Email address is required")
	private String shopperEmailAddress;
	
	@JsonProperty("date_of_birth")
	private String dateOfBirth;
	
	@JsonProperty("gender")
	private String gender;
	
	@JsonProperty("bank_balance")
	private String bankBalance;
	
	@JsonProperty("date_joined")
	private String dateJoined;

	public ShopperDto() {
		
	}

	public ShopperDto(String idShopper, String shopperFirstName, String shopperSurname, String shopperAccountRef,
			String shopperEmailAddress, String dateOfBirth, String gender, String bankBalance, String dateJoined) {
		
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
	
	
	public ShopperDto transformToDto(Shopper shopper) {
		
		var dto = new ShopperDto();
		dto.setIdShopper(shopper.getIdShopper().toString());
		dto.setShopperFirstName(shopper.getShopperFirstName());
		dto.setShopperSurname(shopper.getShopperSurname());
		dto.setShopperAccountRef(shopper.getShopperAccountRef());
		dto.setShopperEmailAddress(shopper.getShopperEmailAddress());
		dto.setDateOfBirth(shopper.getDate_of_birth().toString());
		dto.setGender(shopper.getGender().toString());
		dto.setBankBalance(shopper.getBankBalance().toString());
		dto.setDateJoined(shopper.getDateJoined().toString());
		return dto;
		
	}

	public String getIdShopper() {
		return idShopper;
	}

	public void setIdShopper(String idShopper) {
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

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBankBalance() {
		return bankBalance;
	}

	public void setBankBalance(String bankBalance) {
		this.bankBalance = bankBalance;
	}

	public String getDateJoined() {
		return dateJoined;
	}

	public void setDateJoined(String dateJoined) {
		this.dateJoined = dateJoined;
	}
	
	
	

}
