package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_2691 {
//Accepted FirstVsSecond
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int year1 = kb.nextInt(), year2 = kb.nextInt();
		int fresh = 0, second= 0;
		while(year1--> 0)
			fresh+= kb.nextInt();
		while(year2--> 0)
			second+= kb.nextInt();
		if(fresh == second)
			System.out.println("tie");
		else
			System.out.println(fresh > second ? "first win" : "second win");
		kb.close();
	}

}
