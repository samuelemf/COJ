package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_1306 {
/*
 * Accepted Div4_1306
 */
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int test = kb.nextInt();
		String num;
		int a;
		for(int i = 0; i < test; i++){
			num = kb.next();
			if(num.length() == 1){
				a = Integer.parseInt(num);
				if(a % 4 == 0)
					System.out.println("YES");
				else
					System.out.println("NO");
			}
			else
				if(num.length() > 1){
					a = Integer.parseInt(num.substring(num.length() - 2));
					if(a % 4 == 0)
						System.out.println("YES");
					else
						System.out.println("NO");
				}
		}


		kb.close();
	}

}
