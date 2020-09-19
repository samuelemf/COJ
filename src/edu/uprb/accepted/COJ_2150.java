package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_2150 {
//Accepted BalancedWordsII
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int run = Integer.parseInt(kb.next());
		while(run-->0){
			int upper1 = 0, lower1 = 0, upper2 = 0, lower2 = 0;
			String in = kb.next();
			int len = in.length()/2;
			if(in.length()%2!= 0){
				String in2 = in.substring(len+1);
				in = in.substring(0, len);
				for (int i = 0; i < in.length(); i++) {
					if(in.substring(i,i+1).equals(in.substring(i,i+1).toLowerCase()))
						lower1++;
					else
						upper1++;
				}	
				for (int i = 0; i < in2.length(); i++) {
					if(in2.substring(i,i+1).equals(in2.substring(i,i+1).toLowerCase()))
						lower2++;
					else
						upper2++;
				}
				System.out.println(upper1 == upper2 && lower1 == lower2 ? "SI" : "NO");
			}
			else{
				String in2 = in.substring(len);
				in = in.substring(0, len);
				for (int i = 0; i < in.length(); i++) {
					if(in.substring(i,i+1).equals(in.substring(i,i+1).toLowerCase()))
						lower1++;
					else
						upper1++;
				}	
				for (int i = 0; i < in2.length(); i++) {
					if(in2.substring(i,i+1).equals(in2.substring(i,i+1).toLowerCase()))
						lower2++;
					else
						upper2++;
				}	
				System.out.println(upper1 == upper2 && lower1 == lower2 ? "SI" : "NO");
			}

		}
		kb.close();
	}



}
