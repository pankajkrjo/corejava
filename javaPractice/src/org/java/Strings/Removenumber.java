package org.java.Strings;

public class Removenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="pankaj123kumar";
	    char[] ch=str1.toCharArray();
		String regualr="\\d+";
		 
		//System.out.println(str1.replaceAll(regualr, " "));
		
		   for(int i=0; i<=ch.length-1;i++) {
			   if(ch[i]=='1'& ch[i]=='2'& ch[i]=='3') {
				   ch[i]=ch[i+1];
		
				   
			   }
			   System.out.print(ch[i]);
				   
		   }

	}

}
