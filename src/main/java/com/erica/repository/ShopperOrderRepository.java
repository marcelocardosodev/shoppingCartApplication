package com.erica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erica.model.ShopperOrder;

@Repository
public interface ShopperOrderRepository extends JpaRepository<ShopperOrder, Long> {

}
