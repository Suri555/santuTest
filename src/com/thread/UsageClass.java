package com.thread;

class UsageClass extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Keep some task here.....");
    }
 
    public static void main(String[] args)
    {
        //Using thread and it's task
 
        UsageClass t = new UsageClass();
        
        UsageClass t2 = new UsageClass();
        System.out.println(t2.getId());
       t.setDaemon(true);
       
       // System.out.println(t.isDaemon());
       // t.start();
        t2.start();
        System.out.println(t2.getName());
        t2.setName("Santhu");
        System.out.println(t2.getName());
        System.out.println(t2.getId());
        
        Thread tt = Thread.currentThread();
        System.out.println(tt.getId());
        System.out.println(tt.getName());
        System.out.println(t2.getPriority());
        System.out.println(tt.getPriority());
        t2.setPriority(12);
        System.out.println(t2.getPriority());
       /* try {
        	t2.sleep(10);
        }
        catch(InterruptedException ie) {
        	ie.printStackTrace();
        	
        }
        
        System.out.println(t.getId());
        System.out.println(t.isAlive());
        System.out.println(t2.isInterrupted());*/

    }
}