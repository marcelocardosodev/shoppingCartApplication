package com.erica.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name= "basket_contents")
public class BasketContent {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	private ShopperBasket shopperBasket;
	
	@ManyToOne
	private Product product;
	
	@ManyToOne
	private Seller seller;
	
	
	@Column(name= "quantity", nullable = false)
	private Integer quantity;
	
	@Column(name= "price", nullable = false, precision = 6, scale = 2)
	private BigDecimal price;

	public BasketContent() {

	}

	public BasketContent(Long id, ShopperBasket shopperBasket, Product product, Seller seller, Integer quantity,
			BigDecimal price) {
		super();
		this.id = id;
		this.shopperBasket = shopperBasket;
		this.product = product;
		this.seller = seller;
		this.quantity = quantity;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ShopperBasket getShopperBasket() {
		return shopperBasket;
	}

	public void setShopperBasket(ShopperBasket shopperBasket) {
		this.shopperBasket = shopperBasket;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	

}
