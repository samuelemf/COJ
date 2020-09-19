package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_3686{
//Accepted MaxOfTheK
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int test = Integer.parseInt(kb.next());
		
		while(test-->0){
			int amount = Integer.parseInt(kb.next()),
					inGroups = Integer.parseInt(kb.next());
			int[] arr = new int[amount];
			
			for(int i = 0; i < amount; i++)
				arr[i] = Integer.parseInt(kb.next());
			
			StringBuilder st = new StringBuilder();
			int checks = amount - inGroups + 1;
			int space = checks;
			for(int i = 0; i < checks; i++){
				int max = arr[i];
				for(int j = i+1; j < inGroups+i; j++){
					if(max < arr[j])	
						max = arr[j];
				}
				st.append(max);
				if(space-- > 1)
					st.append(" ");
			}
			System.out.println(st.toString());
		}
		kb.close();
	}

}
