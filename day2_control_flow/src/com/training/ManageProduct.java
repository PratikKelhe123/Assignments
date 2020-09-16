package com.training;

public class ManageProduct {

	public Product[] calculateDiscount(Product[] productList) {
		
		double discount=0.0;
		
		int quantity;
		
//		if(product.getRatePerUnit() >500 && product.getRatePerUnit() <=1000) {
//			discount = 0.10;
//		}	else if(product.getRatePerUnit() >1000) {
//			discount = 0.15;
//		} 
		System.out.println("here");
		System.out.println(productList[0].getProductName());
		for(Product product : productList) {

			if(product.getRatePerUnit() >500 && product.getRatePerUnit() <=1000) {
				discount = 0.10;
			}	else if(product.getRatePerUnit() >1000) {
				discount = 0.15;
			}
			
			product.setProductDiscount(discount);
		}
		
		return productList;
	}
	
	public void showProducts(Product[] productList) {
		for(int i=0; i<productList.length; i++) {
			System.out.println("product:" + i + "=>"+productList[i].getProductName());
		}
	}
	
	public void showProductForEach(Product[] productList) {
		for(Product eachProduct : productList) {
			System.out.println(eachProduct.getProductName()+"."+eachProduct.getRatePerUnit());
		}
	} 
	
	public int calculateTax(Product product) {
		
		switch(product.getProductType()) {
		case 1:
			return 5;
		case 2:
			return 10;
		case 3:
			return 15;
		default:
			return 28;
			
		}
	}
}
