package edu.uprb.accepted;
import java.text.DecimalFormat;
import java.util.Scanner;

public class COJ_1506 {
//Accepted ExamGrader 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int answer = Integer.parseInt(kb.nextLine());
		String[] arr = new String[answer];
		String sheet = kb.nextLine();
		DecimalFormat df = new DecimalFormat("#,##0.00");
		for(int i = 0; i < arr.length; i++)
			arr[i] = sheet.substring(i, (i+1));
		
		int tests = Integer.parseInt(kb.nextLine());
		for(int i = 0; i < tests; i++){
			String y = kb.nextLine();
			double sum = 0;
			for(int j = 0; j < arr.length; j++){
				String check = y.substring(j, (j+1));
				if(arr[j].equals(check))
					sum++;
				else 
					if(!(check.equals("#")))
						sum -= 0.25;
			}
			System.out.println(df.format(sum));
		}
		kb.close();
	}

}
