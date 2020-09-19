package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_2845 {
//Accepted Quadrants
	public static void main(String[] args) {
		Scanner kb =new  Scanner(System.in);
		double x = Double.parseDouble(kb.next()), y = Double.parseDouble(kb.next());
		while(x!= 0 || y!= 0){
			if(x == 0 || y == 0)
				System.out.println("AXIS");
			else
				if(x > 0 && y > 0)
					System.out.println("Q1");
				else
					if(x < 0 && y > 0)
						System.out.println("Q2");
					else
						if(x < 0 && y < 0)
							System.out.println("Q3");
						else
							System.out.println("Q4");
			x = Double.parseDouble(kb.next()); y = Double.parseDouble(kb.next());
		}
		System.out.println("AXIS");
		kb.close();

	}

}
