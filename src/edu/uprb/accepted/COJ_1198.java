package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_1198 {
//Accepted PrimeGap
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int i = Integer.parseInt(kb.next());
		while(i!=0){
			System.out.println(primeGap(i));
			i = Integer.parseInt(kb.next());
		}
		kb.close();

	}

	private static int primeGap(int i) {
		int a = 0;
		if(!isPrime(i)){
			for (int j = i; j > 2; j--)
				if(isPrime(j)){
					a += i - j;
					break;
				}
			for (int j = i; j <= 1299709 ; j++)
				if(isPrime(j)){
					a+= j - i;
					break;
				}
			return a;
		}
		return 0;
	}

	//checks whether an int is prime or not.
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

