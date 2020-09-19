package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_2698 {
	/*			Accepted
			AplusBequalsC_2698
	 */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String input = kb.nextLine();
		char[] sum = input.toCharArray();
		int cont = 0;
		for(int i = 0; i < sum.length; i++){
			cont += (Character.getNumericValue(sum[i]) - 9);
		}
		System.out.println(cont);
		kb.close();

	}

}
