package com.erica.model.dto;

import javax.validation.constraints.NotEmpty;

import com.erica.model.Seller;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SellerDto {
	
	@JsonProperty("id")
	private String idseller;
	
	@NotEmpty(message = "Account is required")
	@JsonProperty("seller_account")
	private String sellerAccount;
	
	@NotEmpty(message = "Name is required")
	@JsonProperty("seller_name")
	private String sellerName;
	
	@NotEmpty(message = "Address line one is required")
	@JsonProperty("seller_address_line1")
	private String sellerAddressLineOne;
	
	@NotEmpty(message = "Address line two is required")
	@JsonProperty("seller_address_line2")
	private String sellerAddressLineTwo;
	
	@NotEmpty(message = "Address line three is required")
	@JsonProperty("seller_address_line3")
	private String sellerAddressLineThree;
	
	@NotEmpty(message = "County is required")
	@JsonProperty("seller_county")
	private String sellerCounty;
	
	@NotEmpty(message = "Post_code is required")
	@JsonProperty("seller_post_code")
	private String sellerPostCode;
	
	@NotEmpty(message = "Email_address is required")
	@JsonProperty("seller_email_address")
	private String sellerEmailAddress;

	public SellerDto() {
		
	}

	public SellerDto(String idseller, String sellerAccount,	String sellerName, String sellerAddressLineOne,
			String sellerAddressLineTwo, String sellerAddressLineThree, String sellerCounty,
			String sellerPostCode, String sellerEmailAddress) {
		
		this.idseller = idseller;
		this.sellerAccount = sellerAccount;
		this.sellerName = sellerName;
		this.sellerAddressLineOne = sellerAddressLineOne;
		this.sellerAddressLineTwo = sellerAddressLineTwo;
		this.sellerAddressLineThree = sellerAddressLineThree;
		this.sellerCounty = sellerCounty;
		this.sellerPostCode = sellerPostCode;
		this.sellerEmailAddress = sellerEmailAddress;
	}

	
	public SellerDto transformToDtop(Seller seller) {
		
		var dto = new SellerDto();
		dto.setIdseller(seller.getIdseller().toString());
		dto.setsellerAccount(seller.getsellerAccount());
		dto.setsellerAddressLineOne(seller.getsellerAddressLineOne());
		dto.setsellerAddressLineTwo(seller.getsellerAddressLineTwo());
		dto.setsellerCounty(seller.getsellerCounty());
		dto.setsellerEmailAddress(seller.getsellerEmailAddress());
		dto.setsellerName(seller.getsellerName());
		dto.setsellerPostCode(seller.getsellerPostCode());
		return dto;
	}
	public String getIdseller() {
		return idseller;
	}

	public void setIdseller(String idseller) {
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
