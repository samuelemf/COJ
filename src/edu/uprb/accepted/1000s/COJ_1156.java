package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_1156 {
//Accepted LifetheUniverseandEverything_1156
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int input;
		
		do {
			input = kb.nextInt();
			if (input == 42)
				break;
			else
				if(input < 100 && input >= 0)
			System.out.println(input);
		} while (true);
		kb.close();
	}
	
}
