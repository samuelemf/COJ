package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_1389 {
//Accepted MaximumPalindrome
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String temp = "";
		String result = "a";
		char[] arr = kb.next().toCharArray();
		
		for (int j = 0; j < arr.length; j++) {
		
			StringBuilder st = new StringBuilder();
			
			for (int i = j; i < arr.length; i++) {
			
					st.append(arr[i]);
					
					if(check(st))
						temp = st.toString();				
			}
			
			if(temp.length() >= result.length())
				result = temp;
		
		}
		
		System.out.println(result);
		kb.close();
	}
	
	public static boolean check (StringBuilder in){
		StringBuilder st = new StringBuilder();
		
		for(int i = 0; i < in.length(); i++)
			st.append(in.charAt(i));
		
		return in.toString().equals(st.reverse().toString());
	}

}
