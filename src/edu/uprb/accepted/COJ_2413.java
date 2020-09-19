package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_2413 {
/*
 * Accepted Div5_2413
 */
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		String num;
		char n ;
		int test = kb.nextInt();
		for(int i = 0; i < test; i++){
			num = kb.next();
			
			n = num.charAt(num.length()-1);
//			if( n == '5' || n == '0')
//				System.out.println("YES");
//			else
//				System.out.println("NO");	
			System.out.println(n == '5' || n == '0' ? "YES":"NO");
		}
			
		kb.close();
	}
	
}
//big integer
//Divsibilty rules