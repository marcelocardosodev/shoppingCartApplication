package com.erica.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.erica.model.emum.OrderStatus;

@Entity(name="shopper_orders")
public class ShopperOrder implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4654663131696928830L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idOrder;
	
	@Column(name= "order_date", nullable = false)
	private LocalDate orderDate;
	
	@Column(name="order_status", nullable = false, length = 10)
	private OrderStatus orderStatus;
	
	@ManyToOne
	private Shopper shopper;

	public ShopperOrder() {
		
	}

	public ShopperOrder(LocalDate orderDate, OrderStatus orderStatus, Shopper shopper) {
		
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
		this.shopper = shopper;
	}

	public Long getIdOrder() {
		return idOrder;
	}

	public void setIdOrder(Long idOrder) {
		this.idOrder = idOrder;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Shopper getShopper() {
		return shopper;
	}

	public void setShopper(Shopper shopper) {
		this.shopper = shopper;
	}
	
}
