package com.technical;

public class CountNoOfChar {
	
	public static void  count(String str) {
		char ch[] = str.toCharArray();
		int letter = 0;
		int space = 0;
		int number = 0;
		int other = 0;
		
		for(int i=0;i<ch.length;i++) {
		
			if(Character.isDigit(ch[i])) {
				number++;
			}
			
			else if(Character.isLetter(ch[i])) {
				letter ++;
			}
			else if(Character.isSpaceChar(ch[i])) {
				space ++;
			}
			else {
				other ++;
			}
		}
		
		System.out.println("No of letters = "+letter);
		System.out.println("No of digits = "+number);
		System.out.println("No of space = "+space);
		System.out.println("No of other characters = "+other);
	}

	public static void main(String[] args) {

		count("This is a java 1234@#");
	}

}
