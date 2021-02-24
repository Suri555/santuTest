package com.test;

import java.util.ArrayList;

public class ListToArray 
{      
    public static void main(String[] args) 
    {    
     ArrayList<String> al = new ArrayList<String>();
     al.add("Santhu");
     al.add("sunil");
     al.add("Sudhakar");
     
     for(String str: al)
     {
    	 System.out.println(str);
     }
   String array[] = new String[al.size()];
   al.toArray(array);
   System.out.println("=================");
   for(String arr:array) {
	   System.out.println(arr);
   }
   
    }    
}
