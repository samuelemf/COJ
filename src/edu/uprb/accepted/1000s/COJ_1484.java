package edu.uprb.accepted;

import java.util.Scanner;

public class COJ_1484 {
	
//Accepted HottestMountain_1484
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int test = kb.nextInt();
		double[] arr = new double [test];
		
		for(int curr = 0; curr < test; curr++)
			arr[curr] = kb.nextDouble();
		
		int max = 0;
		for(int curr = 1; curr < test; curr++)
				if (arr[curr] >= arr[max])
					max = curr;
		System.out.println(max + 1);
		kb.close();
	}

}
