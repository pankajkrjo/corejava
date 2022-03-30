package org.java.java8LambdaExpression;

public class SayableClasswithparameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 Sayablewithparameter say=(name)->{
        return "Hello"+name;
	};
	
	System.out.println(say.name("pankaj"));
	
	Sayablewithparameter says=(name)->{
	
		  return "hi " + name;
	};
	System.out.println(says.name("pankaj"));
	
	}
}
