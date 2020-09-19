package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_1238 {
//Accepted FactorialAgain!
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String num = kb.next();
		while(!(num.equals("0"))){
			int count = 0;
			int des = num.length();
			for(int i = 0; i < num.length(); i++){
				count+= fact(des) * Integer.parseInt(num.substring(i, i+1));
				des--;
			}
			System.out.println(count);
			num = kb.next();
		}
		kb.close();
	}

	private static int fact(int i) {
		if(i == 1)
			return 1;
		else
			return i * (fact(i-1));
	}



}
