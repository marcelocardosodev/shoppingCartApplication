package com.erica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erica.model.Category;

@Repository
public interface CategoryRepository  extends JpaRepository<Category, Long>{

}
