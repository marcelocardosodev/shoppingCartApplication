package com.erica.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name= "sellers")
public class Seller implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6851896358613231159L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idSaller;
	
	@Column(name= "saller_account", unique = true, nullable = false, length = 8)
	private String sallerAccount;
	
	@Column(name= "saller_name", nullable = false, length = 20)
	private String sallerName;
	
	@Column(name= "saller_address_line1", nullable = false, length = 30)
	private String sallerAddressLineOne;
	
	@Column(name= "saller_address_line2", nullable = false, length = 30)
	private String sallerAddressLineTwo;
	
	@Column(name= "saller_address_line3", nullable = false, length = 25)
	private String sallerAddressLineThree;
	
	@Column(name= "saller_county", nullable = false, length = 20)
	private String sallerCounty;
	
	@Column(name= "saller_post_code", nullable = false, length = 8)
	private String sallerPostCode;
	
	@Column(name= "saller_email_address", nullable = false, length = 35)
	private String sallerEmailAddress;

	public Seller() {
		
	}

	public Seller(String sallerAccount, String sallerName, String sallerAddressLineOne, String sallerAddressLineTwo,
			String sallerAddressLineThree, String sallerCounty, String sallerPostCode, String sallerEmailAddress) {
		super();
		this.sallerAccount = sallerAccount;
		this.sallerName = sallerName;
		this.sallerAddressLineOne = sallerAddressLineOne;
		this.sallerAddressLineTwo = sallerAddressLineTwo;
		this.sallerAddressLineThree = sallerAddressLineThree;
		this.sallerCounty = sallerCounty;
		this.sallerPostCode = sallerPostCode;
		this.sallerEmailAddress = sallerEmailAddress;
	}

	public Long getIdSaller() {
		return idSaller;
	}

	public void setIdSaller(Long idSaller) {
		this.idSaller = idSaller;
	}

	public String getSallerAccount() {
		return sallerAccount;
	}

	public void setSallerAccount(String sallerAccount) {
		this.sallerAccount = sallerAccount;
	}

	public String getSallerName() {
		return sallerName;
	}

	public void setSallerName(String sallerName) {
		this.sallerName = sallerName;
	}

	public String getSallerAddressLineOne() {
		return sallerAddressLineOne;
	}

	public void setSallerAddressLineOne(String sallerAddressLineOne) {
		this.sallerAddressLineOne = sallerAddressLineOne;
	}

	public String getSallerAddressLineTwo() {
		return sallerAddressLineTwo;
	}

	public void setSallerAddressLineTwo(String sallerAddressLineTwo) {
		this.sallerAddressLineTwo = sallerAddressLineTwo;
	}

	public String getSallerAddressLineThree() {
		return sallerAddressLineThree;
	}

	public void setSallerAddressLineThree(String sallerAddressLineThree) {
		this.sallerAddressLineThree = sallerAddressLineThree;
	}

	public String getSallerCounty() {
		return sallerCounty;
	}

	public void setSallerCounty(String sallerCounty) {
		this.sallerCounty = sallerCounty;
	}

	public String getSallerPostCode() {
		return sallerPostCode;
	}

	public void setSallerPostCode(String sallerPostCode) {
		this.sallerPostCode = sallerPostCode;
	}

	public String getSallerEmailAddress() {
		return sallerEmailAddress;
	}

	public void setSallerEmailAddress(String sallerEmailAddress) {
		this.sallerEmailAddress = sallerEmailAddress;
	}

}
