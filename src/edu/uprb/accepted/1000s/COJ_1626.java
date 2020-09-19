package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_1626 {
//Accepted AddingReversedNumbers
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int run = Integer.parseInt(kb.next());
		while(run-->0){
			StringBuffer a1 = new StringBuffer(kb.next());
			int a = Integer.parseInt(""+a1.reverse());
			a1 =  new StringBuffer(kb.next());
			int b = Integer.parseInt(""+a1.reverse());
			StringBuffer sum = new StringBuffer("" +(a+b));
			System.out.println(Integer.parseInt(""+sum.reverse()));
		}
		kb.close();

	}

}
