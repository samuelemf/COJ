package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_2205 {
//Accepted CountingOnes
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int test = kb.nextInt();
		int sum = 0;
		for(int i = 0; i < test; i++){
			int a = Integer.parseInt(kb.next()) , b = Integer.parseInt(kb.next());
			while(b-- >= a){
				String num = Integer.toBinaryString(b + 1);
				for(int j = 0; j < num.length(); j++)
					if(num.substring(j, j + 1).contains("1"))
						sum++;
			}
			System.out.println(sum);
			sum = 0;
		}
		kb.close();
	}

}
