package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_1595 {
//Accepted Multiple Of Nine
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String input;
		int sum;
		String a = kb.next();
		while(!a.equals("0")){
			sum = 0;
			input = a;
			int deg = 0;
			if(input.length() != 1){	
				while (input.length() != 1) {
					for (int i = 0; i < input.length(); i++)
						sum += Integer.parseInt(input.substring(i, i + 1));
					input = ""+sum;
					sum = 0;
					deg++;
				}
			}
			else deg++;
			sum = Integer.parseInt(input);
			System.out.println(sum % 9 ==0? a + " is a multiple of 9 and has 9-degree " + deg + ".": a + " is not a multiple of 9.");
			a = kb.next();
		}

		kb.close();
	}

}
