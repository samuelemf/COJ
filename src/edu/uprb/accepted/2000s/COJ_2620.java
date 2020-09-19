package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_2620 {
//Accepted Aaaaaaaah
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int r = kb.nextInt();
		StringBuilder st = new StringBuilder("A");
		for(int i = 0; i < r*4; i++)
			st.append("a");
		System.out.println(st.append("h"));
		kb.close();
	}

}
