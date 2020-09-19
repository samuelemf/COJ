package edu.uprb.accepted;
import java.util.Arrays;
import java.util.Scanner;

public class COJ_3388 {
//Accepted Hugo's Homework
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		String num = kb.nextLine();
		int count = 0;
		while(true){
			char[] a = num.toCharArray();
			Arrays.sort(a);
			StringBuilder st = new StringBuilder();
			for(int i = 0; i < a.length; i++)
				st.append(a[i]);

			int b = Integer.parseInt(num)-Integer.parseInt(st.toString());
			count++;
			if(b == 0){
				System.out.println(count);
				break;
			}
			num = ""+b;
		}
		kb.close();

	}

}
