package Temas;

import java.math.BigInteger;

public class Ejemplo20 {

	public static void main(String[] args) {
		
		BigInteger numBI = new BigInteger("0");
		
		System.out.println(BigInteger.ONE.add(numBI));
		
		int x=5, y=3;
		System.out.println("int suma: " + (x+y));
		System.out.println("int multi: " + (x*y));
		
		BigInteger xBI = BigInteger.valueOf(y);
		BigInteger yBI = BigInteger.valueOf(x);
		
		System.out.println("xBI suma: " + (xBI.add(yBI)));
		System.out.println("yBI multi: " + (xBI.multiply(yBI)));

	}//main

}//class
