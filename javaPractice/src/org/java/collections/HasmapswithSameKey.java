package org.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

public class HasmapswithSameKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee obj1=new Employee("pankaj", "mumbai", "pankaj@gmail.com");
        Employee obj2=new Employee("pankaj", "mumbai", "pankaj@gmail.com");
        
        Employee obj3=new Employee("pankaj", "mumbai", "pankaj@gmail.com");
        Employee obj4=new Employee("tamal", "mumbai", "pankaj@gmail.com");
        
        Hashtable<Employee, Integer> ob=new Hashtable<Employee, Integer>();
		HashMap<Employee, Integer> obj=new HashMap<Employee, Integer>();
		 obj.put(obj1, 2);
		 obj.put(obj2, 2);
		 obj.put(obj3, 2);
		 obj.put(obj4, 2);
		 
		 ob.put(obj1, 2);
		 ob.put(obj2, 2);
		 ob.put(obj3, 2);
		 ob.put(obj4, 2);
		 System.out.println(ob);
		 System.out.println(obj);
		 
		 
		 
		 
		 
			/*
			 * List<Integer>list= Arrays.asList(1,2,3,4,5,6,7,8);
			 * list.parallelStream().peek(System.out::print).forEachOrdered(System.out::
			 * print);
			 * 
			 * 
			 * List<String> lists=new ArrayList<String>(); lists.add("san");
			 * lists.add("san"); lists.add(0,"ff"); lists.add(1,"sjjan");
			 * 
			 * System.out.println("jj"+lists.size());
			 */
		
		
		
	}

}
