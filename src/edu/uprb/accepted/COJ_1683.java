package edu.uprb.accepted;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class COJ_1683{
/*
 * Accepted DPA_1683
 */
	public static void main (String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		for(int a = 0; a < test; a++){
			int n = Integer.parseInt(br.readLine());
			int divisors = 1;
			int sum = 0;
			while (divisors < n) {
				if (n % divisors == 0)
					sum+=divisors;
				divisors++;
			}
			if(sum < n) 
				System.out.println("Deficient");
			else if(sum == n)
					System.out.println("Perfect");
				else System.out.println("Abundant");
		}

		br.close();

	}

}
