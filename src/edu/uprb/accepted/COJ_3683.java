package edu.uprb.accepted;
import java.util.Scanner;
import java.util.TreeSet;

public class COJ_3683 {
//Accepted Who's Left Who's Right
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int num; 
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(0);
		set.add(1000000);
		int times = Integer.parseInt(kb.next());
		while(times-->0){
			num = Integer.parseInt(kb.next());
			System.out.print((set.contains(num) ?  num : set.lower(num)) + " " + (set.contains(num) ? num : set.higher(num)));
			set.add(num);
		}
		kb.close();
	}

}
