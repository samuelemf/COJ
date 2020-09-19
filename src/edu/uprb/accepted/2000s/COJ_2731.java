package edu.uprb.accepted;
import java.text.DecimalFormat;
import java.util.Scanner;

public class COJ_2731 {
//Accepted Coco Bits and the Wall
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		int times = Integer.parseInt(kb.next());
		while(times-->0){
		double i = Double.parseDouble(kb.next());
		double square = Math.pow(i, 2);
		double circle = Math.PI * Math.pow((i/2), 2);
		System.out.println(df.format((square-circle)));
		}
		kb.close();
	}
}
