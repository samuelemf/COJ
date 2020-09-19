package edu.uprb.accepted;
import java.util.Arrays;
import java.util.Scanner;

public class COJ_2145  {
//Accepted BeautyContest
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int run = Integer.parseInt(kb.next());
		for(int h = 0; h < run; h++){
		int[] nums = new int[10];
		int score = 0;
		for(int i = 0; i <  nums.length; i++)
			nums[i]= Integer.parseInt(kb.next());
		Arrays.sort(nums);
		for(int i = 1; i < nums.length-1; i++)
			score+= nums[i];
		System.out.println(h+1 + " " + score);
		}
		
		kb.close();
	}

}
