package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_3148 {
	//Accepted ColorOfTheCell_3148
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int i, j;
		String input;
		int run = Integer.parseInt(kb.nextLine());
		while(run-- > 0){
			input = kb.nextLine();
			i = (int)input.charAt(0) - (int)'a';
			j = Integer.parseInt(input.substring(1)) - 1;
			if(j % 2 == 1)
				System.out.println(((i % 2 == 1 && j % 2 == 1) ? "WHITE" : "BLACK"));
			else
				if(j % 2 == 0)
					System.out.println(((i % 2 == 1 && j % 2 == 0) ? "BLACK" : "WHITE"));
		}
		kb.close();
	}

}
