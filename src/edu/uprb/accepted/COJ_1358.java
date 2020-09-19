package edu.uprb.accepted;
import java.util.Arrays;
import java.util.Scanner;

public class COJ_1358 {
//Accepted EvanMoneyLesson
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int run = Integer.parseInt(kb.next());
		while(run!=-1){
			String[] s = new String[run];
			String[] a =  new String[run];
			int[] n = new int[run];
			for(int i = 0; i <run; i++){
				int count = 0;
				s[i] = kb.next();
				count += (5 * Integer.parseInt(kb.next()));
				count += (10 * Integer.parseInt(kb.next()));
				count += (20 * Integer.parseInt(kb.next()));
				n[i] = count;
				a[i] = s[i] + " " + count;
			}		
			int equal = 0;
			for(int j =0; j < run-1; j++)
				if(n[j]==n[j+1])
					equal++;
			if(equal == (run-1)){
				System.out.println("All have the same amount.");
				run = Integer.parseInt(kb.next());
			}
			else{
				Arrays.sort(n);

				int min = n[0];
				int max = n[n.length-1];
				int minN = 0;
				int maxN = 0;
				for(int i = 0; i < run; i++){
					if(a[i].contains(""+min))
						minN = i;
					if(a[i].contains(""+max))
						maxN=i;
				}
				System.out.println(s[maxN]+" has most, " + s[minN] + " has least money.");
				run = Integer.parseInt(kb.next());
			}
		}
		kb.close();
	}

}
