package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_1905 {
//Accepted CreatingPasswordsII
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int run = Integer.parseInt(kb.nextLine());
		while(run-->0){
			StringBuilder st = new StringBuilder("");
			String num = kb.nextLine();
			st.append(num.substring(0, 2));
			String names = num.substring(5);
			String[]a = names.split(" ");
			for(int i = a.length; i > 0; i--){
				st.append(a[i-1]);
				if(i-1!=0)
					st.append("*");
			}
			System.out.println(st.append(num.substring(2, 4)));
		}
		kb.close();	

	}

}
