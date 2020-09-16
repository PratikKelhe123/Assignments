package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tax;
		
		Product tv = new Product("LED TV",1010,23000.00);
		
		Product ac = new Product("AC",1011,50000,1);
		
		ManageProduct mgr = new ManageProduct();
		
		double discount = mgr.calculateDiscount(tv);
		
		System.out.println("Discount:==>"+discount);
		
		mgr.showProducts();
		
		tax = mgr.calculateTax(ac);
		
		System.out.println("tax is" + tax);
	}

}
