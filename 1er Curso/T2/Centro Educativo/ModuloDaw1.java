package centroeducativo;

public enum ModuloDaw1 {

	LMSGI("0373" , "Lenguaje de marcas y sistemas de gestion de informacion" , 102 , 3),
	SISTEMAS_INFORMATICOS("0483", "Sistemas informáticos" , 170 , 5),
	BASES_DE_DATOS("0484" , "Bases de datos" , 170 , 5),
	PROGRAMACION("0485" ,"Programación" , 272 , 8),
	ENTORNOS_DE_DESARROLLO("0487" , "Entornos de desarrollo" , 68 , 2),
	INGLES_PROFESIONAL("0179" , "Ingles profesional (GS)" , 68 , 2),
	INTINERARIO_PERSONAL_I("1709" , "Itinerario personal para la empleabilidad I" , 102 , 3 ),
	OPTATIVO_1("0999" , "Innovación I" , 34 , 2);
	
	private final String codigo, nombre;
	private final int horasTotales , horasSemanales;
	
	private ModuloDaw1(String codigo, String nombre, int horasTotales, int horasSemanales) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.horasTotales = horasTotales;
		this.horasSemanales = horasSemanales;
	}//constructor
	
	//Getters ---------
	public String getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public int getHorasTotales() {
		return horasTotales;
	}

	public int getHorasSemanales() {
		return horasSemanales;
	}
	
	
}
