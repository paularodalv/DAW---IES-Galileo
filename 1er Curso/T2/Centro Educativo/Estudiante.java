package centroeducativo;

import java.time.LocalDate;

public class Estudiante extends Persona{
	
	private double[][] notas;
	private int[] faltas;	
	
	public Estudiante(String identificacion, String nombre, LocalDate fechaNacimiento, double[][] notas, int[] faltas) {
		super(identificacion, nombre, fechaNacimiento);
		this.notas = notas;
		this.faltas = faltas;
	}//constructor

	@Override
	String rol() {
		return "Estudiante";
	}

	@Override
	void descripcionDetalladaMensual() {
		System.out.println("=================== BOLETÍN DE NOTAS ===================");
		System.out.println("Estudiante: " + super.getNombre() + " (" + super.getIdentificacion() + ")\nFecha nacimiento: " + super.getFechaNacimiento());
		notasModulo(notas);
	}
	
	public double[] mediaNotas (double[][] notas) {
		
		double media[] = new double[notas.length];
		
		for (int i=0; i<notas.length; i++) {
			double suma=0;
			for (int j=0; j<notas[i].length; j++) {
				suma = suma + notas[i][j];
			}
			media[i] = suma/notas[i].length;
		}//for
		
		return media;
	}//mediaNotas
	
	private void notasModulo (double[][] notas) {
		ModuloDaw1[] modulos = ModuloDaw1.values();
		
		for (int i=0; i<notas.length;i++) {
			ModuloDaw1 m = modulos[i];
			System.out.println("--------------------------------------------"); 
			System.out.println("Módulo: " + m.getNombre() + " (" + m.getCodigo() + ")"); 
			System.out.print("Notas: ");
			
			for (double n: notas[i]) {
				System.out.print(n + " ");
			}//for...each
			
			int media = (int)mediaNotas(notas)[i];
			System.out.println("\nFaltas: " + faltas[i]);
			double notaFinal = penalizacionNotas(notas, faltas, m)[i];
			System.out.println("Nota final aplicada: " + notaFinal);
			
		}//for
	}//notasModulo
	
	private double[] penalizacionNotas (double[][] notas, int[] faltas, ModuloDaw1 modulo) {
		
		double[] medias = mediaNotas(notas);
		int horasModulo = modulo.getHorasTotales();
		
		for (int i=0; i<medias.length; i++) {
			double pcntj = (faltas[i] * 100) / horasModulo;
			if (pcntj >= 5 && pcntj <= 10) 
				medias[i] -= 0.5;
			else if (pcntj >= 10 && pcntj <= 20) 
				medias[i] -= 1;
			else if (pcntj >= 20 && pcntj <= 30) 
				medias[i] -= 2;
			else if (pcntj >= 30) 
				medias[i] -= 3;
		}//for
		
		return medias;
	}//penalizacionNotas
	
	//Getters ---------
	public double[][] getNotas() {
		return notas;
	}

	public void setNotas(double[][] notas) {
		this.notas = notas;
	}

	public int[] getFaltas() {
		return faltas;
	}

	public void setFaltas(int[] faltas) {
		this.faltas = faltas;
	}
	
	
}
