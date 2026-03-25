package centroeducativo;

import java.time.LocalDate;

public class UsaCentroEducativo {

	public static void main(String[] args) {
		
		PersonaLaboral pl = new PersonaLaboral(
				"12345678A",
				"María Pérez",
				LocalDate.of(1986, 5, 10),
				1200.00,			//salario base
				12,				//horas extras del mes
				14.50	);		//€ por hora extra
				
		pl.descripcionDetalladaMensual();
		
		ProfesorNormal prof1 = new ProfesorNormal(
				"X2345678B",
				"Juan López",
				LocalDate.of(1978, 3, 22),
				1800.00,
				CargoJefatura.NINGUNO );
		
		prof1.descripcionDetalladaMensual();
		
		ProfesorNormal prof2 = new ProfesorNormal(
				"Y3456789C",
				"Isabel García",
				LocalDate.of(1975, 11, 2),
				1900.00,
				CargoJefatura.JEFE_DE_ESTUDIOS );
		
		prof2.descripcionDetalladaMensual();
		
		ProfesorNormal prof3 = new ProfesorNormal(
				"Z4567890D",
				"Carlos Martín",
				LocalDate.of(1972, 1, 15),
				2000.00,
				CargoJefatura.DIRECTOR );
		
		prof3.descripcionDetalladaMensual();
		
	}

}
