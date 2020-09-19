package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_2948{
//Accepted LazyUnitSum
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int test = Integer.parseInt(kb.nextLine());
		for(int i = 0; i < test; i++){
			String a = kb.nextLine();
			int sum = 0;
			for(int j = 0; j < a.length(); j++)
				sum += Integer.parseInt(a.substring(j, j+1));
			
		while(sum >= 10){
			String b = ""+sum;
			sum = 0;
			for(int j = 0; j < b.length(); j++)
				sum += Integer.parseInt(b.substring(j, j+1));
		}
			System.out.println(sum);
		}

		kb.close();
	}


}
