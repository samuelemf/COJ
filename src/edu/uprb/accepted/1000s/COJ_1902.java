package edu.uprb.accepted;
import java.text.DecimalFormat;
import java.util.Scanner;

public class COJ_1902 {
//Accepted NUMBER_IDS
	public static void main(String[] args) {
	Scanner kb = new Scanner(System.in);
	int r = Integer.parseInt(kb.next());
	DecimalFormat df4 = new DecimalFormat("0000");
	DecimalFormat df3 = new DecimalFormat("000");
	DecimalFormat df2 = new DecimalFormat("00");
	while(r-->0){
		StringBuilder st = new StringBuilder();
		st.append(kb.next()+"-");
		String s = kb.next();
		String[] l = s.split("/");	
		st.append(df4.format(Integer.parseInt(l[2]))+"-");
		st.append(df2.format(Integer.parseInt(l[1]))+"-");
		st.append(df2.format(Integer.parseInt(l[0]))+"-");
		st.append(df4.format(Integer.parseInt(kb.next()))+"-");
		st.append(df3.format(Integer.parseInt(kb.next()))+"-"+
		df4.format(Integer.parseInt(kb.next())));
		System.out.println(st);
	}
	
	kb.close();
	}

}
