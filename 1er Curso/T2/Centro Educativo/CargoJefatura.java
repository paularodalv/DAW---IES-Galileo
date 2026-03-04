package centroeducativo;

public enum CargoJefatura {
	NINGUNO(0), 
	JEFE_DEPARTAMENTO(200), 
	JEFE_DE_ESTUDIOS(300), 
	DIRECTOR(500);
	
	private final int plus;
	
	private CargoJefatura(int plus) {
		this.plus = plus;
	}//constructor

	public double getPlus() {
		return plus;
	}//get
	
}
