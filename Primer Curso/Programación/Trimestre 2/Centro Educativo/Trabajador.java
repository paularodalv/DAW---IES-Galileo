package centroeducativo;

import java.time.LocalDate;
import java.time.Period;

abstract class Trabajador extends Persona{
	private double salarioBase;

	public Trabajador(String identificacion, String nombre, LocalDate fechaNacimiento, double salarioBase) {
		super(identificacion, nombre, fechaNacimiento);
		this.salarioBase = salarioBase;
	}//constructorTrabajador
	
	public double getSalarioBase() {
		return salarioBase;
	}

	abstract double calcularSueldo();
	
	public LocalDate fechaInicioLaboral() {
		return this.getFechaNacimiento().plusYears(30);
	}//fechaInicioLaboral
	
	public int aniosTrabajados(LocalDate enFecha) { 
		LocalDate inicio = fechaInicioLaboral();
		if (enFecha.isBefore(inicio)) return 0; 
			return Period.between(inicio, enFecha).getYears(); 
	}//aniosTrabajados

	
}

