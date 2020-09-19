package edu.uprb.accepted;
import java.text.DecimalFormat;
import java.util.Scanner;

public class COJ_2693 {
//Accepted RoundProbabilities
	public static void main(String[] args) {
		DecimalFormat df1 = new DecimalFormat("#,##0.0");
		DecimalFormat df2 = new DecimalFormat("#,##0.00");
		DecimalFormat df3 = new DecimalFormat("#,##0.000");
		DecimalFormat df4 = new DecimalFormat("#,##0.0000");
		DecimalFormat df5 = new DecimalFormat("#,##0.00000");
		DecimalFormat df6 = new DecimalFormat("#,##0.000000");

		Scanner kb = new Scanner(System.in);
		double num = Double.parseDouble(kb.next());
		int round = Integer.parseInt(kb.next());
		
		if(round == 1)
			System.out.println(df1.format(num));
		else if(round == 2)
			System.out.println(df2.format(num));
		else if(round == 3)
			System.out.println(df3.format(num));
		else if(round == 4)
			System.out.println(df4.format(num));
		else if(round == 5)
			System.out.println(df5.format(num));
		else
			System.out.println(df6.format(num));

		kb.close();

	}

}
