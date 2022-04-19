package com.java.Constructors;

public class ConstructorChaining {
	
   ConstructorChaining(){
		
		System.out.println("Default Constructor");
		
	}

	ConstructorChaining(Integer x){
		  this();
		  System.out.println(x);
	}
	
	ConstructorChaining(int x, int y){
		 this(5);
		 System.out.println(x*y);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ConstructorChaining(8,10);

	}

}
