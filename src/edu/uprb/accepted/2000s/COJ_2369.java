package edu.uprb.accepted;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class COJ_2369 {
//Accepted AddAndMultiply
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int times = Integer.parseInt(kb.next());
		while(times-->0){
			BigInteger a = new BigInteger(kb.next());
			BigInteger b = new BigInteger(kb.next());
			BigInteger c = new BigInteger(kb.next());
			BigInteger[] arr = new BigInteger[6];
			arr[0] = (a.add(b)).multiply(c);
			arr[1] = (c.add(b)).multiply(a);
			arr[2] = (c.add(a)).multiply(b);
			arr[3] = (a.multiply(c)).add(b);
			arr[4] = (a.multiply(b)).add(c);
			arr[5] = (b.multiply(c)).add(a);
			Arrays.sort(arr);
			System.out.println(arr[0] + " " + arr[5]);
		}
		kb.close();

	}

}
