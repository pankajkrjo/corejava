package org.java.java8LambdaExpression;

public class PrintnumberClass {

	public static void main(String[] args) {
		
		  Printnumbers  print = (n) -> {
				/*
				 * while(n<=10) { System.out.println("value "+n++); }
				 */
			  for(int i=0; i<=n; i++) {
				   System.out.println(i);
			  }
		  };
		  print.print(10);

	}

}
