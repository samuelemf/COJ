package edu.uprb.accepted;
import java.text.DecimalFormat;
import java.util.Scanner;

public class COJ_3724 {
//Accepted TImeConversion
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String time = kb.next();
		StringBuilder st = new StringBuilder();
		if(time.charAt(time.length()-2) == 'P'){
			int f = Integer.parseInt(""+time.charAt(0)+""+time.charAt(1));
			if(f == 12)
				st.append(time.substring(0,time.length()-2));
			else{
			st.append(f+12);
			st.append(time.substring(2, time.length()-2));
			}
			System.out.println(st);
		}
		else{
			DecimalFormat df = new DecimalFormat("00");
			int f = Integer.parseInt(""+time.charAt(0)+""+time.charAt(1));
			if(f ==12){
				st.append("00" + time.substring(2, time.length()-2));
			}
			else{
			st.append(df.format(f));
			st.append(time.substring(2, time.length()-2));
			}
			System.out.println(st);
			
		}
			
		kb.close();
	}

}
