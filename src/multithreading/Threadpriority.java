package multithreading;

import java.util.ArrayList;




class ThreadA extends Thread{
     public void run( ) {
    	 System.out.println("Exiting from Thread 1 ...");
     }
}

class ThreadB extends Thread {
	 public void run( ) {
	      
	        System.out.println("Exiting from Thread 2 ...");
	     }
}
class ThreadC extends Thread{
     public void run( ) {
         
         System.out.println("Executing Thread 3 ...");
     }
}

public class Threadpriority {
    public static void main(String args[]) {
    	
    	
		
		 ThreadA t1 = new ThreadA();
         ThreadB t2 = new ThreadB();
         ThreadC t3 = new ThreadC();
         
         t1.setPriority(Thread.MIN_PRIORITY);
         t2.setPriority(Thread.MAX_PRIORITY);
         t3.setPriority(Thread.NORM_PRIORITY);
        
         t1.setName("Thread 1");
         t2.setName("Thread 2");
         t3.setName("Thread 3");
         t1.start();
         t2.start();
         t3.start();
         System.out.println(t1.getName()+" With priority "+t1.getPriority());
         System.out.println(t2.getName()+" With priority "+t2.getPriority());
         System.out.println(t3.getName()+" With priority "+t3.getPriority());
    }
    }