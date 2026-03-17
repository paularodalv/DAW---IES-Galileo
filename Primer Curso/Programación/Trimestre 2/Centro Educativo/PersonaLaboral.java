package centroeducativo;

import java.time.LocalDate;

public class PersonaLaboral extends Trabajador{

	private int horasExtras;
	private double tarifaHoraExtra;

	public PersonaLaboral(String identificacion, String nombre, LocalDate fechaNacimiento, double salarioBase, int horasExtras, double tarifaHoraExtra) {
		super(identificacion, nombre, fechaNacimiento, salarioBase);
		this.horasExtras = horasExtras;
		this.tarifaHoraExtra = tarifaHoraExtra;
	}



	@Override
	double calcularSueldo() {
		return getSalarioBase() + (horasExtras * tarifaHoraExtra); 
	}

	@Override
	String rol() {
		return "Persona Laboral";
	}

	@Override
	void descripcionDetalladaMensual() {
		System.out.println("=================== NÓMINA - PERSONA LABORAL ===================");
		mostrarInfo();
		System.out.println("Sueldo base: 	" + getSalarioBase() + " € \n Horas extras: 	" + horasExtras + " h  x " + tarifaHoraExtra + " €/h  = " + horasExtras*tarifaHoraExtra);
		System.out.println("-----------------------------" + "\n TOTAL A PERCIBIR:			" + calcularSueldo());
	}

	

}

