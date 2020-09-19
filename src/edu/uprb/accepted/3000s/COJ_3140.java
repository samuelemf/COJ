package edu.uprb.accepted;
import java.util.Arrays;
import java.util.Scanner;

public class COJ_3140 {
//Accepted SimpleSort
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int run  = Integer.parseInt(kb.next());
		int[] a = new int[run];
		while(run-->0){
			a[run] = Integer.parseInt(kb.next());
		}
		Arrays.sort(a);
		for(int i = 0; i < a.length;i++)
			System.out.println(a[i]);
		kb.close();
	}

}
