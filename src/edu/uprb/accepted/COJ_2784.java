package edu.uprb.accepted;
import java.util.Arrays;
import java.util.Scanner;

public class COJ_2784 {
//Accepted InOrderOfSize
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int run = Integer.parseInt(kb.next());
		int[] a = new int[run];
		StringBuilder st = new StringBuilder();
		for(int i = 0; i < run;i++)
			a[i] =  Integer.parseInt(kb.next());
		Arrays.sort(a);
		st.append(a[a.length-1]);
		for(int i = 0; i < run-1;i++)
			st.append(" " +a[i]);

		System.out.println(st.toString());
		kb.close();
	}

}
