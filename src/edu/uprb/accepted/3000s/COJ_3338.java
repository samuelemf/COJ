package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_3338 {
//Accepted Cryptoquote
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int r = Integer.parseInt(kb.nextLine());
		int x= 0;
		while(r-->0){
			String i = kb.nextLine();
			char[] av = kb.nextLine().toCharArray();
			StringBuilder st = new StringBuilder();
			for(int j = 0; j < i.length(); j++){
				char p = i.charAt(j);
				int a = Character.getNumericValue(p)-10;
				if(a == -11)
					st.append(" ");
				else
					st.append(av[a]);
			}
			System.out.println(""+(++x) + " "+ st);
		}
		kb.close();
	}

}
