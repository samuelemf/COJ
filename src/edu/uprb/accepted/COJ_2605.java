package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_2605 {
//Accepted Beautiful Yekaterinburg
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int[] year = {1,7,2,3};
		System.out.println(year[Integer.parseInt(kb.next()) - 1]);
		kb.close();
	}

}
