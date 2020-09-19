package edu.uprb.accepted;
import java.math.BigInteger;
import java.util.Scanner;

public class COJ_1573 {
//Accepted JustAnotherEasyProblem
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int run = Integer.parseInt(kb.next());
		while(run-->0){
			String st = kb.next();
			BigInteger num = new BigInteger(st, 16);
			BigInteger one = new BigInteger("1");
			BigInteger two = new BigInteger("2");
			System.out.println(num.multiply(num.add(one)).divide(two).mod(num).toString().equals("0") ? "YES" : "NO");
		}
		kb.close();
	}

}
