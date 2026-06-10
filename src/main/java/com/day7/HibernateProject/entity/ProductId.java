package com.day7.HibernateProject.entity;


import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class ProductId implements Serializable{

	private static final long serialVersionUID = 1L;

	@Column(name="categoryid")
	int categoryId;
	
	@Column(name="productid")
	int productId;


	public ProductId() {
		
	}
	public ProductId(int categoryId, int productId) {
		super();
		this.categoryId = categoryId;
		this.productId = productId;
	}


	public int getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	
}

