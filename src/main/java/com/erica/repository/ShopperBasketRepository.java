package com.erica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erica.model.ShopperBasket;

@Repository
public interface ShopperBasketRepository extends JpaRepository<ShopperBasket, Long> {

}
