package com.erica.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Cleanup;

@Entity(name= "shopper_baskets")
public class ShopperBasket implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8084483508915245119L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idBasket;
	
	@ManyToOne
	private Shopper shopper;
	
	@Column(name= "basket_created_date_time", nullable = false)
	private LocalDate basketCreated;

	public ShopperBasket() {
		
	}

	public ShopperBasket(Long idBasket, Shopper shopper, LocalDate basketCreated) {
		super();
		this.idBasket = idBasket;
		this.shopper = shopper;
		this.basketCreated = basketCreated;
	}

	public Long getIdBasket() {
		return idBasket;
	}

	public void setIdBasket(Long idBasket) {
		this.idBasket = idBasket;
	}

	public Shopper getShopper() {
		return shopper;
	}

	public void setShopper(Shopper shopper) {
		this.shopper = shopper;
	}

	public LocalDate getBasketCreated() {
		return basketCreated;
	}

	public void setBasketCreated(LocalDate basketCreated) {
		this.basketCreated = basketCreated;
	}
	
	
	
	
	
}
