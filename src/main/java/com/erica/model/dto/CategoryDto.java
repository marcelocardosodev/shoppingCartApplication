package com.erica.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CategoryDto {
	
	
	@JsonProperty("id")
	private String idCategory;
	
	@JsonProperty("category_code")
	private Integer categoryCode;
	
	@JsonProperty("category_description")
	private Integer categoryDescription;

	public CategoryDto() {
		
	}

	public CategoryDto(String idCategory, Integer categoryCode, Integer categoryDescription) {
		super();
		this.idCategory = idCategory;
		this.categoryCode = categoryCode;
		this.categoryDescription = categoryDescription;
	}

	public String getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(String idCategory) {
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
