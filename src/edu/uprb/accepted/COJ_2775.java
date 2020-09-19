package edu.uprb.accepted;

import java.util.Scanner;

public class COJ_2775{
//Accepted LATIN
	public static void main(String[] args) {
		String f = "cow", fa = "ow";
		Scanner kb = new Scanner(System.in);
		int run = Integer.parseInt(kb.nextLine());

		for(int i = 0; i < run; i++){
			StringBuilder st = new StringBuilder("");
			String in = kb.nextLine();
			String check = in.substring(0, 1);
			if(check.equals("a")||check.equals("e")||check.equals("i")||check.equals("o")||
					check.equals("u")){
				st.append(in);
			st.append(f);
			}
			else
			{
				in = in.substring(1);
				st.append(in);
				st.append(check);
				st.append(fa);
			}
			System.out.println(st.toString());
		}

		kb.close();

	}

}
