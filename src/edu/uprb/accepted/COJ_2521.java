package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_2521 {
//Accepted ZeroOrOne
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		while(kb.hasNext()){
			int zers = 0, ones = 0;
			String a = kb.next(), b = kb.next(), c = kb.next();
				if(one(a)) ones++;
				else zers++;
				if(one(b)) ones++;
				else zers++;
				if(one(c))ones++;
				else zers++;
			
			if(zers == 3 || ones == 3)
				System.out.println("*");
			else
				if(ones > zers){
					if(!one(a))
						System.out.println("A");
					else
						if(!one(b))
							System.out.println("B");
						else
							System.out.println("C");
				}
				else
				{
					if(one(a))
						System.out.println("A");
					else
						if(one(b))
							System.out.println("B");
						else
							System.out.println("C");
				}
			
		}
		kb.close();
	}

	public static boolean one(String a){
		return a.equals("1");
	}

	
}
