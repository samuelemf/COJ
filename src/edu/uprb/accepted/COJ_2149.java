package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_2149 {
//Accepted BalancedWords I
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int test = Integer.parseInt(kb.nextLine());
		for(int i = 0; i < test; i++){
			String in = kb.nextLine();
			int low = 0, high = 0;
			for(int j = 0; j < in.length(); j++){
				String check = in.substring(j, (j+1));
				if(check.equals(check.toUpperCase()))
					high++;
				else if(check.equals(check.toLowerCase()))
					low++;
			}
			System.out.println(low == high ? "SI" : "NO");
		}
		kb.close();
	}

}
