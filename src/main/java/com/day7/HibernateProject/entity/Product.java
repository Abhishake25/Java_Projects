package com.day7.HibernateProject.entity;



import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="products")
public class Product {
      @EmbeddedId
	ProductId pId;
	
      @Column(name="productname")
	String productName;
 
      @Column(name="productprice")
	String productPrice;
      @Column(name="productimageurl")
	String productImageUrl;
      
      
      public Product() {
    	  
      }
	  public ProductId getpId() {
		return pId;
	}


	  public void setpId(ProductId pId) {
		  this.pId = pId;
	  }


	  public String getProductName() {
		  return productName;
	  }


	  public void setProductName(String productName) {
		  this.productName = productName;
	  }


	 

	  public String getProductPrice() {
		  return productPrice;
	  }


	  public void setProductPrice(String productPrice) {
		  this.productPrice = productPrice;
	  }


	  public String getProductImageUrl() {
		  return productImageUrl;
	  }


	  public void setProductImageUrl(String productImageUrl) {
		  this.productImageUrl = productImageUrl;
	  }


	  public Product(ProductId pId, String productName, String productDescription, String productPrice,
			String productImageUrl) {
		super();
		this.pId = pId;
		this.productName = productName;
		
		this.productPrice = productPrice;
		this.productImageUrl = productImageUrl;
	  }
	
      
	
}

