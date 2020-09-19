package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_2444 {
//Accepted BinaryGenocide
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int count = 0;
		while(kb.hasNext()){
			int i = 0;
			int num = Integer.parseInt(kb.next());
			String a =	Integer.toBinaryString(num);
			for(int o = 0; o < a.length(); o++)
				if(a.substring(o, o+1).equals("1"))
					i++;
			if(i%2 == 0)
				count++;
		}
		System.out.println(count);
		kb.close();
	}

}
