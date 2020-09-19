package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_1441 {
//Accepted Egypt
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int 	i1 = Integer.parseInt(kb.next()),
				i2 = Integer.parseInt(kb.next()),
				i3 = Integer.parseInt(kb.next());
		while(i1 != 0 && i2 != 0 && i3 != 0){
			System.out.println(check(i1,i2,i3)?"right":"wrong");
			i1 = Integer.parseInt(kb.next());
			i2 = Integer.parseInt(kb.next());
			i3 = Integer.parseInt(kb.next());
		}
		kb.close();

	}

	private static boolean check(int i1, int i2, int i3) {
		return (Math.pow(i1, 2) == (Math.pow(i2, 2) + Math.pow(i3, 2))) || (Math.pow(i2, 2) == (Math.pow(i1, 2) + Math.pow(i3, 2)))
				|| (Math.pow(i3, 2) == (Math.pow(i2, 2) + Math.pow(i1, 2)));
	}

}
