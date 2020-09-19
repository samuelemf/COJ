package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_1566 {
	/*	Accepted
	 CannosBalls_1566
	 */
	public static void main (String[] args){
		Scanner kb = new Scanner(System.in);
		int floors, cont;
		
		while(true) {
			floors = kb.nextInt();
			cont = 0;
			
			if(floors == 0)
				break;
			for(int i = 0; i <= floors; i++) {
				cont += Math.pow(i, 2);
			}
			System.out.println(cont);
		}

		kb.close();
	}

}//class
