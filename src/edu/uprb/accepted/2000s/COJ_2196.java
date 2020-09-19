package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_2196 {
//Accepted Even? Odd?
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		int num = Integer.parseInt(kb.nextLine());

		String check;
		for(int i = 0; i < num; i++){
			check = kb.nextLine();
			check = check.substring(check.length() -1);
			System.out.println(checkS(check)? "even" : "odd");
		}
		kb.close();
	}

	public static boolean checkS(String check){
		return (check.equals("0")|| check.equals("2")||check.equals("4")|| check.equals("6")|| check.equals("8"));
	}

}
