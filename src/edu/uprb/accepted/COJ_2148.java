package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_2148 {
//Accepted QuadraticEquations
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int run = Integer.parseInt(kb.next());
		while(run-- > 0){
			int a = Integer.parseInt(kb.next()), b = Integer.parseInt(kb.next()), c =Integer.parseInt(kb.next());
			System.out.println(Math.pow(b, 2) - (4*a*c) < 0? "NO" : "SI");
		}
		kb.close();
	}

}
