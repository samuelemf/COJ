package edu.uprb.accepted;
import java.text.DecimalFormat;
import java.util.Scanner;

public class COJ_1538 {
//Accepted FinancialManagmentII
	public static void main(String[] args) {
		final int months = 12;
		DecimalFormat df = new DecimalFormat("$#,##0.00");
		Scanner kb = new Scanner(System.in);
		int test = Integer.parseInt(kb.nextLine());
		for(int i = 0; i < test; i++){
			double amount = 0;
			for(int j = 0; j < months; j++)
				amount+= Double.parseDouble(kb.nextLine());
			System.out.println((i + 1) + " " + df.format(amount/months));
		}
		kb.close();
	}

}
