package centroeducativo;

class ExcepcionNull extends RuntimeException{ public ExcepcionNull(String mensaje) {super(mensaje);} }
class NIEinvalido extends RuntimeException{ public NIEinvalido(String mensaje) {super(mensaje);} }
class DNIinvalido extends RuntimeException{ public DNIinvalido(String mensaje) {super(mensaje);} }

public record Identificacion(String id) {
	
	public Identificacion (String id){
		
		String idNorm = id.toUpperCase().trim().replace(" ", ""); //Normalizamos el id
		
		if (id.isBlank()) 
			throw new ExcepcionNull("El identificador no puede estar vacío.");
	
		if(idNorm.matches("^[XYZ].*")) {
			if(!nieValido(idNorm)) {
				throw new NIEinvalido("El NIE no es válido. Debería ser [X00000000]: " + id);
			}//if
		} else if (idNorm.matches("\\d{8}[A-Za-z]")){
			if(!dniValido(idNorm)) {
				throw new DNIinvalido("El DNI no es válido Debería ser [00000000X]: " + id);
			}//if
		}
		
		this.id=idNorm;
		
	}//Identificacion
	
	private boolean dniValido(String id) {
		if (id.matches("\\d{8}[A-Za-z]")) {
			char letra = id.charAt(id.length()-1);
			String numeros = id.substring(0,8);
									
			int iNumeros = Integer.parseInt(numeros); //Se pasa el string de numeros a un integer
							
			int modulo = iNumeros%23;
			String p = "TRWAGMYFPDXBNJZSQVHLCKE";
						
			char letraCorrecta = p.charAt(modulo);
			return letraCorrecta == Character.toUpperCase(letra);
		}//if
			return false;
	}//dniValido
	
	private boolean nieValido(String id) {
		if (id.matches("[XYZxyz]\\d{7}[A-Za-z]")) {
			char letra = id.charAt(id.length()-1);
			String numeros = id.substring(1,8);
									
			int iNumeros = Integer.parseInt(numeros); //Se pasa el string de numeros a un integer
							
			int modulo = iNumeros%23;
			String p = "TRWAGMYFPDXBNJZSQVHLCKE";
						
			char letraCorrecta = p.charAt(modulo);
			return letraCorrecta == Character.toUpperCase(letra);
		}//if
			return false;
	}//dniValido
	
	

}
