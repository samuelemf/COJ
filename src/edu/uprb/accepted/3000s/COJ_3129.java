package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_3129 {
//Accepted MysteriousNumber
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int run = Integer.parseInt(kb.next());
		while(run-->0){
			int max = Integer.parseInt(kb.next());
			String trick = kb.next();
			int look = Integer.parseInt(kb.next());
			String[] out = new String[max];
			if(trick.equals("odd")){
				int a = 0;
				for(int i = 1; i < max; i++)
					if(!cru(i))
						out[a++]=""+(i+1);
				System.out.println(out[look-1]);
			}

			else
			{
				int a = 0;
				for(int i = 1;  i < max; i++)
					if(!cru(i)){
						out[a++]=""+i;
					}
				System.out.println(out[look-1]);
			}

		}
		kb.close();

	}

	private static boolean cru(int a){
		return(a%2==0);
	}
}
