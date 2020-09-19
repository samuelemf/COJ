package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_1059 {
//Accepted NumberParity
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int i = Integer.parseInt(kb.nextLine());
		while(i!=0){
			String b = Integer.toBinaryString(i);
			int c = 0;
			for(int j = 0; j < b.length(); j++)
				if(Integer.parseInt(b.substring(j,j+1))==1)
					c++;
			StringBuilder st = new StringBuilder("The parity of " + b
			+ " is " + c + " (mod 2).");
			System.out.println(st);
			i = Integer.parseInt(kb.nextLine());
		}
		kb.close();
	}

}
