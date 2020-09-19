package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_3137 {
//Accepted ValidateABC
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int run = Integer.parseInt(kb.next());
		while(run-->0){
			    long a = Long.parseLong(kb.next()),
					b = Long.parseLong(kb.next()),
					c = Long.parseLong(kb.next());
			System.out.println(validate(a,b,c) ? "YES" : "NO");
		}
		kb.close();
	}

	public static boolean validate(long a, long b, long c){
		return((a + b == c)|| (a - b == c) || (a * b == c) || (b!=0 && a / b == c) || (b!=0 && a % b == c) );
	}

}
