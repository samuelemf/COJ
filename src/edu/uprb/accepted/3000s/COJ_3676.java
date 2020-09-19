package edu.uprb.accepted;
import java.math.BigDecimal;
import java.util.Scanner;

public class COJ_3676 {
//Accepted BiDivisonBy5
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int i = 0;
		int run = Integer.parseInt(kb.next());
		while(run-->0){
			BigDecimal num = new BigDecimal(kb.next());
			BigDecimal div = new BigDecimal("5");
			BigDecimal out = new BigDecimal(num.divide(div).toString());
			System.out.println("Case " + ++i + ": " + out.toString().replace(".", ","));
		}
		kb.close();
	}

}
