package com.java.Constructors;

public class CopyConstructors {
	int num;
	String name;

	public CopyConstructors(int num, String name){
		 this.num=num;
		 this.name=name;
	}

	  public CopyConstructors(CopyConstructors c1) {
		  System.out.println("Copy of constructors");
		  num=c1.num;
		  name=c1.name;
		// TODO Auto-generated constructor stub
	}
	
	  
	@Override
	public String toString() {
		return "CopyConstructors [num=" + num + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CopyConstructors obj=new CopyConstructors(10, "pankaj");
		
		CopyConstructors copy=new CopyConstructors(obj);
		
		System.out.println(copy);
		
		
	}

}
