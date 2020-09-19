package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_1003 {
//Accepted GeneralElection_1003
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		int test = Integer.parseInt(kb.next());
		for(int run = 0; run < test; run++){
			int rows = Integer.parseInt(kb.next()), columns = Integer.parseInt(kb.next());

			int[][] array = new int[columns][rows];
			int[] results = new int[rows];

			for(int i = 0; i < array.length; i++)
				for(int j = 0; j < array[i].length; j++)
					array[i][j] = Integer.parseInt(kb.next());


			for(int col = 0; col < array[0].length; col++){
				int total = 0;
				for(int row = 0; row < array.length; row++)
					total+= array[row][col];
				results[col] = total;
			}
			
			int minV = results[0];
			int index = 0;
			for(int t = 1; t < results.length; t++)
				if(minV < results[t]){
					minV = results[t];
					index = t;
				}
			System.out.println(index + 1);
		}

		kb.close();

	}


}
