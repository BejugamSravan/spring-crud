package com.products;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Products {
	
	private String productType;
	private String productKey;
	private String productStatus;
	
	@Id
	private String productId;
	private String productName;
	
	private String Date_Modified;
	private String Date_Created;
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getProductKey() {
		return productKey;
	}
	public void setProductKey(String productKey) {
		this.productKey = productKey;
	}
	public String getProductStatus() {
		return productStatus;
	}
	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}
	public String getDate_Modified() {
		return Date_Modified;
	}
	public void setDate_Modified(String date_Modified) {
		Date_Modified = date_Modified;
	}
	
	public String getDate_Created() {
		return Date_Created;
	}
	public void setDate_Created(String date_Created) {
		Date_Created = date_Created;
	}
	

}
