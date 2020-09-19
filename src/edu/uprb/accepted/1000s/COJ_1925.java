package edu.uprb.accepted;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class COJ_1925 {
//Accepted ReverseAndSort
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int howM = Integer.parseInt(kb.next());
		BigInteger[] solutions = new BigInteger[howM];
		while(howM-->0){
			StringBuilder in = new StringBuilder(kb.next());
			solutions[howM] = new BigInteger(in.reverse().toString());
		}
		Arrays.sort(solutions);
		print(solutions);
		kb.close();

	}

	private static void print(BigInteger[] solutions) {
		for (int i = 0; i < solutions.length; i++)
			System.out.println(solutions[i]);		
	}

}
