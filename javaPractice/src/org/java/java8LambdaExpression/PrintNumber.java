package org.java.java8LambdaExpression;

public class PrintNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Printnumbers print= (n)->{
			
			for(int i=0; i<n; i++) {
				System.out.println(i);
			}
		};
		print.print(10);

	}

}
