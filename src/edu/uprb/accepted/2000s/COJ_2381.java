package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_2381 {
//Accepted LettersGame
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int len = Integer.parseInt(kb.nextLine());
		String[] arr = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O",
				"P","Q","R","S","T","U","V","W","X","Y","Z"};
		String line = kb.nextLine();
		int turn = Integer.parseInt(kb.nextLine());
		if(turn%2==0){
			int pepe = 0;
			int odd = 0;

			for(int i = 0; i <arr.length; i++){
				if(i%2==0){
					String l = line.replace(arr[i], "");
					pepe += (line.length() - l.length()) * l.length();
					line = l;
				}
				else{
					String l = line.replace(arr[i], "");
					odd += (line.length() - l.length()) * l.length();
					line = l;
				}
				
			}
			System.out.println(pepe > odd? "PEPE " + (pepe-odd): "JUAN " + (odd-pepe));

		}
		else{
			int juan = 0;
			int odd = 0;
			
			for(int i = 0; i < arr.length; i++){
				if(i%2==0){
					String l = line.replace(arr[i], "");
					juan += (line.length() - l.length()) * l.length();
					line = l;
				}
				else{
					String l = line.replace(arr[i], "");
					odd += (line.length() - l.length()) * l.length();
					line = l;
				}
			}
			System.out.println(juan > odd? "JUAN " + (juan - odd): "PEPE " + (odd-juan));
		}


		kb.close();
	}

}
