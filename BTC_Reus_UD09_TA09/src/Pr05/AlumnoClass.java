package Pr05;

import java.util.Random;

public class AlumnoClass extends PersonaClass {
	
	protected int calificacion;
	protected int ausencia;
	protected boolean [] ausenciasClase;
	Random rnd = new Random();

	

	public AlumnoClass(String nombre, int edad, String genero) {
		super(nombre, edad, genero);
	}

	@Override
	public void ausencia() {
		super.ausencia();
		//TODO: la idea es que registri a les clases que ha anat
		/*Random rnd = new Random();
		
		this.ausencia = (int) (rnd.nextDouble() * 1 + 0);*/
		
	}
	public boolean vaAClase() {
		boolean asiste=false;
		asiste = rnd.nextBoolean();
		return asiste;
	}
	public int calidicacionRecibida() {
		int nota=0;
		nota = (int) (rnd.nextDouble() * 10 + 0);
		return nota;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Alumno [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", calificacion="
		+ calificacion;
	}

//Getters and setters
	public int getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}
	
	
	
	
}
