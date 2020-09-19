package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_3628 {
//Accepted Acronyms
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		while(kb.hasNextLine()){
			String[] i = kb.nextLine().split(" ");
			String[] i2 = kb.nextLine().split(" ");
			StringBuilder st = new StringBuilder();
			StringBuilder st2 = new StringBuilder();
			for (int j = 0; j < i.length; j++)
				st.append(i[j].charAt(0));
			for (int j = 0; j < i2.length; j++)
				st2.append(i2[j].charAt(0));
			System.out.println(st.toString().equals(st2.toString())?"yes":"no");
		}
		kb.close();
	}

}
