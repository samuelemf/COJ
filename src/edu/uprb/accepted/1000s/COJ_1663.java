package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_1663 {
//Accetped ErrorCorrection
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = Integer.parseInt(kb.next());
		while(n!=0){
			int[][] arr = new int[n][n];
			int[] f = fillA(arr, kb,n);
			int[] c = columns(arr, n);
			boolean[] fYoN = new boolean[n];
			boolean[] cYoN = new boolean[n];
			int oddF = 0;
			int oddC = 0;
			for (int i = 0; i < cYoN.length; i++) {
				if(f[i]%2!=0){
					fYoN[i] = true;
					oddF++;
				}
				else
					fYoN[i] = false;

				if(c[i]%2!=0){
					cYoN[i] = true;
					oddC++;
				}
				else
					cYoN[i] = false;
			}

			if(oddC == 0 && oddF == 0)
				System.out.println("OK");
			else if(oddC>1 || oddF >1)
				System.out.println("Corrupt");
			else{
				StringBuilder st = new StringBuilder("Change bit (");
				for(int i = 0; i < n; i++)
					if(fYoN[i] == true)
						st.append((i+1)+",");
				for(int i = 0; i < n; i++)
					if(cYoN[i] == true)
						st.append((i+1)+")");
				System.out.println(st);
			}
			n = Integer.parseInt(kb.next());
		}
		kb.close();
	}

	private static int[] columns(int[][] arr, int n){
		int[] c = new int[n];
		for(int col = 0; col < arr[0].length; col++){
			for(int row = 0; row < arr.length; row++)
				c[col] += arr[row][col];
		}
		return c;
	}

	private static int[] fillA(int[][] arr, Scanner kb, int n) {
		int[] filas = new int[n];
		for(int i = 0; i < arr.length; i++)
			for(int j = 0; j < arr[i].length; j++)
				filas[i] += arr[i][j] = Integer.parseInt(kb.next());
		return filas;
	}
}
