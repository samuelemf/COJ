package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_3106 {
//Accepted The Beautiful Numbers
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String in = kb.next() + kb.next();
		System.out.println(in.equals(reverse(in))?"Yes":"No");
		kb.close();

	}

	private static String reverse(String i){
		StringBuffer a = new StringBuffer(i);
		return a.reverse().toString();
	}
	
}
