package edu.uprb.accepted;
import java.util.ArrayList;
import java.util.Scanner;

public class COJ_1300 {
//Accepted Modulo
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int total = 0;
		for(int i = 0; i < 10; i++){
			arr.add(Integer.parseInt(kb.next()) % 42);
			int count = 0;
			for (int j = 0; j < arr.size(); j++) {
				if(arr.get(i)==arr.get(j) && i!= j)
					break;
				count++;
			}
			if(count == arr.size())
				total++;
		}
		System.out.println(total);
		kb.close();
	}

}
