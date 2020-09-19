package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_2746 {
//Accepted Flea's Festival of Reading
	public static void main(String[] args) {
	
		Scanner kb = new Scanner(System.in);
		String in = kb.nextLine();
		int mika = 0;
		for(int i = 0; i < in.length(); i++)
			if(in.substring(i, (i+1)).equals("A") ||
					in.substring(i, (i+1)).equals("E") ||
					in.substring(i, (i+1)).equals("I") ||
					in.substring(i, (i+1)).equals("O") ||
					in.substring(i, (i+1)).equals("U"))
				mika++;
		System.out.println(mika + " " + (-(mika-in.length())));
		kb.close();
	}

}
