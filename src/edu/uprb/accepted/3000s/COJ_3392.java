package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_3392 {
//Accepted FactoryOfPaintedWoodenToys
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int num = Integer.parseInt(kb.next());
		while(num!=0){
			System.out.println(num < 3?"0":(num-2)*12);
			num = Integer.parseInt(kb.next());
		}
		kb.close();

	}

}
