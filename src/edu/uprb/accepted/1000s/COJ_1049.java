package edu.uprb.accepted;
import java.util.Arrays;
import java.util.Scanner;

public class COJ_1049 {
//Accepted Sum_1049
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String a = kb.nextLine();
		char[] cha = a.toCharArray();
		Arrays.sort(cha);
		System.out.println(cha);
		kb.close();
	}

}
