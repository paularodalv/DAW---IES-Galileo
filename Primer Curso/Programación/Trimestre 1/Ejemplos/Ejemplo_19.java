package Temas;

import java.util.Arrays;

public class Ejemplo19 {

	public static void main(String[] args) {
		
		int[][] m = {{2,3,4,5},{1,5,4,7,8,9}};
		
		System.out.println(m.length);
		System.out.println(m[0].length);
		
		m[1][1]=7;
		
		for (int i=0; i<m.length; i++) {
			for (int j=0; j<m[i].length; j++) {
				System.out.print(m[i][j]);
			}
			System.out.println();
		}

	}//main
}
