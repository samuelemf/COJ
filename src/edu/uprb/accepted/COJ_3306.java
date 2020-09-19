package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_3306 {
//Accepted AnotherEasySumProblem_3306
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		String a = kb.next();
		String b = kb.next();
		int aW = Integer.parseInt(a, 8);
		int bw = Integer.parseInt(b, 8);
		String output = Integer.toHexString(aW + bw);
		System.out.println("0x" + output);

		kb.close();

	}

}
