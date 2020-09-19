package edu.uprb.accepted;

import java.util.Scanner;

public class COJ_1326 {
	/*			Accepted
			AccountBalance_1326
	*/
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int test = kb.nextInt();

		for (int i = 0; i < test; i++) {
			int account = kb.nextInt();
			int transactions = kb.nextInt();

			for (int curr = 0; curr < transactions; curr++) {
				String letter = kb.next();
				int amount = kb.nextInt();
				if (letter.equals("C"))
					account += amount;
				else if (letter.equals("D"))
					account -= amount;
			}
			System.out.println(account);
		}
		kb.close();
	}

}
