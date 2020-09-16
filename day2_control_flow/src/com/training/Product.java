package com.training;

public class Product {
	
	private String productName;
	private int productId;
	private double ratePerUnit;
	private int productType;
	private int productQuantity;
	private double productDiscount;
	public int getProductQuantity() {
		return productQuantity;
	}

	

	public Product(String productName, int productId, double ratePerUnit, int productType, int productQuantity,
			int productDiscount) {
		super();
		this.productName = productName;
		this.productId = productId;
		this.ratePerUnit = ratePerUnit;
		this.productType = productType;
		this.productQuantity = productQuantity;
		this.productDiscount = productDiscount;
	}

	public Product(String productName, int productId, double ratePerUnit, int productType) {
		super();
		this.productName = productName;
		this.productId = productId;
		this.ratePerUnit = ratePerUnit;
		this.productType = productType;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Product(String productName, int productId, double ratePerUnit) {
		super();
		this.productName = productName;
		this.productId = productId;
		this.ratePerUnit = ratePerUnit;
	}
	
	public int getProductType() {
		return productType;
	}

	public void setProductType(int productType) {
		this.productType = productType;
	}

	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public int getProductId() {
		return productId;
	}
	
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public double getRatePerUnit() {
		return ratePerUnit;
	}
	public void setRatePerUnit(double ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public double getProductDiscount() {
		return productDiscount;
	}

	public void setProductDiscount(double productDiscount) {
		this.productDiscount = productDiscount;
	}
	
}
