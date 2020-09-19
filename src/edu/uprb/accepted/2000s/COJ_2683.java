package edu.uprb.accepted;
import java.math.BigInteger;
import java.util.Scanner;

public class COJ_2683 {
//Accepted BaseB
	public static void main(String[] args) {
	Scanner kb = new Scanner(System.in);
	int run = Integer.parseInt(kb.next());
	while(run-->0){
		BigInteger num = new BigInteger(kb.next());
		int base = Integer.parseInt(kb.next());
		System.out.println(num.toString(base).toUpperCase());
	}
	kb.close();
	}

}
