package edu.uprb.accepted;
import java.math.BigInteger;
import java.util.Scanner;

public class COJ_2420 {
//Accepted BinaryPalindrome
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int run = Integer.parseInt(kb.next());
		while(run-->0){
			BigInteger big = new BigInteger(kb.next());
			String binary = big.toString(2);			
			int yes = 0;
			for (int i = 0; i < binary.length()/2; i++) {
				int a = binary.length()-i-1;
				if(binary.substring(i,i+1).equals(binary.substring(a, a+1)))
						yes++;
			}
			System.out.println(yes == binary.length()/2 ? "YES" : "NO");
			}
				
		kb.close();
	}

}
