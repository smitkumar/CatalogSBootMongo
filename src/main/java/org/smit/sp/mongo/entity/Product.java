package org.smit.sp.mongo.entity;

public class Product {	
	
	private String id;
	
	private String productName;
	private String price;
	private int code;
	
	
	public Product(){}
	
	public Product(String id, String productName, String price, int code) {
		super();
		this.id = id;
		this.productName = productName;
		this.price = price;
		this.code = code;
	}
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}

	
	

}
