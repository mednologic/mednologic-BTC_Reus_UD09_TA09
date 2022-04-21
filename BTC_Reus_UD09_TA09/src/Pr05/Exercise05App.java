package Pr05;

/**
 * 
 * @author joseporiollopezbosch
 * @date 19/04/2022
 * @version 0.1.1
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Class.AlumnoClass;
import Class.AulaClass;
import Class.ProfesorClass;

public class Exercise05App {
	
	//Listado de apellidos para alumnos y profesores
	public static String[] apellidos = { "Gomez", "Guerrero", "Cardenas", "Cardiel", "Cardona", "Cardoso", "Cariaga", "Carillo",
			"Carion", "Castiyo", "Castorena", "Castro", "Grande", "Grangenal", "Grano", "Grasia", "Griego",
			"Grigalva"};
	public static List <AlumnoClass> alumnos = new ArrayList <AlumnoClass>();

	
	public static void main(String[] args) {
//Crear aula y rellenarla con alumnos y professor
		//Crear el aula con las sesiones que se haran
		AulaClass aula = new AulaClass(1, 30, "Matematicas", 10);
		generadorDeAlumnos(aula);
		//Asignamos el listado de alumnos a aula
		aula.setAlumnos(alumnos);
		//Generamos profesor
		ProfesorClass profesor = new ProfesorClass(
				generadorDeNombres(0, apellidos.length), 
				generadorDeEdad(24, 30), 
				generadorDeGenero(), 
				aula.getMateria());
		//Asignamos profesor a la aula
		aula.setProfesor(profesor);
		aula.verProfeAula();
		//TODO: generar sesiones y comprobar asistencia
		for (int i=0; i< aula.getNum_clases();i++) {
			aula.clasePosible(i);
		}
		
		//Visualizamos que clases se han realizado
		
		aula.verClasesRealizadas();
		aula.asignarNotas();
		aula.verAprovados();
		
		/*System.out.println("MOSTRANDO TODO:\n___________________________________________________");
		for(AlumnoClass tarjet : aula.alumnos ) {
			System.out.println(tarjet.toString());
		}*/
		
	}
	
//Methods
	//Generar alumnos segun capacidad de clase
	private static void generadorDeAlumnos(AulaClass aula) {
		for(int i=0;i<aula.getNum_max_students(); i++) {
			AlumnoClass alumno = new AlumnoClass(generadorDeNombres(0, apellidos.length), generadorDeEdad(10, 20), generadorDeGenero());
			alumnos.add(alumno);
		}
	}
	//Generador de generos
	public static String generadorDeGenero() {
		boolean flag = Math.random() < 0.5;
		String genero="Mujer";
		
		if(flag) genero = "Hombre";
		
		return genero;
	}
	//Generador de alumnos usando un listado
	public static String generadorDeNombres(int inicio, int cantidad) {
		Random rnd = new Random();
		
		String nombre = "";
		int randomNum = (int) (rnd.nextDouble() * cantidad + inicio);;
		
		
		nombre = apellidos[randomNum];
		
		return nombre;
	}
	//Generador de edades
	public static int generadorDeEdad(int inicio, int cantidad) {
		int edad=0;
		Random rnd = new Random();
		
		edad = (int) (rnd.nextDouble() * cantidad + inicio);
		
		return edad;
	}
	
	//Generador de notas
		public static int generadorDeNotas() {
		int edad=0;
		Random rnd = new Random();
		
		edad = (int) (rnd.nextDouble() * 10 + 0);
		
		return edad;
	}
}
