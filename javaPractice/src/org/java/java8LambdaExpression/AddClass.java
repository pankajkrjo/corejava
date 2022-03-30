package org.java.java8LambdaExpression;

public class AddClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AddInteface ad=(a,b)-> {
			return (a+b);
		};
		System.out.println(ad.add(2, 9));
		
		AddInteface as=(a,b)->(a+b);
		System.out.println(as.add(2,4));

	}
	
	
   //patreek.dwivedi@masnep.in
	//Pankajkumar@1
}
