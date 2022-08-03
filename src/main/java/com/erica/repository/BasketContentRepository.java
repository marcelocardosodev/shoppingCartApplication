package com.erica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erica.model.BasketContent;

@Repository
public interface BasketContentRepository extends JpaRepository<BasketContent, Long>{

}
