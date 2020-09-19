package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_1495 {
//Accepted IncreasingOrderList_1495
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int test = kb.nextInt();
		int[] arr = new int[test];
		fill(arr, kb);
		mergeSort(arr);
		print(arr);
		kb.close();
	}

	public static void fill(int[] array, Scanner kb){
		for(int t = 0; t < array.length; t++)
			array[t] = kb.nextInt();
	}
	
	public static void print(int[] array){
		for(int t = 0; t < array.length; t++)
			System.out.println(array[t]);
	}
	
	public static void mergeSort(int[] data) {
		if (data.length > 1) {
			int len1 = data.length / 2, len2 = data.length - len1;
			int[] first = new int[len1], second = new int[len2];

			for (int curr1 = 0; curr1 < len1; curr1++)
				first[curr1] = data[curr1];
			for (int curr2 = 0; curr2 < len2; curr2++)
				second[curr2] = data[len1 + curr2];

			mergeSort(first);
			mergeSort(second);
			merge(first, second, data);
		}
	}
	
	private static void merge(int[] first, int[] second, int[] data) {
		int curr = 0, curr1 = 0, curr2 = 0;

		while (curr1 < first.length && curr2 < second.length) {
			if (first[curr1] < second[curr2])
				data[curr++] = first[curr1++];
			else
				data[curr++] = second[curr2++];	
		}
		while (curr1 < first.length)
			data[curr++] = first[curr1++];
		while (curr2 < second.length)
			data[curr++] = second[curr2++];
	}
	
}
