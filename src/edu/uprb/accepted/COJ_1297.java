package edu.uprb.accepted;
import java.math.BigInteger;
import java.util.Scanner;

public class COJ_1297 {
//Accepted Divisibility by 495
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int run = Integer.parseInt(kb.next());
		while(run-->0){
			BigInteger st = new BigInteger(kb.next());
			String check = st.toString().substring(st.toString().length()-1);
			System.out.println((check.equals("0") || check.equals("5") )&& st.intValue() >= 495 ? "YES" : "NO");
		}
		kb.close();
	}

}
