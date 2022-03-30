package org.java.java8LambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class forEachList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 List<String> list=new ArrayList<String>();
		 
		       list.add("pankaj");
		       list.add("pankaj");
		       list.add("pankaj");
		       list.add("pankaj");
		       list.forEach((n)->System.out.println(n));
	}

}
