package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_1176 {
//Accepted Ternart
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int test = kb.nextInt();
		while(test!=-1){
			StringBuilder st = new StringBuilder();
			while(test!=0){
				int res = test%3;
				st.append(res);
				test/=3;
			}
			StringBuffer st1 = new StringBuffer(st);
			
			System.out.println(st1.reverse());
			test = kb.nextInt();
		}
		kb.close();
	}

}
