package com.erica.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name= "product_sellers")
public class ProductSeller implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4107393848103279830L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	private Product produto;
	
	@ManyToOne
	private Seller seller;
	
	@Column(name= "price", nullable = false, precision = 6, scale = 2)
	private BigDecimal price;

	public ProductSeller() {
		
	}

	public ProductSeller(Product produto, Seller seller, BigDecimal price) {
		super();
		this.produto = produto;
		this.seller = seller;
		this.price = price;
	}

	public Product getProduto() {
		return produto;
	}

	public void setProduto(Product produto) {
		this.produto = produto;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	

}
