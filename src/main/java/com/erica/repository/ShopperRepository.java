package com.erica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erica.model.Shopper;

@Repository
public interface ShopperRepository extends JpaRepository<Shopper, Long> {

}
