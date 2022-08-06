package com.erica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.erica.model.Seller;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Long> {
	
	@Query(name = "SELECT s FROM Seller s WHERE s.sellerAccount LIKE %?1%" )
	Seller findBySellerAccount(String sellerAccount);

}
