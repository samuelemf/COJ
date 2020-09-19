package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_1825 {
//Accepted CreatingPasswordsI
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		int run = Integer.parseInt(kb.nextLine());
		while(run-->0){
			StringBuilder st = new StringBuilder("");
			String num = kb.nextLine();
			st.append(num.substring(0, 3));
			st.append(num.substring(7).replace(" ", "*"));
			st.append(num.substring(3,6));
			System.out.println(st.toString());

		}
		kb.close();
	}

}
