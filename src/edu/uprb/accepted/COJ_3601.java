package edu.uprb.accepted;

import java.util.Scanner;

public class COJ_3601 {
//Accepted WritingNumbers_3601
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		int test = Integer.parseInt(kb.next());

		String input;

		for(int i = 0; i < test; i++){
			input = kb.next();
			System.out.println(getMsg(input));
		}

		kb.close();
	}

	private static String getMsg(String input){
		switch(input){
		case "1" :
			return "one";
		case "2": 
			return "two";
		case "3":
			return "three";
		case "4":
			return "four";
		case "5" :
			return "five";
		case "6": 
			return "six";
		case "7":
			return "seven";
		case "8":
			return "eight";
		case "9" :
			return "nine";
		case "10": 
			return "ten";
		case "11":
			return "eleven";
		case "12":
			return "twelve";
		default :
			return "";
		}
	}

}
