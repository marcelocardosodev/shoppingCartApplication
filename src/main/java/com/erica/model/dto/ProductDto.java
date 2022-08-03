package com.erica.model.dto;

import org.hibernate.validator.constraints.NotEmpty;

import com.erica.model.Product;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductDto {
	
	@JsonProperty("id")
	private Long idProduto;
	
	@NotEmpty(message = "Category is required")
	@JsonProperty("category")
	private String category;
	
	@NotEmpty(message = "product code is required")
	@JsonProperty("product_code")
	private Integer productCode;
	
	@NotEmpty(message = "product description is required")
	@JsonProperty("product_description")
	private String productDescription;
	
	@NotEmpty(message = "product_manufacture is required")
	@JsonProperty("product_manufacture")
	private String productManufacture;
	
	
	@NotEmpty(message = "product model is required")
	@JsonProperty("product_model")
	private String productModel;
	
	@NotEmpty(message = "product manufactureis required")
	@JsonProperty("product_status")
	private String  productStatus;

	public ProductDto() {

	}

	public ProductDto(Long idProduto, String category, Integer productCode, String productDescription,
			String productManufacture, String productModel, String productStatus) {
		super();
		this.idProduto = idProduto;
		this.category = category;
		this.productCode = productCode;
		this.productDescription = productDescription;
		this.productManufacture = productManufacture;
		this.productModel = productModel;
		this.productStatus = productStatus;
	}
	
	
	
	
	public ProductDto transformToDto(Product product) {
		
		var dto = new ProductDto();
	    dto.setIdProduto(product.getIdProduto());	
	    dto.setCategory(product.getCategory().toString());
	    dto.setProductCode(product.getProductCode());
	    dto.setProductDescription(product.getProductDescription());
	    dto.setProductManufacture(product.getProductManufacture());
	    dto.setProductStatus(product.getProductStatus().toString());
		
		return dto;
	}

	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getProductCode() {
		return productCode;
	}

	public void setProductCode(Integer productCode) {
		this.productCode = productCode;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductManufacture() {
		return productManufacture;
	}

	public void setProductManufacture(String productManufacture) {
		this.productManufacture = productManufacture;
	}

	public String getProductModel() {
		return productModel;
	}

	public void setProductModel(String productModel) {
		this.productModel = productModel;
	}

	public String getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}
	
	
	
	

}
