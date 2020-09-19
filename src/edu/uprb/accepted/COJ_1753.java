package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_1753 {
//Accepted Numbersrebmun
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int test = Integer.parseInt(kb.next());
		while(test-->0){
			StringBuilder st = new StringBuilder();
			insert(st, kb);
			String nonR = st.toString();
			int len = nonR.length();
			int counter = 0;
			for (int i = 0; i < len/2; i++)
				if(nonR.substring(i,i+1).equals(nonR.substring(len-1-i, len-i)))
					counter++;
				System.out.println(counter == nonR.length()/2? "YES":"NO");
		}
		kb.close();
	}

	private static void insert(StringBuilder st, Scanner kb) {
		String in = kb.next();
		for (int i = 0; i < in.length(); i++) {
		st.append(insertNu(in.substring(i,i+1)));
		}
		
	}

	private static String insertNu(String s) {
		switch (s) {
		case "A":
		case "a":
		case "B":
		case "b":
		case "C":
		case "c":
			return "2";
		case "D":
		case "d":
		case "E":
		case "e":
		case "F":
		case "f":
			return "3";
		case "G":
		case "g":
		case "H":
		case "h":
		case "I":
		case "i":
			return "4";
		case "J":
		case "j":
		case "K":
		case "k":
		case "L":
		case "l":
			return "5";
		case "M":
		case "m":
		case "N":
		case "n":
		case "O":
		case "o":
			return "6";
		case "P":
		case "p":
		case "Q":
		case "q":
		case "R":
		case "r":
		case "S":
		case "s":
			return "7";
		case "T":
		case "t":
		case "U":
		case "u":
		case "V":
		case "v":
			return "8";
		case "W":
		case "w":
		case "X":
		case "x":
		case "Y":
		case "y":
		case "Z":
		case "z":
			return "9";
		default:
			return "";
		}
	}

}
