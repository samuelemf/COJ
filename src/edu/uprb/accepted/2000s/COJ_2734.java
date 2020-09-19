package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_2734 {
//Accepted Coco_BitsAndMaths
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int i = 0;
		while (kb.hasNext()){
			if (kb.next().equals("suma"))
				i += Integer.parseInt(kb.next());
			else
				i -= Integer.parseInt(kb.next());			
		}
		System.out.println("resultado: " + i);
		kb.close();
	}

}
