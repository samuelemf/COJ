package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_2120 {
//Accepted DifferentDigits
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		while(kb.hasNext()){
			int from = Integer.parseInt(kb.next()),
					to = Integer.parseInt(kb.next());
			int fin = 0;
			for(int i = from; i <= to; i++)
				fin += validate(i);
			System.out.println(fin);
		}
		kb.close();

	}

	private static int validate(int n) {
		String in = ""+n;
		if(in.length() == 1)
			return 1;
		else{
			String check;
			for(int i = 0; i < in.length(); i++){
				check = in.substring(i,i+1);
				if(in.substring(i+1).contains(check))
					return 0;
			}
			return 1;
		}
	}

}
