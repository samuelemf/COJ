package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_2815 {
//Accepted EasyStringProblem
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
int run = Integer.parseInt(kb.next());
while(run-->0){
	String in = kb.next(), check = kb.next();
	int out = 0;
	
	for(int i = 0; i < in.length(); i++){
		while(in.contains(check)){
			String[] a = in.split(check);
			in = "";
			for(int j = 0; j < a.length; j++)
			if(!a[j].equals(check)){
				in += a[j];
			}
			out++;
		}
	}
	System.out.println(out);
}
		kb.close();

	}

}
