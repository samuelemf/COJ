package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_3056 {
//Accepted AutomaticCheckingMachine
	public static void main(String[] args) {
		final int max = 5;
		Scanner kb = new Scanner(System.in);
		char[] ar1 = new char[max];
		char[] ar2 = new char[max];
		ar1 = kb.nextLine().toCharArray();
		ar2 = kb.nextLine().toCharArray();
		int count = 0;
		for(int i = 0; i < ar1.length; i++)
		if(ar1[i] == ar2[i])
			count++;
		System.out.println(count == 4 ? "Y" : "N");
		kb.close();
	}

}
