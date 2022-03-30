package org.java.java8LambdaExpression;

import java.util.Arrays;
import java.util.List;

public class GetEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] un= {2,4,5,3,9};
		
		//convert array to list
			List<Integer> list=Arrays.asList(un);
		  
			list.stream().filter(n -> n%3==0).forEach(
				System.out::println);
			

	}

}
