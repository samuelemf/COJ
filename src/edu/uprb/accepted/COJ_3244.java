package edu.uprb.accepted;

import java.util.Arrays;
import java.util.Scanner;

public class COJ_3244 {
//Accepted FUNGHI
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int r = 8;
		int[] rt = new int[r];
		int i = 0;
		while(r-->0){
			rt[i]=Integer.parseInt(kb.next());
			i++;
		}
		int total1 = 0, total2 = 0;
		int[] results = new int[4];
		total1 = rt[0]+ rt[1]+rt[2]+rt[3];
		total2 = rt[4]+ rt[5]+rt[6]+rt[7];
		results[0]= Math.max(total1, total2);
		total1 = 0; total2 =0;
		total1 = rt[1]+ rt[2]+rt[3]+rt[4];
		total2 = rt[5]+ rt[6]+rt[7]+rt[0];
		results[1] = Math.max(total1, total2);
		total1 = 0; total2 =0;
		total1 = rt[2]+ rt[3]+rt[4]+rt[5];
		total2 = rt[6]+ rt[7]+rt[0]+rt[1];
		results[2] = Math.max(total1, total2);
		total1 = 0; total2 =0;
		total1 = rt[3]+ rt[4]+rt[5]+rt[6];
		total2 = rt[7]+ rt[0]+rt[1]+rt[2];
		results[3] = Math.max(total1, total2);
		Arrays.sort(results);
		System.out.println(results[results.length-1]);
		kb.close();
	}

}
