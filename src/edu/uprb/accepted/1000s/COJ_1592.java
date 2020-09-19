package edu.uprb.accepted;
import java.math.BigInteger;
import java.util.Scanner;

public class COJ_1592 {
//Accepted TheSizeIsNotImportant
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int test = Integer.parseInt(kb.nextLine());
		for(int i = 0; i < test; i++){
			BigInteger big1 = new BigInteger(kb.nextLine());
			BigInteger big2 = new BigInteger(kb.nextLine());
			BigInteger out = big1.multiply(big2);
			System.out.println(out.toString());

		}
		kb.close();
	}

}
