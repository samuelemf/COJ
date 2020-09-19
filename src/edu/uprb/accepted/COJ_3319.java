package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_3319 {
//Accepted Primorial
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int i = Integer.parseInt(kb.next());
		while(i-->0)
			print(Integer.parseInt(kb.next()));
		kb.close();
	}

	private static void print(int i) {
		System.out.println(N(i,1));		
	}

	private static long N(int i, long acc) {
		if(i == 1)
			return acc;
		else
			if(isPrime(i)){
				return N(i-1, acc*i);
				}
			else
				return N(i-1, acc);
	}

	private static boolean isPrime(int n) {
		if(n<2)
			return false;
		if(n == 2)
			return true;
		if(n % 2 == 0)
			return false;
		for(int x = 3; x*x <= n; x+=2)
			if(n % x == 0)
				return false;
		return true;
	}

}
