package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_1177 {
//Accepted GroupReverse
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int i = Integer.parseInt(kb.next());
		while(i!=0){
			StringBuilder st = new StringBuilder();
			String in = kb.next();
			int len  = in.length() / i;
			while(!in.equals("")){
				StringBuffer s = new StringBuffer(in.substring(0, len));
				st.append(s.reverse());
				in = in.substring(len);
			}


			System.out.println(st);
			i = Integer.parseInt(kb.next());
		}
		kb.close();
	}

}
