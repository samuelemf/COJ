package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_2799 {
//Accepted Classifying Triangles
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int i1 = Integer.parseInt(kb.next()),	
			i2 = Integer.parseInt(kb.next()),
			i3 = Integer.parseInt(kb.next());
		i1= Math.abs(i1);
		i2= Math.abs(i2);
		i3= Math.abs(i3);
		if((i1+i2+i3)==180){
			if(i2 == i1 && i2 == i3 && i3 == i1)
				System.out.println("Equilateral");
			else if(i2 == i1 || i2 == i3 || i1 == i3 )
				System.out.println("Isosceles");
			else
				System.out.println("Scalene");
		}
		else
			System.out.println("Error");
		kb.close();
	}

}
