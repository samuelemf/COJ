package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_2380 {
//Accepted Binary Check Sum
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int test = kb.nextInt();
		int sum = 0;
		for(int i = 0; i < test; i++){
			String num = Integer.toBinaryString(Integer.parseInt(kb.next()));
			for(int j = 0; j < num.length(); j++)
				if(num.substring(j, j + 1).contains("1"))
					sum++;
		}
		System.out.println(sum);
		kb.close();
	}

}














