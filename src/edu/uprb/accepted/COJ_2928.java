package edu.uprb.accepted;
import java.math.BigInteger;
import java.util.Scanner;

public class COJ_2928 {
	/*			Accepted
		APuzzleFromRedMatematica_2928
	 */
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		while (true) {
			int n = kb.nextInt();
			int n2 = kb.nextInt();
			if(n == 0 & n2 == 0)
				break;
			StringBuilder st = new StringBuilder("");
			for (int i = 1; i <= n2; i++)
				st.append(n);
			BigInteger big = new BigInteger(st.toString());
			big = big.pow(2);
			StringBuilder st2 = new StringBuilder();
			st2.append(big);
			long sum = 0;
			for (int i = 0; i < st2.length(); i++) {
				sum += st2.charAt(i) - 48;
			}
			System.out.println(sum);
		}
		kb.close();
	}

}