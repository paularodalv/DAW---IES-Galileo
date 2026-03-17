package centroeducativo;

import java.time.LocalDate;

public class UsaCentroEducativoI {

	public static void main(String[] args) {
		
		double[][] notas = {
				{7,8,4},
				{9.2,4,5,7},
				{8,5,6},
				{7,8,4,2},
				{9.2},
				{8,5,6},
				{6}
		};
		
		int[] faltas = {12,3,25,0,2,1,45};
		
		Estudiante e1 = new Estudiante(
				"12345678A",
				"Lucía Gómez",
				LocalDate.of(2005, 6, 21),
				notas,
				faltas	);
				
		e1.descripcionDetalladaMensual();

	}

}
