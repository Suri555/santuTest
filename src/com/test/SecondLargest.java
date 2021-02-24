package com.test;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {

		int array[] = {10,12,45,02,45,35,99,56,49,55,57};
		System.out.println(array.length);
		int n =array.length;
		int firstLargest,secondLargest;
		
						if(array[0]>array[1])
						{
							firstLargest=array[0];
							secondLargest =  array[1];
						}
						else {
							firstLargest=array[1];
							secondLargest =  array[0];
						}
				
		for(int i=2;i<n;i++) {
					if(array[i]>firstLargest)
					{
						
						secondLargest =firstLargest;
						firstLargest = array[i];
					}
			
				else if(array[i]<firstLargest && array[i]>secondLargest ) 
				{
					secondLargest= array[i];
				}
		   }
		System.out.println("The arrays elements are"+Arrays.toString(array));
		System.out.println("Second largest element "+secondLargest);
		System.out.println("First largest number " +firstLargest);
	}

	/* static void secondLargest(int[] input)
	    {
	        int firstLargest, secondLargest;
	  
	        //Checking first two elements of input array
	  
	        if(input[0] > input[1])
	        {
	            //If first element is greater than second element
	  
	            firstLargest = input[0];
	  
	            secondLargest = input[1];
	        }
	        else
	        {
	            //If second element is greater than first element
	  
	            firstLargest = input[1];
	  
	            secondLargest = input[0];
	        }
	  
	        //Checking remaining elements of input array
	  
	        for (int i = 2; i < input.length; i++) { if(input[i] > firstLargest)
	            {
	                //If element at 'i' is greater than 'firstLargest'
	  
	                secondLargest = firstLargest;
	  
	                firstLargest = input[i];
	            }
	            else if (input[i] < firstLargest && input[i] > secondLargest)
	            {
	                //If element at 'i' is smaller than 'firstLargest' and greater than 'secondLargest'
	  
	                secondLargest = input[i];
	            }
	        }
	  
	        System.out.println("Input Array :");
	         
	        System.out.println(Arrays.toString(input));
	         
	        System.out.println("Second Largest Element : ");
	         
	        System.out.println(secondLargest);
	    }
	  
	    public static void main(String[] args)
	    {
	        secondLargest(new int[] {47498, 14526, 74562, 42681, 75283, 45796});
	    }
	*/
}
