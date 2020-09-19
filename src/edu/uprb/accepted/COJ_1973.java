package edu.uprb.accepted;
import java.math.BigInteger;
import java.util.Scanner;

public class COJ_1973 {
//Times 17
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		BigInteger st = new BigInteger(kb.nextLine());
		BigInteger st3 = new BigInteger("17");
		BigInteger st2 = new BigInteger(st.toString(),2);
		st2 = st2.multiply(st3);
		System.out.println(st2.toString(2));
		kb.close();
	}

}
