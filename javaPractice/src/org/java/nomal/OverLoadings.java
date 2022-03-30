package org.java.nomal;

public class OverLoadings {
	
	public void m(Integer in) {
		   System.out.println("ineger...."+in);
		  
	  }
	public void m(String in) {
		System.out.println("String"+in);
	}
	public static void main(String args[]) {
		
		OverLoadings obj=new OverLoadings();
		    // obj.m(null);
	}

}
