package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_2231 {
//Accepted Challenge
	public static void main(String[] args) {
		int player1 = 0, player2 = 0;
		Scanner kb = new Scanner(System.in);
		int cases = Integer.parseInt(kb.next());
		String A, B;
		for(int i = 0; i < cases; i++){
			A = kb.next();
			B = kb.next();
			if(A.equals("rock")){
				int result = rock(B);
				if(result == 1)
					player1++;
				else
					if(result == 2)
						player2++;
			}
			else
				if(A.equals("scissors")){
					int result = scissors(B);
					if(result == 1)
						player1++;
					else
						if(result == 2)
							player2++;
				}
				else{
					int result = paper(B);
					if(result == 1)
						player1++;
					else
						if(result == 2)
							player2++;
				}
		}
		if(player1 > player2)
			System.out.println("A win");
		else if(player2 > player1)
			System.out.println("B win");
		else
			System.out.println("tied");
		kb.close();
	}

	private static int paper(String B) {
		if(B.equals("rock"))
			return 1;
		else
			if(B.equals("scissors"))
				return 2;
			else
				return 0;

	}

	private static int scissors(String B) {
		if(B.equals("paper"))
			return 1;
		else
			if(B.equals("rock"))
				return 2;
			else
				return 0;

	}

	private static int rock(String B) {
		if(B.equals("scissors"))
			return 1;
		else
			if(B.equals("paper"))
				return 2;
			else
				return 0;
	}



}
