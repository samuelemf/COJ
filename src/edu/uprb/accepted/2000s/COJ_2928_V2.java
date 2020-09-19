package edu.uprb.accepted;
import java.math.BigInteger;
import java.util.Scanner;

public class COJ_2928_V2 {
//Accepted APuzzlefromRedMatematica
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int num = Integer.parseInt(kb.next()), rep = Integer.parseInt(kb.next());
		while(num!=0&&rep!=0){
			StringBuilder st = new StringBuilder();
			for(int i = 0; i < rep; i++)
				st.append(num);
			BigInteger numOut = new BigInteger(""+st);
			numOut = numOut.pow(2);
			int totalSum = 0;
			StringBuilder out = new StringBuilder(""+numOut);
			for(int j = 0; j < out.length(); j++)
				totalSum += Integer.parseInt(out.substring(j, j+1));
			System.out.println(totalSum);
			num = Integer.parseInt(kb.next()); rep = Integer.parseInt(kb.next());
		}
		kb.close();

	}

}
