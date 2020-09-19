package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_2636 {
//Accepted JanesFirstWords_2636
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String input;
		while(kb.hasNext()){
			input = kb.nextLine();
			System.out.println(input.matches("da+dd?(i|y)") ? "She called me!!!" : "Cooing");
		}
		kb.close();
	}
}
