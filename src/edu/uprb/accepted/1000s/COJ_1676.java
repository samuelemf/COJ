package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_1676 {
//Accepted LetsUsHelpGeorge
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int i = Integer.parseInt(kb.next());
		int coun = 1;
		while(i!=0){
			StringBuilder st = new StringBuilder("Case " +coun+":\n");
			st.append("n = " + i + ", diamonds = ");
			long res = 0;
			for(int b = i; b >=1; b--)
				res += Math.pow(b, 2);
			
			System.out.println(st.append(res));
			coun++;
			i = Integer.parseInt(kb.next());
		}
		kb.close();
	}

}
