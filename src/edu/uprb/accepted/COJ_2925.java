package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_2925 {
//Accepted HelpWithTheRemote
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int times = Integer.parseInt(kb.next());
		while(times-->0){
			System.out.println(checkTimes(Integer.parseInt(kb.next()), Integer.parseInt(kb.next()),0));
		}
		kb.close();
	}

	private static int checkTimes(int current, int desired, int times) {
		if(current == desired)
			return times;
		else if(current < desired)
			return checkTimes(current+1, desired, times+1);
		else
			return checkTimes(current/2, desired, times+1);
			
	}

}
