package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_1840 {
//Accepted BrokenStrings
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int run = Integer.parseInt(kb.next());
		while(run-->0){
			int b = 0, r = 0, o = 0, k = 0,e = 0, n = 0;
			String pass = kb.next();
			for(int i = 0; i < pass.length(); i++){
				String charr = pass.substring(i, i+1);
				if(charr.equals("B"))
					b++;
				else
					if(charr.equals("R"))
						r++;
					else
						if(charr.equals("O"))
							o++;
						else
							if(charr.equals("K"))
								k++;
							else
								if(charr.equals("E"))
									e++;
								else
									if(charr.equals("N"))
										n++;
			}
				System.out.println(!(b==r && r==o&& o ==k && k==e && e==n) ? "Secure" : "No Secure");
		}
		kb.close();
	}

}
