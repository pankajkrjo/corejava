package org.java.objects;

public class SleepvsWait {

	private static Object obj=new Object();
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Thread.sleep(4000);
		
		  System.out.println("Thread '" + Thread.currentThread().getName() +
			      "' is woken after sleeping for 1 second");
		  
		  synchronized (obj) {
			  obj.wait(10000);
			  
			  System.out.println("Object '" + obj + "' is woken after" +
			          " waiting for 10 second");
			
		}

	}

}
