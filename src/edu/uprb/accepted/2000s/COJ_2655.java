package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_2655 {
//Accepted AVION
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		StringBuilder st = new StringBuilder("");
		for(int i = 0; i < 5; i++){
			String in = kb.nextLine();
			if(in.contains("FBI")&& st.toString().equals(""))
				st.append((i+1));
			else
				if(in.contains("FBI"))
						st.append(" " + (i + 1));
		}
		if(st.toString().equals(""))
			st.append("HE GOT AWAY!");
		System.out.println(st);
		kb.close();
	}

}
