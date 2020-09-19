package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_2576 {
//Accepted TRENER
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int test = Integer.parseInt(kb.next());
		String[] arr = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O",
				"P","Q","R","S","T","U","V","W","X","Y","Z"};
		StringBuilder st = new StringBuilder();
		while(test-->0)
			st.append(kb.next().substring(0, 1));

		StringBuilder out = new StringBuilder();
		for(int i = 0; i < arr.length; i++){
			String check = st.toString();
			int len	= st.toString().replace(arr[i].toLowerCase(), "").length();
			if(check.length() - len >= 5)
				out.append(arr[i].toLowerCase());
		}
		
		if(out.toString().equals(""))
			System.out.println("PREDAJA");
		else
			System.out.println(out);
		kb.close();
	}

}
