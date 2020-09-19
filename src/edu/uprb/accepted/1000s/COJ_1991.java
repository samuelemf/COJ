package edu.uprb.accepted;
import java.util.Scanner;

public class COJ_1991 {
//Accepted Penney Game
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int runs = Integer.parseInt(kb.next());
		int ttt = 0, tth = 0, tht = 0, thh = 0,
				htt = 0, hth = 0, hht = 0, hhh = 0;
		while(runs-->0){

			int set = Integer.parseInt(kb.next());

			String in = kb.next();
			String check;
			try {
				for(int i = 0; i < in.length(); i++){
					check = in.substring(i, i+3);
					if(check.equals("HHH"))
						hhh++;
					else
						if(check.equals("TTT"))
							ttt++;
						else
							if(check.equals("TTH"))
								tth++;
							else
								if(check.equals("THT"))
									tht++;
								else
									if(check.equals("THH"))
										thh++;
									else
										if(check.equals("HTT"))
											htt++;
										else
											if(check.equals("HTH"))
												hth++;
											else
												if(check.equals("HHT"))
													hht++;
				}
			} catch (Exception e) {
			}

			print(set,ttt,tth,tht,thh,htt,hth,hht,hhh);
			ttt = 0; tth = 0; tht = 0; thh = 0;
			htt = 0; hth = 0; hht = 0; hhh = 0;
		}
		kb.close();
	}

	private static void print(int set, int ttt, int tth, int tht, int thh, int htt, int hth, int hht, int hhh) {
		System.out.println(set + " "+ ttt + " "+ tth + " " + tht + " "+ thh + " "+ htt+ " "+ hth + " "+ hht + " "+ hhh);

	}

}
