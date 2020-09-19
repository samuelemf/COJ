package edu.uprb.accepted;

import java.util.Scanner;

public class COJ_2634 {
//Accepted BirtdayStatistics
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int[] mon = new int [12];
		int inputN = 0;
		int run = Integer.parseInt(kb.nextLine());
		int[] test = new int[run];
		while(run-- > 0){
			String in = kb.nextLine();
			in = in.substring(5);	

			if (!in.substring(2, 3).equals("/"))
				in = in.substring(2);
			else
				in = in.substring(3);

			if (!in.substring(2, 3).equals("/"))
				in = in.substring(0,1);
			else
				in = in.substring(0,2);
			inputN = Integer.parseInt(in);
			test[run] = inputN;
		}
		for(int i = 0; i < test.length; i++)
			mon[test[i]-1]++;



		for(int count = 0; count < mon.length; count++)
			System.out.println((count + 1) + " " + mon[count]);
		kb.close();
	}

}
