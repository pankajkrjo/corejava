package org.java.calculater;

import java.util.Scanner;

public class Calculate   implements MethodType{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Scanner sr=new Scanner(System.in);
	      System.out.print("first number");
	     int value=sr.nextInt();
	     System.out.println("second number");
	     int value2=sr.nextInt();
	     
	     Scanner sc=new Scanner(System.in);
	     int st=sc.nextInt();
	     String s=String.valueOf(st);
	     System.out.println(s);
	     System.out.println("Values"+value+" "+value2);
	     
			/*
			 * MethodType ms=(int x, int y) -> { System.out.println(x+y); }; ms.add(value,
			 * value2);
			 */
	     Calculate cal=new Calculate();
	     // cal.add(value, value2);
	     
	      
	      
	      
	      
      switch(st) {
      case 1: cal.add(value, value2);
        System.out.println("Add");
      break;
      case 2:  cal.sub(value, value2);
        System.out.println("Sub");
      break;
      case 3: cal.mutli(value, value2);
      System.out.println("Muti");
      break;
      
      }
	}

	@Override
	public void add(int i, int j) {
		 System.out.println(i+j);
		
	}

	@Override
	public void sub(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println(i-j);
		
	}

	@Override
	public void mutli(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println(i*j);
		
	}

}
