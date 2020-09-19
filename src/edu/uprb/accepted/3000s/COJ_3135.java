package edu.uprb.accepted;
import java.math.BigInteger;
import java.util.Scanner;

public class COJ_3135 {
//Accepted Factorials
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int run = Integer.parseInt(kb.next());
		while(run-->0){
			BigInteger num = new BigInteger(kb.next());
			String in = fac(num).toString();
			int len = in.length();
			for(int i = len; i > 0; i--)
				if(in.charAt(i-1)!='0'){
					System.out.println(in.charAt(i-1));
					break;
				}
		}
		
		kb.close();
	}

	public static BigInteger fac(BigInteger n){
		BigInteger one = BigInteger.ONE;
		BigInteger total = one;
		BigInteger x;
		for(x = n; x.compareTo(one) >= 1; x = x.subtract(one))
			total = total.multiply(x);
		
		return total;
	}
	
}
