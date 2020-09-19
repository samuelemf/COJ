package edu.uprb.accepted;

import java.util.Scanner;

public class COJ_1136 {
//Accepted PrimeGenerator
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int run = Integer.parseInt(kb.next());
		while(run-->0){
			long a = Long.parseLong(kb.next()), b = Long.parseLong(kb.next());
			if(a == 1)
				a++;
			for(long j = a; j <= b; j++){
				if(isPrime(j))
					System.out.println(j);
			}
			System.out.println();
		}

		kb.close();
	}

	private static boolean isPrime(long n) {
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
