package org.java.java8LambdaExpression;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class PrintListElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list=Arrays.asList("java","net","R");
		
		list.forEach(p -> System.out.println(p));

	}

}
