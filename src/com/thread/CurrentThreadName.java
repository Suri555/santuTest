package com.thread;

class CurrentThreadName extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Keep some task here.....");
    }
 
    public static void main(String[] args)
    {
        //Using thread and it's task
 
    	//CurrentThreadName t = new CurrentThreadName();
    	Thread t= Thread.currentThread();
    	System.out.println(t);
    	
       // t.start();
    }
}