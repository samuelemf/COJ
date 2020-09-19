package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_1662 {
//Accepted Run-Length Encoding-Decoding
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int times = Integer.parseInt(kb.next());
		int i = 1;
		while(times-->0){
			String line = kb.next();
			StringBuilder st = new StringBuilder("Case " + (i++) + ": ");
			int len = line.length();
			int count = 0;
			while(len-->0){
				char s = line.charAt(count++);
				if(Character.isAlphabetic(s))
					add(st, s, count, line);
			}
			System.out.println(st);

		}
		kb.close();
	}

	private static void add(StringBuilder st, char s, int count, String line) {
		StringBuilder num = new StringBuilder();
		
		while(Character.isDigit(line.charAt(count))){
			num.append(line.charAt(count++));
			if(count == line.length())
				break;
		}
		
		int times = Integer.parseInt(num.toString());
		while(times-->0)
			st.append(s);
	}

}
