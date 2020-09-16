package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tax;
		
		Product tv = new Product("LED TV",1010,23000.00);
		
		Product ac = new Product("AC",1011,50000,1);
		
		ManageProduct mgr = new ManageProduct();
		
		//double discount = mgr.calculateDiscount(tv);
		
		//System.out.println("Discount:==>"+discount);
		
//		mgr.showProducts();
		
		tax = mgr.calculateTax(ac);
		
		System.out.println("tax is" + tax);
		
		Product fridge = new Product();
		
		fridge.setProductId(200);
		fridge.setProductName("fridge");
		fridge.setRatePerUnit(12030);
		
		Product[] productList = new Product[2];
		//one more way of declaration and initialzation done together
//		Product[] productList = {tv,fridge};
		
		
		productList[0] = tv;
		productList[1] = fridge;
		
		mgr.showProductForEach(productList);
		mgr.showProducts(productList);
		
		Product desktop = new Product("LED TV",1010,23000.00,2,5,2);
		Product ups = new Product("LED TV",1010,23000.00,2,3,1);
		
		Product[] productList2 = new Product[2];
		Product[] productList3 = new Product[2];
		
		productList2[0] = desktop;
		productList2[1] = ups;
		
		
//		Product[] prdouctList3 = new Product[2];
		
		productList2 = mgr.calculateDiscount(productList2);
		
		for(Product product : productList2 ) {
			System.out.println("prdouctName." + product.getProductName());
			System.out.println("product price" + (product.getRatePerUnit() - product.getProductDiscount()*product.getRatePerUnit()));
		}
	}
	
	
	

}
