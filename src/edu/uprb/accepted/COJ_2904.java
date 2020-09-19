package edu.uprb.accepted;
import java.math.BigInteger;
import java.util.Scanner;

public class COJ_2904 {
//Accepted SuperSum_2904
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		int a = Integer.parseInt(k.next());
		BigInteger n = null;
		BigInteger n2 = new BigInteger(k.next());
		while(a--> 1){
			n = k.nextBigInteger();
			n2 = n.add(n2);
		}
		System.out.println(n2);
		k.close();
	}

}
