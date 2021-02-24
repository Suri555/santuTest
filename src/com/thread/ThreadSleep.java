package com.thread;

public class ThreadSleep extends Thread{
	
	public  void run() {
		
		for(int i=0;i<5;i++) {
			System.out.println("The current thread is "+i);
		try {
				sleep(2000);
			}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		}
	}

	public static void main(String[] args) {
		ThreadSleep ts = new ThreadSleep();
		ts.start();
		
		/*for(int i=0;i<5;i++) {
			System.out.println("Main Thread "+i);
			try {
				sleep(1000);
			}
			catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}*/
		
	}

}
