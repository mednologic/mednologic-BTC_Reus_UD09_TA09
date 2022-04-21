package Pr04;
/*
 * @author:		Josep Oriol Lopez Bosch / 	David Dalmau Dieguez / Octavio Bernal Vilana
 * @fecha:		19/04/2022
 * @version:	0.0.1
 */
import Class.RaicesClass;

public class Exercise04App {

	public static void main(String[] args) {
		
		// 1 soluci�n real.
		RaicesClass r1 = new RaicesClass(1,-2,1);
		// 2 soluciones reales
		RaicesClass r2 = new RaicesClass(5,5,1);
		// Ninguna soluci�n real.
		RaicesClass r3 = new RaicesClass(5,2,1);

		System.out.println("- Ecuaci�n 1");
		r1.calcular();
		System.out.println("- Ecuaci�n 2");
		r2.calcular();
		System.out.println("- Ecuaci�n 3");
		r3.calcular();

	}

}
