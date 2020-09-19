package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_3080 {
//Accepted Numeracy
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int run = Integer.parseInt(kb.next());
		while(run-->0){
			int a = Integer.parseInt(kb.next());
			String operator = kb.next();
			if(!(operator.equals("+")|| operator.equals("-")||
					operator.equals("*")||operator.equals("/")))
				System.out.println("No");
			int b = Integer.parseInt(kb.next());
			String ea = kb.next();
			if(!ea.equals("="))
				System.out.println("No");
			int c = Integer.parseInt(kb.next());

			if(operator.equals("+"))
				System.out.println(a+b == c ? "Yes" : "No");
			else
				if(operator.equals("-"))
					System.out.println(a-b == c ? "Yes" : "No");
				else
					if(operator.equals("*"))
						System.out.println(a*b == c ? "Yes" : "No");
					else
						System.out.println((double)a/b == c ? "Yes" : "No");
		}
		kb.close();
	}

}
