package edu.uprb.accepted;

import java.util.Scanner;

public class COJ_2769 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int i = kb.nextInt();
		for(int k = 0; k < i; k++)
			System.out.println((k+1)+": " + "I am participating in the Engineer's day.");
		kb.close();
	}

}
