package com.erica.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name= "categories")
public class Category  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2538995393943906857L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idCategory;
	
	
	@Column(name= "category_code", unique = true, nullable = false, length = 6)
	private Integer categoryCode;
	
	@Column(name= "category_description", nullable = false, length = 30)
	private Integer categoryDescription;

	public Category() {
		
	}

	public Category(Long idCategory, Integer categoryCode, Integer categoryDescription) {
		super();
		this.idCategory = idCategory;
		this.categoryCode = categoryCode;
		this.categoryDescription = categoryDescription;
	}

	public Long getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(Long idCategory) {
		this.idCategory = idCategory;
	}

	public Integer getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(Integer categoryCode) {
		this.categoryCode = categoryCode;
	}

	public Integer getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(Integer categoryDescription) {
		this.categoryDescription = categoryDescription;
	}
	

}
