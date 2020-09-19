package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_1188 {
//Accepted CowMultiplication
	public static void main(String[] args) {
		Scanner kb  = new Scanner(System.in);
		String a = kb.next(), b = kb.next();
		int count = 0;
		for(int i =0; i < a.length(); i++)
			for(int j = 0; j < b.length(); j++)
				count+= Integer.parseInt(a.substring(i,i+1)) * Integer.parseInt(b.substring(j,j+1));
		System.out.println(count);
		kb.close();
	}

}
