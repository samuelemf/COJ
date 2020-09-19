package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_3375 {
//Accepted NaebbiracPhrases
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int run = Integer.parseInt(kb.next());
		while(run-->0){
			String f1 = kb.next();
			String f2 = kb.next();
			int count = 0;
			for(int i = 0; i < f1.length(); i++)
				if(!f1.substring(i,i+1).equals(f2.substring(i,i+1)))
					count++;
			System.out.println(count);
		}
		kb.close();
	}

}
