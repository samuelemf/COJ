package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_1244 {
//Accepted FlowersFlourishfromFrance
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String in = kb.nextLine();
		while(!in.equals("*")){
			String[]a =	in.split(" ");
			int words = a.length;
			String chec = a[0].substring(0, 1).toLowerCase();
			for(int i = 1; i < a.length; i++)
				if(!a[i].substring(0,1).toLowerCase().equals(chec)){
					words--;
					break;
				}
			System.out.println(words == a.length ? "Y" : "N");
			in = kb.nextLine();
		}

		kb.close();
	}

}
