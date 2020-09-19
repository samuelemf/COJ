package edu.uprb.accepted;
import java.math.BigInteger;
import java.util.Scanner;

public class COJ_1102 {
//Accepted YouCanSay11_1102
	public static void main(String[] args) throws Exception {

		Scanner read = new Scanner(System.in);
		BigInteger input;
		BigInteger DIVISOR = new BigInteger("11");
		while(true){
			input = new BigInteger(read.nextLine());
			if(input.toString().equals("0"))
				break;
			System.out.println(input.mod(DIVISOR).toString().equals("0") ? input + " is a multiple of 11." : input + " is not a multiple of 11.");
		}
		read.close();
	}
}
