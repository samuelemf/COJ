package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_1070 {
//Accepted ASimpleCalculation
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		while(kb.hasNext()){
		int in = Integer.parseInt(kb.next());
		System.out.println(squaresI(in) + " " + rect(in));
		}
		kb.close();

	}

	public static int squaresI(int num){
		return squares(num, 0);
	}
	private static int squares(int num, int count){
		if(num == 1)
			return count+1;
		else
			return squares(num-1, count+= num*num);
	}

	public static int rect(int num){
		int count = 0;
		for(int i = 1; i <= num; i++)
			for (int j = 1; j <= num; j++)
				count += i*j;
		return count;
	}

}