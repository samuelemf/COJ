package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_1023 {
/*
 * Accepted FinancialManagment_1023
 */
	public static void main (String[]args){
		
		double a = 0;
		Scanner kb = new Scanner(System.in);
		for(int i = 0; i<12; i++)
			a += Double.parseDouble(kb.nextLine());
		System.out.printf("$%.2f", a/12.0);
		kb.close();
	}
}
