package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_2091 {
//Accepted CountingTask
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int r = Integer.parseInt(kb.nextLine());
		while(r-->0){
			String in = kb.nextLine();
			int c = 0;
			while(!in.equals("")){
				in = in.replace(in.substring(0,1), "");
				c++;
			}
			System.out.println(c);
		}
		kb.close();

	}

}
