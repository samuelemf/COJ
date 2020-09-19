package edu.uprb.accepted;
import java.text.DecimalFormat;
import java.util.Scanner;

public class COJ_1493 {
//Accepted GeometricalTaskII
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String test = kb.next();
		DecimalFormat fr = new DecimalFormat("#0.00");
		if(test.equals("circle"))
			System.out.println(fr.format(circle(kb)));
		else if(test.equals("triangle"))
			System.out.println(fr.format(triangle(kb)));
		else if(test.equals("rhombus"))
			System.out.println(fr.format(rhombus(kb)));
		kb.close();
	}

	private static double rhombus(Scanner kb) {	
		return (Double.parseDouble(kb.next()) * Double.parseDouble(kb.next()))/ 2;
	}

	private static double triangle(Scanner kb) {
		return (Double.parseDouble(kb.next()) * Double.parseDouble(kb.next()))/ 2 ;	
	}

	public static double circle(Scanner kb){
		return 3.14 * Math.pow(Double.parseDouble(kb.next()), 2);
	}

}
