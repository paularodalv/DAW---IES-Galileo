package centroeducativo;

import java.time.*;

abstract class Profesor extends Trabajador{
	
	public static final double IMPORTE_TRIENIO = 50;
	public static final double IMPORTE_SEXTENIO = 120;
	
	public Profesor(String identificacion, String nombre, LocalDate fechaNacimiento, double salarioBase) {
		super(identificacion, nombre, fechaNacimiento, salarioBase);
	}//constructor
	
	public int numTrienios() {
		return aniosTrabajados(LocalDate.now()) / 3;
	}//numTrienios
	
	public int numSexenios() {	
		return aniosTrabajados(LocalDate.now()) / 6;
	}//numTrienios
	
}//class

