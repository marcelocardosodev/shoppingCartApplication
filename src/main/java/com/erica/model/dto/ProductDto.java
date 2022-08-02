package com.erica.model.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotEmpty;

import com.erica.model.Category;
import com.erica.model.emum.ProductStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductDto {
	
	@JsonProperty("id")
	private Long idProduto;
	
	@NotEmpty(message = "Category is requerid")
	@JsonProperty("category")
	private String category;
	
	@NotEmpty(message = "product code is requerid")
	@JsonProperty("product_code")
	private Integer productCode;
	
	@NotEmpty(message = "product description is requerid")
	@JsonProperty("product_description")
	private String productDescription;
	
	@NotEmpty(message = "product_manufacture is requerid")
	@JsonProperty("product_manufacture")
	private String productManufacture;
	
	
	@NotEmpty(message = "product model is requerid")
	@JsonProperty("product_model")
	private String productModel;
	
	@NotEmpty(message = "product manufactureis requerid")
	@JsonProperty("product_status")
	private String  productStatus;

}
