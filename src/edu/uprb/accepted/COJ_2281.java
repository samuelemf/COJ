package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_2281 {
//Accepted Encoded Message
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int r = Integer.parseInt(kb.next());
		while(r-->0){

			String in = kb.next();
			int num = (int)Math.sqrt(in.length());
			String[][]arr = new String[num][num];
			int len = 0;
			for(int i = 0; i < num; i++)
				for(int j = 0; j < num; j++){
					arr[i][j] = in.substring(len, len+1);
					len++;
				}

			StringBuilder st = new StringBuilder();
			for(int col = arr[0].length-1; col >=0; col--){
				for(int row = 0; row < arr.length; row++)
					st.append(arr[row][col]);

			}
			System.out.println(st);
		}
		kb.close();

	}

}
