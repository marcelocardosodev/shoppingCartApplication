package com.erica.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.erica.model.emum.ProductStatus;

@Entity(name= "products")
public class Product implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4079000202920466130L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idProduto;
	
	@ManyToOne
	private Category category;
	
	@Column(name= "product_code", unique = true, nullable = false, length = 10)
	private Integer productCode;
	
	@Column(name= "procuct_description", nullable = false, length = 70)
	private String productDescription;
	
	@Column(name= "procuct_manufacture", nullable = false, length = 20)
	private String productManufacture;
	
	@Column(name= "procuct_model", length = 35)
	private String productModel;
	
	@Column(name= "procuct_status", nullable = false, length = 25)
	private ProductStatus  productStatus;

	public Product() {
		
	}

	public Product(Long idProduto, Category category, Integer productCode, String productDescription,
			String productManufacture, String productModel, ProductStatus productStatus) {
		super();
		this.idProduto = idProduto;
		this.category = category;
		this.productCode = productCode;
		this.productDescription = productDescription;
		this.productManufacture = productManufacture;
		this.productModel = productModel;
		this.productStatus = productStatus;
	}

	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
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

	public ProductStatus getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(ProductStatus productStatus) {
		this.productStatus = productStatus;
	}
	
	

}
