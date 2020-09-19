package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_2147 {
//Accepted DisplacingCharacters
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int test = Integer.parseInt(kb.next());
		while(test-->0){
			StringBuilder st = new StringBuilder();
			String phr = kb.next();
			int ro = Integer.parseInt(kb.next());
			int a = ro%phr.length();
			st.append(phr.substring(phr.length()-a));			
			st.append(phr.substring(0, phr.length()-a));
				System.out.println(st.toString());
		}
		kb.close();
	}


}
