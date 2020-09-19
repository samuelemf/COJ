package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_2625 {
//Accepted GiftProblem
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int a = Integer.parseInt(kb.next()), b = Integer.parseInt(kb.next());
		StringBuilder st = null;
		String[] wrap = {"O", "I", "E"};
		for(int i = 0; i < a; i++){
			st = new StringBuilder();
			for(int k = 0; k < b; k++){
				st.append(wrap[(k+i)%wrap.length]);
			}
			System.out.println(st);
		}
		kb.close();
	}

}
