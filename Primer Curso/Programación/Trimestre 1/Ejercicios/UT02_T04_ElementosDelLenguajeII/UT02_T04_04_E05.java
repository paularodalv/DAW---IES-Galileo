package Temas;

public class UT02_T0404_E05 {

	public static void main(String[] args) {
		int num1 = 12321;
		int num2 = 4554;
		int num3 = 12345;
		int num4 = 7;
		
		System.out.println(num1 + " --> " + esCapicua(String.valueOf(num1)));
		System.out.println(num2 + " --> " + esCapicua(String.valueOf(num2)));
		System.out.println(num3 + " --> " + esCapicua(String.valueOf(num3)));
		System.out.println(num4 + " --> " + esCapicua(String.valueOf(num4)));
 
	}//main
	
	public static boolean esCapicua(String num) {
		if (num.length() <= 1) {
			return true;
		}//if
		if (num.charAt(0) != num.charAt(num.length()-1)) {
			return false;
		}//if2
		
		return esCapicua(num.substring(1, num.length()-1));
	}//esCapicua

}
