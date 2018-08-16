package com.ankit.collections.arrays;

public class Odd implements Runnable {
	private Object lock;
	
	

    public Odd(Object lock) {
		super();
		this.lock = lock;
	}



	public  void run(){
        int i = 1;
        
        while(i <= 100) {
        	synchronized(lock){
        	if(i%2 !=0) {
                System.out.println(i);
                try {
				//	System.out.println("Waiting Odd");
                	lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
                
            }
        	else{
        		lock.notify();
        	}
        	
            i++;
        }
        }
    }
}
