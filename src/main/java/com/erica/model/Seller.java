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
	private Long idseller;
	
	@Column(name= "seller_account", unique = true, nullable = false, length = 8)
	private String sellerAccount;
	
	@Column(name= "seller_name", nullable = false, length = 20)
	private String sellerName;
	
	@Column(name= "seller_address_line1", nullable = false, length = 30)
	private String sellerAddressLineOne;
	
	@Column(name= "seller_address_line2", nullable = false, length = 30)
	private String sellerAddressLineTwo;
	
	@Column(name= "seller_address_line3", nullable = false, length = 25)
	private String sellerAddressLineThree;
	
	@Column(name= "seller_county", nullable = false, length = 20)
	private String sellerCounty;
	
	@Column(name= "seller_post_code", nullable = false, length = 8)
	private String sellerPostCode;
	
	@Column(name= "seller_email_address", nullable = false, length = 35)
	private String sellerEmailAddress;

	public Seller() {
		
	}

	public Seller(String sellerAccount, String sellerName, String sellerAddressLineOne, String sellerAddressLineTwo,
			String sellerAddressLineThree, String sellerCounty, String sellerPostCode, String sellerEmailAddress) {
		super();
		this.sellerAccount = sellerAccount;
		this.sellerName = sellerName;
		this.sellerAddressLineOne = sellerAddressLineOne;
		this.sellerAddressLineTwo = sellerAddressLineTwo;
		this.sellerAddressLineThree = sellerAddressLineThree;
		this.sellerCounty = sellerCounty;
		this.sellerPostCode = sellerPostCode;
		this.sellerEmailAddress = sellerEmailAddress;
	}

	public Long getIdseller() {
		return idseller;
	}

	public void setIdseller(Long idseller) {
		this.idseller = idseller;
	}

	public String getsellerAccount() {
		return sellerAccount;
	}

	public void setsellerAccount(String sellerAccount) {
		this.sellerAccount = sellerAccount;
	}

	public String getsellerName() {
		return sellerName;
	}

	public void setsellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getsellerAddressLineOne() {
		return sellerAddressLineOne;
	}

	public void setsellerAddressLineOne(String sellerAddressLineOne) {
		this.sellerAddressLineOne = sellerAddressLineOne;
	}

	public String getsellerAddressLineTwo() {
		return sellerAddressLineTwo;
	}

	public void setsellerAddressLineTwo(String sellerAddressLineTwo) {
		this.sellerAddressLineTwo = sellerAddressLineTwo;
	}

	public String getsellerAddressLineThree() {
		return sellerAddressLineThree;
	}

	public void setsellerAddressLineThree(String sellerAddressLineThree) {
		this.sellerAddressLineThree = sellerAddressLineThree;
	}

	public String getsellerCounty() {
		return sellerCounty;
	}

	public void setsellerCounty(String sellerCounty) {
		this.sellerCounty = sellerCounty;
	}

	public String getsellerPostCode() {
		return sellerPostCode;
	}

	public void setsellerPostCode(String sellerPostCode) {
		this.sellerPostCode = sellerPostCode;
	}

	public String getsellerEmailAddress() {
		return sellerEmailAddress;
	}

	public void setsellerEmailAddress(String sellerEmailAddress) {
		this.sellerEmailAddress = sellerEmailAddress;
	}

}
