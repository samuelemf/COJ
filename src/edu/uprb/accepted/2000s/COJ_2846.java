package edu.uprb.accepted;
import java.text.DecimalFormat;
import java.util.Scanner;

public class COJ_2846 {
//Accepted ID Key
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int run = Integer.parseInt(kb.next());
		DecimalFormat df = new DecimalFormat("0000");
		for(int i = 0; i < run; i++){
			int sum = 0;
			String in = kb.next();
			for(int j = 0; j < in.length(); j++)
				sum+= Integer.parseInt(in.substring(j, j+1));
			String last3 = in.substring(in.length() - 3);
			int out = (Integer.parseInt(last3)*10) + sum;
			if(out < 1000)
				out+= 1000;
			else if(out > 9999){
				in = ""+out;
				out = Integer.parseInt(in.substring(in.length() - 4));
			}
			System.out.println(df.format(out));
		}
			
		kb.close();
	}

}
