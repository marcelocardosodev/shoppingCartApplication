package com.erica.model.dto;

import org.hibernate.validator.constraints.NotEmpty;

import com.erica.model.Category;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CategoryDto {
	
	
	@JsonProperty("id")
	private String idCategory;
	
	@JsonProperty("category_code")
	@NotEmpty(message = "Category code is required")
	private Integer categoryCode;
	
	@JsonProperty("category_description")
	@NotEmpty(message = "Description  is required")
	private Integer categoryDescription;

	public CategoryDto() {
		
	}

	public CategoryDto(String idCategory, Integer categoryCode, Integer categoryDescription) {
		super();
		this.idCategory = idCategory;
		this.categoryCode = categoryCode;
		this.categoryDescription = categoryDescription;
	}
	
	public CategoryDto transformToDto(Category category) {
		var dto = new CategoryDto();
		dto.setIdCategory(category.getIdCategory().toString());
		dto.setCategoryCode(category.getCategoryCode());
		dto.setCategoryDescription(category.getCategoryDescription());
		
		return dto;
		
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
