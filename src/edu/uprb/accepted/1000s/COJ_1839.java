package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_1839 {
//Accepted A Funny Task
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int run = Integer.parseInt(kb.next());
		while(run-->0){
			int count = Integer.parseInt(kb.next());
			count = (count+3)*2;	
			count = (count+3)*2;
			count = (count+3)*2;
			System.out.println(count);
		}

		kb.close();
	}

}
