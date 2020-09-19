package edu.uprb.accepted;
import java.math.BigInteger;
import java.util.Scanner;

public class COJ_1805{
//Accepted HarderAplusB_1805
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		BigInteger mult = new BigInteger("2");
		BigInteger num = new BigInteger(kb.next());
		BigInteger num2 = new BigInteger(kb.next());
		num = num.add(num2);
		System.out.println(num.multiply(mult));
		kb.close();
	}

}
