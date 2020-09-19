package edu.uprb.accepted;


import java.text.DecimalFormat;
import java.util.Scanner;

public class COJ_2785 {
//Accepted Who is the winner?
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,##0.00");
		Scanner kb = new Scanner(System.in);
		int n = Integer.parseInt(kb.next());
		int count = 0;
		for(int i = 0; i < n; i++)
			count += Integer.parseInt(kb.next());
		System.out.println(df.format((double)count  / n));
		kb.close();

	}

}
