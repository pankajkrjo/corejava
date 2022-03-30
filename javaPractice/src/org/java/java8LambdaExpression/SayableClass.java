package org.java.java8LambdaExpression;

public class SayableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sayable sy=()->{
    // System.out.println("Sayable")
		return "Sayable";
	};
	System.out.println(sy.say());

}
}