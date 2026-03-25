package Temas;

public class UT02_T0503_E02 {

	public static void main(String[] args) {
		
		float num1 = Float.parseFloat(args[1]);
		int num2 = Integer.parseInt(args[2]);
		
		switch (args[0]) {
		case "s":
			System.out.println(num1+num2);
			break;
		case "r":
			System.out.println(num1-num2);
			break;
		case "m":
			System.out.println(num1*num2);
			break;
		case "d":
			System.out.println(num1/num2);
			break;
		}//switch

	}//main

}//class
