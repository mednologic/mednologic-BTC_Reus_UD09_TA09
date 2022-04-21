package Pr06;

import java.util.Random;

import Class.ButacaClass;
import Class.CineClass;
import Class.EspectadorClass;
import Class.PeliculaClass;

/*
 * @author:		Josep Oriol López Bosch
 * @fecha:		21/04/2022
 * @version:	0.1.1
 */


public class Exercise06App {
	public static String[] apellidos = { "Gomez", "Guerrero", "Cardenas", "Cardiel", "Cardona", "Cardoso", "Cariaga", "Carillo",
			"Carion", "Castiyo", "Castorena", "Castro", "Grande", "Grangenal", "Grano", "Grasia", "Griego",
			"Grigalva"};
	public static EspectadorClass[] espectadores;
	public static ButacaClass [] butacas;
	public static PeliculaClass pelicula = new PeliculaClass("La cosa", 120, 12, "tarantino");
	public static CineClass cine = new CineClass(pelicula, 20);

	public static void main(String[] args) {
		
		//TODO: Crear cine
		//TODO: Crear butacas
		butacas = ButacaClass.generarAsientos();
		for(int i=0; i<butacas.length; i++) {
			//System.out.println(butacas[i].nombreAsiento);
		}
		//TODO: Crear y Asignar Pelicula
		
		//TODO: Crear espectadores
			//La capacidad de la sala es 72
			crearEspectadores(72);
		//TODO: Sentar espectadores
			sentarEspectadores();
			mostrarAsientos();
		

	}
//Methods
	
	//Crea x espectadores, donde x se pasa por parametro
	public static void crearEspectadores(int numEspectadores) {
		
		 espectadores = new EspectadorClass[numEspectadores];
		 for(int i=0; i<numEspectadores;i++){
		 		EspectadorClass espectador = new EspectadorClass(generadorDeNombres(0, apellidos.length), 
		 				generadorDeEdad(15,50), 
		 				generadorDeDinero());
		 		espectadores [i] = espectador;
		 }
		 
	}
	public static void sentarEspectadores() {
		int contador=0;
		
		for(int i=0; i<espectadores.length;i++) {
			do {
				Random rnd = new Random();
				int numRandom=rnd.nextInt(butacas.length);
				if(!butacas[numRandom].ocupado) {
					//Asignar espectador
					if(espectadores[i].edad>pelicula.edad) {
						if(espectadores[i].dinero>cine.dinero) {
							butacas[numRandom].espectador=espectadores[i];
							//Marcamos la butaca como ocupada
							butacas[numRandom].setOcupado(true);
							contador++;
						}
					}
				}
				
			}while(contador!=butacas.length);
		}
		
		System.out.println("El cine esta lleno o no hay mas espectadores");
		//TODO: sentar aleatoriamente
		//TODO: solo sentar si tienen suficiente dinero y butaca libre y edad suficiente
		//TODO: si asiento ocupado, buscar otro
	}
	//TODO: Pasarlo al package TOOLS
	//Generador de edades
	public static int generadorDeEdad(int inicio, int cantidad) {
		int edad=0;
		Random rnd = new Random();
		
		edad = (int) (rnd.nextDouble() * cantidad + inicio);
		
		return edad;
	}
	//Generador de dinero de 0 a 40 euros
		public static int generadorDeDinero() {
		
			int edad=0;
			Random rnd = new Random();
			
			edad = (int) (rnd.nextDouble() * 40 + 0);
			
			return edad;
		}
	//Generador de alumnos usando un listado
	public static String generadorDeNombres(int inicio, int cantidad) {
		Random rnd = new Random();
		
		String nombre = "";
		int randomNum = (int) (rnd.nextDouble() * cantidad + inicio);;
		
		
		nombre = apellidos[randomNum];
		
		return nombre;
	}
	public static void mostrarAsientos() {
		for(int i=0;i<butacas.length;i++) {
			System.out.println(butacas[i].nombreAsiento);
			System.out.println(butacas[i].espectador.nombre);
		}
		
	}
}
