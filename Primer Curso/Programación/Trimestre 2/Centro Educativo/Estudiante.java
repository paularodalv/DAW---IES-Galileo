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
		System.out.println("Estudiante: " + super.getNombre() + " (" + super.getIdentificacion().id() + ")\nFecha nacimiento: " + super.getFechaNacimiento());
		notasModulo(notas);
		System.out.println("-------------------------------------");
		derechoBeca(notas, faltas);
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
	
	private double mediaGeneral(double[][] notas) {
		double[] medias = mediaNotas(notas);
		double suma=0;
		
		for(double m: medias) {
			suma += m;
		}//for
		
		return suma / medias.length;
	}//mediaGeneral
	
	private void notasModulo (double[][] notas) {
		ModuloDaw1[] modulos = ModuloDaw1.values();
		
		for (int i=0; i<notas.length;i++) {
			ModuloDaw1 m = modulos[i];
			System.out.println("--------------------------------------------");
			System.out.println("Módulo: " + m.getNombre() + " (" + m.getCodigo() + ")");
			System.out.println("Horas totales: " + m.getHorasTotales());
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
	
	private void derechoBeca(double[][] notas, int[] faltas) {
		ModuloDaw1[] modulos = ModuloDaw1.values();
		int horasTotales=0, faltasTotales=0;
		boolean derechoABeca=false;
		double notaFinal=0;
		
		for (int i=0; i<notas.length;i++) {
			ModuloDaw1 m = modulos[i];
			notaFinal = penalizacionNotas(notas, faltas, m)[i];
		}//forNotaFinal
		
		for(int i=0; i<modulos.length; i++) {
			horasTotales = horasTotales + modulos[i].getHorasTotales();	
		}//forHorasTotales
		
		for (int j=0; j<faltas.length;j++) {
			faltasTotales = faltasTotales + faltas[j];
			if((faltasTotales/horasTotales)*100 >= 20) {
				derechoABeca=true;
			}//if
		}//forFaltas
		
		if(derechoABeca) {
			derechoABeca = rendimientoAcademico(notas, faltas);
		}//rendimientoAcademico
		
		
		
		System.out.println("Horas totales del curso: " + horasTotales);
		System.out.println("Faltas totales: " + faltasTotales);
		System.out.print("Media general (sin ponderar): " + mediaGeneral(notas)  + "\n¿Beca?");
		
		if (derechoABeca) System.out.print(" No");
		else  System.out.print(" Sí");
		
	}//derechoBeca
	
	private boolean rendimientoAcademico (double[][] notas, int[] faltas) {
		ModuloDaw1[] modulos = ModuloDaw1.values();
		boolean rA=false;
		int cargalectiva=0, modSuperado=0, horasTotales=0;
		double notaFinal=0;
		
		for (int i=0; i<notas.length;i++) {
			ModuloDaw1 m = modulos[i];
			double media = mediaNotas(notas)[i];
			notaFinal = penalizacionNotas(notas, faltas, m)[i];
			if (notaFinal>=5.0)
				modSuperado = modSuperado + m.getHorasTotales();
		}//horaSuperada
		
		for(int i=0; i<modulos.length; i++) {
			horasTotales = horasTotales + modulos[i].getHorasTotales();	
		}//forHorasTotales
		
		if((modSuperado/horasTotales)*100 >= 50) {
			rA=true;
		}
		
		return rA;
	}//rendimientoAcademico
	
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
 
 