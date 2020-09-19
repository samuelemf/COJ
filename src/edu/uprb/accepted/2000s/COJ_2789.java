package edu.uprb.accepted;
import java.util.Arrays;
import java.util.Scanner;

public class COJ_2789{
//Accepted SumOrder
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String in = kb.nextLine();
		StringBuilder st = new StringBuilder("");
		in = in.replace("+", "");
		char[] t = in.toCharArray();
		Arrays.sort(t);
		
		for(int i = 0; i < t.length; i++){
			st.append(t[i]);
			if(i < t.length - 1)
				st.append("+");
		}

		System.out.println(st.toString());
		kb.close();
	}

}
