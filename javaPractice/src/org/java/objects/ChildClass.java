package org.java.objects;

public class ChildClass  extends ParentClass{

	static int x=100;
	 public static void main(String args[]) {
		 
		 ChildClass obj=new ChildClass();
		 ParentClass obj2=new ChildClass();
		        obj.x=200;
		        obj2.x=300;
		       System.out.println(obj2.x);
		       
		        
		  
	 }
}
