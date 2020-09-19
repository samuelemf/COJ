package edu.uprb.accepted;
import java.math.BigInteger;
import java.util.Scanner;

public class COJ_1393 {
//Accepted CruelMathematicsTeacherI
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		BigInteger base = new BigInteger(kb.next());
		BigInteger power = new BigInteger(kb.next());
		StringBuilder st = new StringBuilder(base.pow(Integer.parseInt(power.toString())).toString());
		int len = st.length();
		while(len > 70){
			System.out.println(st.substring(0,70));
			String in = st.substring(70);
			st.delete(0, st.length());
			st.append(in);
			 len -= 70;
		}
		System.out.println(st.toString());
		kb.close();
	}

}
