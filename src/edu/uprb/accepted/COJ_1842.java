package edu.uprb.accepted;

import java.util.Scanner;

public class COJ_1842 {
//Accepted Distance Of Manhattan
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int run = Integer.parseInt(kb.next());
		while(run-->0){
			int x1 = Integer.parseInt(kb.next()),
					y1 = Integer.parseInt(kb.next()),
					x2 = Integer.parseInt(kb.next()),
					y2 = Integer.parseInt(kb.next());

			System.out.println(Math.abs((Math.max(x1, x2)-Math.min(x1,x2))+(Math.max(y1, y2)-Math.min(y1,y2))));
		}
		kb.close();
	}

}
