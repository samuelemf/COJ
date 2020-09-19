package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_2322 {
/*
 * Accepted ElectricalOutlets_2322
 */
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		int test = kb.nextInt();
		for(int j = 0; j < test; j++){
		int strips = kb.nextInt();
		int result = 0;
		for(int i = 0; i < strips - 1; i++)
			result += kb.nextInt() - 1;
		result += kb.nextInt();
		
		System.out.println(result);
		}
		kb.close();
		
	}

}
