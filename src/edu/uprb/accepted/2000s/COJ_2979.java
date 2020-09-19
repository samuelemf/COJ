package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_2979 {
//Accepted AnotherSortingProblem_2979
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int run = Integer.parseInt(kb.nextLine());
		while(run-- > 0){
			int[] arr = new int[Integer.parseInt(kb.next())];
			int[] arr2 = new int[arr.length];
			for(int i = 0; i < arr.length; i++){
				arr[i] = Integer.parseInt(kb.next());
				arr2[i] = arr[i];
			}
			insertionSort(arr);
			int cont = 0;
			for(int i = 0; i < arr.length; i++)
				if(arr2[i] != arr[i])
					cont++;
			System.out.println(cont);
		}
		kb.close();
	}


	public static void insertionSort(int[] data) {
		for (int curr = 1; curr < data.length; curr++) {
			int temp = data[curr], pos = curr;
			while (pos > 0 && temp < data[pos - 1]) {
				data[pos] = data[pos - 1];
				pos--;
			}
			data[pos] = temp;
		}
	}
}
