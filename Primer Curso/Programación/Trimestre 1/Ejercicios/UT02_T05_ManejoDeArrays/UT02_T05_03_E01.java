package Temas;

public class UT02_T0503_E01 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append(args[0]);
		
		for (int i=0; i<(Integer.parseInt(args[1])); i++) {
			if (args[2].equals("i")) {
				System.out.println(sb.reverse().toString());
				sb.reverse();
			} else if (args[2].equals("d")) {
				System.out.println(sb);
			} else 
				System.out.println("");
		}//for

	}//main

}//class
