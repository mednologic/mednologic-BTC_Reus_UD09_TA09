package Class;
/*
 * @author:		Josep Oriol Lopez Bosch / 	David Dalmau Dieguez / Octavio Bernal Vilana
 * @fecha:		19/04/2022
 * @version:	0.0.1
 */
public class RaicesClass {

	/* Atributos de clase */
	private int a;
	private int b;
	private int c;
	private double discriminante;
	private boolean tieneraices;
	private double resultado1, resultado2;

	/* Constructor con todos los atributos */
	public RaicesClass(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		getDiscriminante();
	}

	/* M�todo para obtener el discriminante */
	public double getDiscriminante() {
		discriminante = (b * b) - 4 * a * c;
		return discriminante;
	}

	/* M�todo para comprobar si la ecuaci�n tiene dos soluciones */
	public boolean tieneRaices() {
		if (discriminante > 0) {
			tieneraices = true;
			System.out.println("Tiene dos soluciones reales.");
		} else if(discriminante == 0) {
			tieneraices = false;
			System.out.println("Solo tiene una �nica soluci�n real.");
		} else if(discriminante < 0) {
			tieneraices = false;
			System.out.println("No tiene soluciones reales , solo complejas.");
		}

		return tieneraices;
	}

	/* M�todo para calcular las diferentes soluciones */
	public void calcular() {
		if (discriminante > 0) {
			resultado1 = ((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
			System.out.println("Soluci�n 1: " + resultado1);
			resultado2 = ((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
			System.out.println("Soluci�n 2: " + resultado2);
		} else if(discriminante == 0) {
			resultado1 = ((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
			System.out.println("Soluci�n 1: " + resultado1);
		} else if(discriminante < 0) {
			System.out.println("No tiene soluciones reales , solo complejas.");
		}
	}
}
