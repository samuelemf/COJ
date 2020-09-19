package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_1535 {
//Accepted Lumberjack Sequencing
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int a = Integer.parseInt(kb.next());
		String[] res = new String[a];
		int b = 0;
		while(a-- >0){

			int count = 0;
			int[] arr = new int[10];
			for(int i = 0; i < 10; i++)
				arr[i] = Integer.parseInt(kb.next());

			for(int f =0; f < arr.length -1; f++)
				if(arr[f] < arr[f+1])
					count++;
				else
					break;

			for(int f =0; f < arr.length -1; f++)
				if(arr[f] > arr[f+1])
					count++;
				else
					break;
			if(count == 9)
				res[b] = "Ordered";
			else
				res[b] = "Unordered";
			b++;
		}
		System.out.println("Lumberjacks:");
		for(int k = 0; k < res.length; k++)
			System.out.println(res[k]);
		kb.close();

	}

}
