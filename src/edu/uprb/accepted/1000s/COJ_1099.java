package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_1099 {
//Accepted PythagoreanNumbers_1099
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int fir, sec, ter;

		do {
			fir = kb.nextInt();
			if (fir == 0)
				break;
			sec = kb.nextInt();
			if (sec == 0)
				break;
			ter = kb.nextInt();
			if (ter == 0)
				break;
			if (Math.pow(fir, 2) + Math.pow(sec, 2) == Math.pow(ter, 2))
				System.out.println("right");
			else if (Math.pow(fir, 2) + Math.pow(ter, 2) == Math.pow(sec, 2))
				System.out.println("right");
			else if (Math.pow(sec, 2) + Math.pow(ter, 2) == Math.pow(fir, 2))
				System.out.println("right");
			else
				System.out.println("wrong");
		} while (true);
		kb.close();
	}

}
