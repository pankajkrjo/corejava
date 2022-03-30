package org.java.Arrays;

public class GFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr;
		
		arr=new int[5];
		arr[0]=10;
		arr[1]=10;
		arr[2]=14;
		arr[3]=10;
		arr[4]=10;
		
		for(int i=0; i<arr.length;i++) {
			
			System.out.println("Element at index" +i+ " : "+ arr[i]); 
		}
		
		
		Student [] arra;
        
		arra=new Student[5];
		
		
		// initialize the first elements of the array
        arra[0] = new Student(1,"aman");
        
		// initialize the second elements of the array
        arra[1] = new Student(2,"vaibhav");
 
        // so on...
        arra[2] = new Student(3,"shikar");
        arra[3] = new Student(4,"dharmesh");
        arra[4] = new Student(5,"mohit");
		
        for (int i = 0; i < arra.length; i++)
            System.out.println("Element at " + i + " : " +
                        arra[i].roll_no +" "+ arra[i].name);
        
        
        	}

		
}
