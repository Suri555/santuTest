package com.technical;



public class RemoveDuplicateChar {
	public static String removeDuplicate(String str) {
		
		char ch[] = str.toCharArray();
		
		StringBuilder sb = new StringBuilder();
		
		/*for(int i=0;i<ch.length;i++) 
		{
			//System.out.println(chh);
			
			if(sb.indexOf(String.valueOf(ch[i])) != -1)
				continue;
			else 
				sb.append(ch[i]);
		}*/
		
		for(char chh : ch) {
			if(sb.indexOf(String.valueOf(chh))!= -1) {
				continue;
			}else {
				sb.append(chh);
			}
			
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		
		System.out.println(removeDuplicate("Helllllooo"));
	}

}
