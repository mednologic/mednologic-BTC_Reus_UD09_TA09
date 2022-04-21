package Class;

import java.util.Random;

public class ProfesorClass extends PersonaClass {
	
	enum MateriaClase {Matematicas, Filosofia, Fisica}
	protected String materia;
	protected int ausencia;
	
	

	public ProfesorClass(String nombre, int edad, String genero, String materia) {
		super(nombre, edad, genero);
		this.materia = materia;
	}



	@Override
	public void ausencia() {
		super.ausencia();
		Random rnd = new Random();
		
		this.ausencia = (int) (rnd.nextDouble() * 1 + 0);
		
	}
	
	
	

}
