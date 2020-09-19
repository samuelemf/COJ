package edu.uprb.accepted;
import java.math.BigInteger;
import java.util.Scanner;

public class COJ_1158 {
//Accepted LeastPower
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int run = Integer.parseInt(kb.next());
		while(run-->0){
			BigInteger big = new BigInteger(kb.next());
			StringBuilder st = new StringBuilder(big.toString(2));
			st.reverse();
			int power = 0;
			for (int i = 0; i < st.length(); i++) {
				if(st.toString().substring(i,i+1).equals("1"))
					break;
				else
					power++;
			}
			BigInteger out = new BigInteger("2");
			System.out.println(out.pow(power));
		}
		kb.close();

	}

}
