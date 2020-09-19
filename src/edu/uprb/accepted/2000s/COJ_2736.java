package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_2736 {
//Accepted Coco-Bits and their Relatives
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		int i = 0;
		StringBuilder st = new StringBuilder(a);
		while(true){
			i = 0;
			for(int k = 0; k < a.length(); k++)
				if(a.substring(k, k+1).equals("1"))
					i++;
			a = Integer.toBinaryString(i);
			if(i != 1)
			st.append("\n"+ a);
			else
				if(i == 1){
				System.out.println(st);
				break;
			}
		}
		in.close();

	}

}
