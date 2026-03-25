package Temas;

import java.math.BigInteger;

public class UT02_T0404_E04 {

	public static void main(String[] args) {
		BigInteger cien = new BigInteger("100");
		BigInteger resultado = factorial(cien);
		
		System.out.println("100! = " + resultado);
 
	}//main
	
	public static BigInteger factorial(BigInteger cien) {
		
		if (cien.equals(BigInteger.ZERO)) {
			return BigInteger.ONE;
		}
		
		return cien.multiply(factorial(cien.subtract(BigInteger.ONE)));
		
	}//factorial

}
