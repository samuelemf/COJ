package edu.uprb.accepted;
import java.util.Arrays;
import java.util.Scanner;

public class COJ_1318 {
//Accepted Abc
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int[] ar = new int[3];
		int r = 3;
		while(r-->0)
			ar[r] = Integer.parseInt(kb.next());
		String out = kb.next();
		Arrays.sort(ar);
		if(out.equals("ABC"))
			System.out.println(ar[0] + " " + ar[1] + " " + ar[2]);
		else
			if(out.equals("ACB"))
				System.out.println(ar[0] + " " + ar[2] + " " + ar[1]);
			else
				if(out.equals("BAC"))
					System.out.println(ar[1] + " " + ar[0] + " " + ar[2]);
				else
					if(out.equals("BCA"))
						System.out.println(ar[1] + " " + ar[2] + " " + ar[0]);
					else
						if(out.equals("CAB"))
							System.out.println(ar[2] + " " + ar[0] + " " + ar[1]);
						else
								System.out.println(ar[2] + " " + ar[1] + " " + ar[0]);
		kb.close();
	}

}
