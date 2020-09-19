package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_2700 {
//Accepted UniqwordsComparison
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String a = kb.next();
		char[] aC = a.toCharArray();
		String b = kb.next();
		char[] bC = b.toCharArray();
		
		StringBuilder fir = new StringBuilder("First:");
		StringBuilder seco = new StringBuilder("Second:");
		StringBuilder fs = new StringBuilder("First&Second:");
		
		if(a.length()>= b.length()){
			for (int i = 0; i < aC.length; i++) {
				String in = ""+ aC[i];
					if(b.contains(in)){
						a = a.replace(in, "");
						b = b.replace(in, "");
						fs.append(in);
				}
			}
		}
		else{
			for (int i = 0; i < bC.length; i++) {
				String in = ""+ bC[i];
					if(a.contains(in)){
						a = a.replace(in, "");
						b = b.replace(in, "");
						fs.append(in);
				}
			}
		}
		
		fir.append(a);
		seco.append(b);
		System.out.println(fir.toString()+"\n"+seco.toString()+"\n"+fs.toString());
		kb.close();
	}

}
