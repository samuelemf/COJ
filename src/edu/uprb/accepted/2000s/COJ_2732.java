package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_2732 {
//Accepted Coco-Bits and the Coco-Strings
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int e = Integer.parseInt(kb.nextLine());

		for(int j = 0; j < e; j++){
			String in = kb.nextLine();
			StringBuilder st = new StringBuilder("");
			for(int i = 0; i < in.length(); i++){
				String check = in.substring(i, (i+1));
				if(check == check.toLowerCase())
					st.append(check.toUpperCase());
				else
					st.append(check.toLowerCase());
			}
			System.out.println(st.toString());
		}
		kb.close();
	}

}
