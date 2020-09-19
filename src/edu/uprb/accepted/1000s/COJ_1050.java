package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_1050 {
//Accepted Coprimes
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = Integer.parseInt(kb.next());
		int count = 0;
		for (int i = 1; i <n; i++) {
			if( gcd(n, i) == 1)
				count++;
		}
		System.out.println(count);
		kb.close();
	}
	static int gcd(int a, int b)
	{
	  if(a == 0 || b == 0) return a+b; // base case
	  return gcd(b,a%b);
	}
	
}
