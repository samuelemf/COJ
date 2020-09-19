package edu.uprb.accepted;
import java.math.BigInteger;
import java.util.Scanner;

public class COJ_1043 {
//Accepted SimpleDishes
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int times = Integer.parseInt(kb.next());
		while(times-->0){
			BigInteger srt = new BigInteger(kb.next());
			BigInteger s = new BigInteger(srt.toString(2));
			int len = s.toString().length();
			StringBuilder st = new StringBuilder();
			StringBuilder check = new StringBuilder(s.toString());
			check.reverse();
			for (int j = 0; j < len; j++)
				if (check.charAt(j) == '1'){
					if (st.length() == 0)
						st.append(j);
					else
						st.append(" " + j);
				}

			System.out.println(st);
		}

		kb.close();
	}

}
