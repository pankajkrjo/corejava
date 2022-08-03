package org.java.streamApi;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import javax.swing.text.html.HTMLDocument.Iterator;

public class RemoveDuplicateElemnetFromMap {
	
	
	public static void main(String args[]) {
		
		Map<Integer, String> hs=new HashMap<Integer, String>();
		       hs.put(1, "a");
		       hs.put(2, "b");
		       hs.put(3, "c");
		       hs.put(4, "a");
		       hs.put(5, "b");
		       
		    // Set in which we keep the existing values
		       
		       Set<String> existing=new HashSet<String>();
		       
		        hs=hs.entrySet()
		        	    .stream()
		        	    .filter(entry -> existing.add(entry.getValue()))
		        	    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		       
		        System.out.println(hs);
		
		        System.out.printf("After: %s%n", hs);
		        
		        
		       Collection<String> obj=hs.values();
		        //  Iterator itr=(Iterator) obj.iterator();
		       
		           
		          
		       
		
	}

}
