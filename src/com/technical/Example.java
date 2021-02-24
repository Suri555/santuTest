package com.technical;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String"); 
		String st = sc.nextLine();
		
		char ch[] = st.toCharArray();
		
		st =" ";
		for(int i=0;i<=ch.length;i++) {
			if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ') {
				if(ch[i]>=97 && ch[i]<=122) {
					st = st+(char)(ch[i]-32);
				System.out.println(st);}
				else
				{
					st= st+ch[i];
				}
			}
			else {
				if(ch[i]>=65 && ch[i]<=90)
					st=st+ch[i];
				
			}
			System.out.println(st);
		}
		
		
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		
		char ch[] = str.toCharArray();
		int i=0;
		while(i<ch.length/2 && ch[i]==ch[ch.length-i-1])
			i++;
		
		if(i==ch.length/2) {
			System.out.println("Polindrome");
		}
		else {
			System.out.println("Not a polindrome");
		}*/
		
	}

}
