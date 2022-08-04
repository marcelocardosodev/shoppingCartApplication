package com.erica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erica.model.ProductSeller;

@Repository
public interface ProdutoSellerRepository extends JpaRepository<ProductSeller, Long>{

}
