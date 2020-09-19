package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_2623 {
//Accepted SuperEncryption
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String in = kb.next();
		int len = in.length();
		StringBuilder st = new StringBuilder();
		if(len % 2 != 0){
			for(int i = len/2; i > 0; i--)
				st.append(in.substring(i-1,i));
			st.append(in.charAt(len/2));
			in = in.substring((len/2)+1);
			StringBuilder last = new StringBuilder(in);
			st.append(last.reverse());
		}
		else{
			for(int i = len/2; i > 0; i--)
				st.append(in.substring(i-1,i));
			in = in.substring((len/2));
			StringBuilder last = new StringBuilder(in);
			st.append(last.reverse());
		}
		kb.close();
		System.out.println(st.toString());
	}

}
