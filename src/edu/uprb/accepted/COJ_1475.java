package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_1475 {
//Accepted Cedric Cypher
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String[] arr = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O",
				"P","Q","R","S","T","U","V","W","X","Y","Z"};
		String code = kb.nextLine();
		while(!code.equals("#")){
			StringBuilder st = new StringBuilder("");
			char[] b = code.toCharArray();
			int A = (Character.getNumericValue(b[b.length-1]) - 10);
			for(int i =0; i < code.length()-1; i++){
				char a = b[i];
				if(Character.isAlphabetic(a)){
					int j = (Character.getNumericValue(a) - 10) - A;
					if(j<0)
						j =  arr.length + j;
					String check = ""+a;
					char[] arb = check.toLowerCase().toCharArray();
					if(a == arb[0])
						st.append(arr[j%arr.length].toLowerCase());
					else
						st.append(arr[j%arr.length]);
				}
				else
					st.append(a);
			}
			System.out.println(st);
			code = kb.nextLine();
		}
		kb.close();
	}

}
