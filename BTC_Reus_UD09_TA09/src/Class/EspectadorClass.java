package Class;

public class EspectadorClass {
	
	public String nombre;
	public int edad;
	public int dinero;
	
	public EspectadorClass(String nombre, int edad, int dinero) {
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getDinero() {
		return dinero;
	}

	public void setDinero(int dinero) {
		this.dinero = dinero;
	}

	@Override
	public String toString() {
		
		return "Espectador [nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero+"]";
	}


	


}
