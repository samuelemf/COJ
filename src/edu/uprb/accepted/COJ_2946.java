package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_2946 {
//Accepted InvertingTheParity
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int num = Integer.parseInt(kb.next());
		while(num-->0){
			int a = Integer.parseInt(kb.next());
			if(a%2!=0)
				while(a%2!=0)
					a *= 2;
				 else
					while(a%2!=1) 
						a /= 2;
					
			System.out.println(a);
		}
		kb.close();
	}

}
