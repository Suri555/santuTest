package com.stringss;

public class ReverseString {
	
	public static String StringReverse(String string) {
		
		
		String str = "BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz";
		//String str = "aeiouAEIOU";
		int i=0;
		int j= string.length()-1;
		char[] ch = string.toCharArray();
		
		while(i<j) {
			if(!str.contains(String.valueOf(string.charAt(i)))) {
			i++;
			continue;
		}
		if(!str.contains(String.valueOf(string.charAt(j)))) {
		j--;
		continue;
			
	}
	swap(ch,i,j);
	i++;
	j--;
}
return String.valueOf(ch);
}

private static void swap(char[] ch,int i, int j) {
	char temp=ch[i];
	ch[i]=ch[j];
	ch[j]=temp;
}

	public static void main(String[] args) {
		String st = "HELLO";
		StringReverse(st);
		//System.out.println(StringReverse(st));
		System.out.println("hello");
		System.out.println(StringReverse(st));
		System.out.println(StringReverse("hello"));
	}

}
