package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_1180 {
//Accepted Bijele
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int k = 1, q = 1, r = 2, b = 2, kn = 2, p = 8;
		int run = Integer.parseInt(kb.next());
		while(run-->0){
			StringBuilder st = new StringBuilder();
			st.append((k-Integer.parseInt(kb.next())) + " ");
			st.append((q-Integer.parseInt(kb.next())) + " ");
			st.append((r-Integer.parseInt(kb.next())) + " ");
			st.append((b-Integer.parseInt(kb.next())) + " ");
			st.append((kn-Integer.parseInt(kb.next())) + " ");
			st.append((p-Integer.parseInt(kb.next())));
			System.out.println(st);
		}
		kb.close();
	}

}
