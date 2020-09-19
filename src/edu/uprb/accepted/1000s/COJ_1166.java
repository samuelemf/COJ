package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_1166 {
//Accepted Speed_1166
	public static void main (String[] args){
		Scanner kb = new Scanner(System.in);
		int test = kb.nextInt();
		for(int curr = 1; curr <= test; curr++){
			int run = kb.nextInt();
			int odd = 0, even =0;
			while(run != 0){
				if(kb.nextInt() % 2 == 0)
					even++;
				else odd++;
				run--;
			}
			System.out.println(even + " even and " + odd + " odd.");
		}
		kb.close();
	}

}
