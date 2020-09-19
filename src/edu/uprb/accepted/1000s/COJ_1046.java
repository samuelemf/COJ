package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_1046 {
//Accepted ProductSubsequence
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int times = Integer.parseInt(kb.next());
		while(times-->0){
			int from = Integer.parseInt(kb.next()),
					to = Integer.parseInt(kb.next());
			long count = 0;
			for (int i = from; i <= to; i++) {
				count += i*(i+1)*(i+2);
			}
			System.out.println(count%100);
		}
		kb.close();
	}

}
