package org.java.collections;

import java.util.ArrayList;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"",0f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f)); 
        
         //if(productsList!=null && !productsList.isEmpty() && productsList.contains(productsList.)) {
       
        List<Float> productPriceList = new ArrayList<Float>();  
          
         for(Product product:productsList) {
        	 
        	 System.out.println("product" +product);
        	 if(product.price<30000) {
        		 productPriceList.add(product.price);
        		 
        	 }
         }
         System.out.println("productPriceList" +productPriceList);

	}//377096

	
	//Sharvari Sandeep Lingayat

}
