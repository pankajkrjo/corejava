package org.java.java8LambdaExpression;

public class ImplementsSayInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SayHello hello = () -> { System.out.println("hello java");
		
		};

		hello.sayHello();


}
}