package centroeducativo;

import java.time.*;

abstract class Persona {

	private Identificacion identificacion;
	private String nombre;
	private LocalDate fechaNacimiento;
	
	public Persona(String identificacion, String nombre, LocalDate fechaNacimiento) {
		this.identificacion = new Identificacion(identificacion);
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}//constructor
	
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public Identificacion getIdentificacion() {
		return identificacion;
	}

	public String getNombre() {
		return nombre;
	}

	abstract String rol();
	
	abstract void descripcionDetalladaMensual();
	
	void mostrarInfo() {
		System.out.println(rol() + "- ID: " + identificacion.id() + " - Nombre: " + nombre + " - Fecha nacimiento: " + fechaNacimiento);
	}
	
}//class
