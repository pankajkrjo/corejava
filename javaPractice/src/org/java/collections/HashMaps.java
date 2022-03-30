package org.java.collections;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class HashMaps {

	public static void main(String args[]) {
		   
		  HashMap<String, Integer> obj=new HashMap<String, Integer>();
		            obj.put(null, null);
		            obj.put(null, null);
		            obj.put(null, null);
		            System.out.println(obj);
		  ConcurrentHashMap<String, Integer> obj2=new ConcurrentHashMap<String, Integer>();
		                  obj2.put(null, null);
		                  // obj2.put(null, null);
		                 //  System.out.println(obj2);
		                   
		            
	}	
}
