package org.java.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		
		//The filter() method accepts a Predicate to filter all elements of the stream. This operation is intermediate which enables us to call another stream operation (e.g. forEach()) on the result.
		memberNames.stream().filter((s) -> s.startsWith("A") || s.startsWith("R") || s.contains("Sa"))
        .forEach(System.out::println);
		
		//The map() intermediate operation converts each element in the stream into another object via the given function.
		
		memberNames.stream().filter((s) -> s.startsWith("A"))
        .map(String::toUpperCase)
        .forEach(System.out::println);
		
		//The sorted() method is an intermediate operation that returns a sorted view of the stream. The elements in the stream are sorted in natural order unless we pass a custom Comparator.
		//Please note that the sorted() method only creates a sorted view of the stream without manipulating the ordering of the source Collection. In this example, the ordering of string in the memberNames is untouched.
		memberNames.stream().sorted()
        .map(String::toUpperCase)
        .forEach(System.out::println);
		
		//The forEach() method helps in iterating over all elements of a stream and perform some operation on each of them. The operation to be performed is passed as the lambda expression.
		memberNames.forEach(System.out::println);
		
		//The collect() method is used to receive elements from a steam and store them in a collection.
		List<String> memNamesInUppercase = memberNames.stream().sorted()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

         System.out.print(memNamesInUppercase);
         
         //Various matching operations can be used to check whether a given predicate matches the stream elements. All of these matching operations are terminal and return a boolean result.
         
         boolean matchedResult = memberNames.stream()
        	        .anyMatch((s) -> s.startsWith("A"));
        	 
        	System.out.println(matchedResult);     //true
        	 
        	matchedResult = memberNames.stream()
        	        .allMatch((s) -> s.startsWith("A"));
        	 
        	System.out.println(matchedResult);     //false
        	 
        	matchedResult = memberNames.stream()
        	        .noneMatch((s) -> s.startsWith("A"));
        	 
        	System.out.println(matchedResult);     //false
		
        	//The count() is a terminal operation returning the number of elements in the stream as a long value.
        	long totalMatched = memberNames.stream()
        		    .filter((s) -> s.startsWith("A"))
        		    .count();
        		 
        		System.out.println(totalMatched);   
        		
        	
      //The reduce() method performs a reduction on the elements of the stream with the given function. The result is an Optional holding the reduced value.
        		
        		Optional<String> reduced = memberNames.stream()
        		        .reduce((s1,s2) -> s1 + "#" + s2);
        		 
        		reduced.ifPresent(System.out::println);
        		
        		
		
		
		
		
	}

}
