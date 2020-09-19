package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_1483 {
//Accepted GeometricalTaskI_1483
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String cB = kb.next();
		if(cB.equals("square")){
			int a = Integer.parseInt(kb.next());
			System.out.println((int)Math.pow(a, 2));
		}
		else{
			int a = Integer.parseInt(kb.next());
			int b = Integer.parseInt(kb.next());
			System.out.println(a*b);
		}
		
			kb.close();

	}

}
