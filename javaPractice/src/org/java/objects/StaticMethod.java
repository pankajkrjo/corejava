package org.java.objects;

public class StaticMethod {

	public  void m1(Object name) {
		System.out.println("String");
		
	}
	public  void m1(StringBuilder st) {
		
		System.out.println("StringBuffer");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticMethod str=new StaticMethod();
		  str.m1(new StringBuilder(null));

	}

}
