package org.java.nomal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class unmodifiableLists {

	
	public static void main(String[] args) {
		
		try {
	    List<String> obj=new ArrayList<String>();
	                 obj.add("java");
	                 obj.add("php");
	                 obj.add(".net");
	     List<String>  unmodList=Collections.unmodifiableList(obj);
	     unmodList.add("pankaj");
	     
	         
	}
		catch(UnsupportedOperationException e) {
			System.out.println("exception:---"+e);
		}
	}
}

