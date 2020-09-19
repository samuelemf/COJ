package edu.uprb.accepted;


import java.util.Scanner;

public class COJ_3614 {
//Accepted WritingMoreNumbers_3614
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int test = Integer.parseInt(kb.next());
		String input;
		while(test-- > 0){
			input = kb.next();
			if(input.length() > 1){
				System.out.println(getMsg2(input));
			}
			else
				System.out.println(getMsg(input));
		}

		kb.close();
	}

	private static String getMsg(String input){
		switch(input){
		case "0" :
			return "zero";
		case "1" :
			return "one";
		case "2": 
			return "two";
		case "3":
			return "three";
		case "4":
			return "four";
		case "5" :
			return "five";
		case "6": 
			return "six";
		case "7":
			return "seven";
		case "8":
			return "eight";
		case "9" :
			return "nine";
		default :
			return "";
		}
	}

	private static String getMsg2(String input){
		switch(input){
		case "10": 
			return "ten";
		case "11":
			return "eleven";
		case "12":
			return "twelve";
		case "13": 
			return "thirteen";
		case "14":
			return "fourteen";
		case "15":
			return "fifteen";
		case "16": 
			return "sixteen";
		case "17":
			return "seventeen";
		case "18":
			return "eighteen";
		case "19":
			return "nineteen";
		case "20": 
			return "twenty";
		case "21":
			return "twenty-" + getMsg(input.substring(1));
		case "22":
			return "twenty-" + getMsg(input.substring(1));
		case "23":
			return "twenty-" + getMsg(input.substring(1));
		case "24":
			return "twenty-" + getMsg(input.substring(1));
		case "25":
			return "twenty-" + getMsg(input.substring(1));
		case "26":
			return "twenty-" + getMsg(input.substring(1));	
		case "27":
			return "twenty-" + getMsg(input.substring(1));
		case "28":
			return "twenty-" + getMsg(input.substring(1));
		case "29":
			return "twenty-" + getMsg(input.substring(1));
		case "30":
			return "thirty";
		case "31":
			return "thirty-" + getMsg(input.substring(1));
		case "32":
			return "thirty-" + getMsg(input.substring(1));
		case "33":
			return "thirty-" + getMsg(input.substring(1));
		case "34":
			return "thirty-" + getMsg(input.substring(1));
		case "35":
			return "thirty-" + getMsg(input.substring(1));
		case "36":
			return "thirty-" + getMsg(input.substring(1));
		case "37":
			return "thirty-" + getMsg(input.substring(1));
		case "38":
			return "thirty-" + getMsg(input.substring(1));
		case "39":
			return "thirty-" + getMsg(input.substring(1));
		case "40":
			return "forty";
		case "41":
			return "forty-" + getMsg(input.substring(1));
		case "42":
			return "forty-" + getMsg(input.substring(1));
		case "43":
			return "forty-" + getMsg(input.substring(1));
		case "44":
			return "forty-" + getMsg(input.substring(1));
		case "45":
			return "forty-" + getMsg(input.substring(1));
		case "46":
			return "forty-" + getMsg(input.substring(1));
		case "47":
			return "forty-" + getMsg(input.substring(1));
		case "48":
			return "forty-" + getMsg(input.substring(1));
		case "49":
			return "forty-" + getMsg(input.substring(1));
		case "50": 
			return "fifty";
		case "51": 
			return "fifty-"+ getMsg(input.substring(1));
		case "52": 
			return "fifty-"+ getMsg(input.substring(1));
		case "53": 
			return "fifty-"+ getMsg(input.substring(1));
		case "54": 
			return "fifty-"+ getMsg(input.substring(1));
		case "55": 
			return "fifty-"+ getMsg(input.substring(1));
		case "56": 
			return "fifty-"+ getMsg(input.substring(1));
		case "57": 
			return "fifty-"+ getMsg(input.substring(1));
		case "58": 
			return "fifty-"+ getMsg(input.substring(1));
		case "59": 
			return "fifty-"+ getMsg(input.substring(1));
		case "60":
			return "sixty";
		case "61": 
			return "sixty-"+ getMsg(input.substring(1));
		case "62": 
			return "sixty-"+ getMsg(input.substring(1));
		case "63": 
			return "sixty-"+ getMsg(input.substring(1));
		case "64": 
			return "sixty-"+ getMsg(input.substring(1));
		case "65": 
			return "sixty-"+ getMsg(input.substring(1));
		case "66": 
			return "sixty-"+ getMsg(input.substring(1));
		case "67": 
			return "sixty-"+ getMsg(input.substring(1));
		case "68": 
			return "sixty-"+ getMsg(input.substring(1));
		case "69": 
			return "sixty-"+ getMsg(input.substring(1));
		case "70":
			return "seventy";
		case "71":
			return "seventy-" + getMsg(input.substring(1));
		case "72":
			return "seventy-" + getMsg(input.substring(1));
		case "73":
			return "seventy-" + getMsg(input.substring(1));
		case "74":
			return "seventy-" + getMsg(input.substring(1));
		case "75":
			return "seventy-" + getMsg(input.substring(1));
		case "76":
			return "seventy-" + getMsg(input.substring(1));
		case "77":
			return "seventy-" + getMsg(input.substring(1));
		case "78":
			return "seventy-" + getMsg(input.substring(1));
		case "79":
			return "seventy-" + getMsg(input.substring(1));
		case "80":
			return "eighty";
		case "81":
			return "eighty-" + getMsg(input.substring(1));
		case "82":
			return "eighty-" + getMsg(input.substring(1));
		case "83":
			return "eighty-" + getMsg(input.substring(1));
		case "84":
			return "eighty-" + getMsg(input.substring(1));
		case "85":
			return "eighty-" + getMsg(input.substring(1));
		case "86":
			return "eighty-" + getMsg(input.substring(1));
		case "87":
			return "eighty-" + getMsg(input.substring(1));
		case "88":
			return "eighty-" + getMsg(input.substring(1));
		case "89":
			return "eighty-" + getMsg(input.substring(1));
		case "90":
			return "ninety";
		case "91":
			return "ninety-" + getMsg(input.substring(1));
		case "92":
			return "ninety-" + getMsg(input.substring(1));
		case "93":
			return "ninety-" + getMsg(input.substring(1));
		case "94":
			return "ninety-" + getMsg(input.substring(1));
		case "95":
			return "ninety-" + getMsg(input.substring(1));
		case "96":
			return "ninety-" + getMsg(input.substring(1));
		case "97":
			return "ninety-" + getMsg(input.substring(1));
		case "98":
			return "ninety-" + getMsg(input.substring(1));
		case "99":
			return "ninety-" + getMsg(input.substring(1));

		default :
			return "";
		}
	}

}
