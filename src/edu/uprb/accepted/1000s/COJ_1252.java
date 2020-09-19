package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_1252 {
//Accepted TheSevenPercentSolution
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String in = kb.nextLine();
		while(!in.equals("#")){
			StringBuilder st = new StringBuilder();
			int a = in.length();
			for(int i = 0; i < a; i++){

				if(in.substring(i,i+1).equals(" "))
					st.append("%20");
				else
					if(in.substring(i,i+1).equals("!"))
						st.append("%21");
					else
						if(in.substring(i,i+1).equals("$"))
							st.append("%24");
						else
							if(in.substring(i,i+1).equals("%"))
								st.append("%25");
							else
								if(in.substring(i,i+1).equals("("))
									st.append("%28");
								else
									if(in.substring(i,i+1).equals(")"))
										st.append("%29");
									else
										if(in.substring(i,i+1).equals("*"))
											st.append("%2a");
										else
											st.append(in.substring(i,i+1));
				//	System.out.println(in.substring(i,i+1));
			}
			System.out.println(st);
			in = kb.nextLine();
		}
		kb.close();
	}




}
