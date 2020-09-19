package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_3694 {
//Accepted RubikPackages
	public static void main(String[] args) {
		Scanner kb = new Scanner (System.in);

		int input = Integer.parseInt(kb.next());
		
		while(input!= 0)
		{
			int counter = 0;
			double cubic =  Math.cbrt(input);
			
			for (int i = (int) Math.floor(cubic); i > 0; i--) 
				if(input % Math.pow(i, 3) == 0)
					counter++;
				
			System.out.println(counter);
				
			input = Integer.parseInt(kb.next());
		}
		kb.close();
		
	}

}