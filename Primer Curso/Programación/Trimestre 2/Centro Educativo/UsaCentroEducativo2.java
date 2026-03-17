package centroeducativo;

import java.time.LocalDate;

public class UsaCentroEducativo2 {

	public static void main(String[] args) {
		
		double[][] notas = {
				{7,8,4},
				{9.2,4,5,7},
				{8,5,6},
				{7,8,4,2},
				{9.2},
				{8,5,6},
		};
		
		int[] faltas = {12,3,25,0,2,1,45};
		
		Persona[] personas = {
				new Estudiante(
					"7122990J",
					"María Pérez",
					LocalDate.of(1986, 5, 10),
					notas,
					faltas),
				
				new ProfesorNormal(
					"X7054221Y",
					"Carlos Martín",
					LocalDate.of(1972, 1, 15),
					2000.00,
					CargoJefatura.DIRECTOR)
		};
		
		for(int i=0; i<personas.length; i++) {
			personas[i].descripcionDetalladaMensual();
			System.out.println();
		}

	}

}
