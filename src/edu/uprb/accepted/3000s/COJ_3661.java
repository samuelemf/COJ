package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_3661 {
//Accepted ReverseRot
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int rotation = Integer.parseInt(kb.next());
		while(rotation != 0){
			String reverse = kb.next();
			reverse = new StringBuffer(reverse).reverse().toString();
			String[] arr = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O",
					"P","Q","R","S","T","U","V","W","X","Y","Z","_","."};
			StringBuilder st = new StringBuilder("");

			for(int i = 0; i < reverse.length(); i++){
				char check = reverse.charAt(i);
				if(check =='_')
					st.append(arr[((-(Character.getNumericValue(check) - 10)+15)+ rotation)%arr.length]);
				else
					if(check =='.')
						st.append(arr[((-(Character.getNumericValue(check) - 10)+16)+rotation)%arr.length]);
					else
						st.append(arr[((Character.getNumericValue(check) - 10) + rotation)%arr.length]);
			}
			System.out.println(st);
			rotation = Integer.parseInt(kb.next());
		}
		kb.close();
	}

}
