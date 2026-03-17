package centroeducativo;

import java.time.LocalDate;

public class ProfesorNormal extends Profesor{

	private CargoJefatura cargo;

	public ProfesorNormal(String identificacion, String nombre, LocalDate fechaNacimiento, double salarioBase, CargoJefatura cargo) {
		super(identificacion, nombre, fechaNacimiento, salarioBase);
		this.cargo = cargo;
	}


	public CargoJefatura getCargo() {
		return cargo;
	}

	public void setCargo(CargoJefatura cargo) {
		this.cargo = cargo;
	}


	@Override
	String rol() {
		return String.valueOf(cargo);
	}

	@Override
	void descripcionDetalladaMensual() {
		System.out.println("=================== NÓMINA - PROFESOR NORMAL ===================");
		mostrarInfo();
		System.out.println("Sueldo base: 	" + getSalarioBase() + "€");
		System.out.println("Trienios 	(" + numTrienios() + " x " + IMPORTE_TRIENIO + "): " + numTrienios()*IMPORTE_TRIENIO);
		System.out.println("Sexenios 	(" + numSexenios() + " x " + IMPORTE_SEXTENIO + "): " + numSexenios()*IMPORTE_SEXTENIO);
		System.out.println("Plus jefatura: 			" +  cargo.getPlus() +  " " + cargo.toString());
		System.out.println("-----------------------------" + "\n TOTAL A PERCIBIR:			" + calcularSueldo());
	}
	
	public double calcularSueldo() {
		
		double total = getSalarioBase();
		int trienios = numTrienios(), sexenios = numSexenios();
		
		//Calcular con pluses
		total = total + (trienios * IMPORTE_TRIENIO);
		total = total + (sexenios * IMPORTE_SEXTENIO);
		
		total += cargo.getPlus();
		
		return total;
	}//calcularSueldo
	
}//class
