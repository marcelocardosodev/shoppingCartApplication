package com.erica.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.erica.model.emum.OrderedProductStatus;

@Entity(name= "ordered_products")
public class OrderedProduct implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3408590299011572935L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	
	@ManyToOne
	private ShopperOrder shopperOrder;
	
	
	@ManyToOne
	private Seller seller;
	
	@ManyToOne
	private Product product;
	
	
	@Column(name= "quantity", nullable = false)
	private Integer quantity;
	
	@Column(name ="price", nullable = false, precision = 6, scale = 2)
	private BigDecimal price;

	@Column(name= "ordered_product_status", nullable = false, length = 10)
	private OrderedProductStatus status;

	public OrderedProduct() {
		
	}

	public OrderedProduct(Long id, ShopperOrder shopperOrder, Seller seller, Product product, Integer quantity,
			BigDecimal price, OrderedProductStatus status) {
		super();
		this.id = id;
		this.shopperOrder = shopperOrder;
		this.seller = seller;
		this.product = product;
		this.quantity = quantity;
		this.price = price;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ShopperOrder getShopperOrder() {
		return shopperOrder;
	}

	public void setShopperOrder(ShopperOrder shopperOrder) {
		this.shopperOrder = shopperOrder;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
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

	public OrderedProductStatus getStatus() {
		return status;
	}

	public void setStatus(OrderedProductStatus status) {
		this.status = status;
	}
	
	
	
}
