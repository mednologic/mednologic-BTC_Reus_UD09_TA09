package Class;

public class PeliculaClass {
	
	public String titulo;
	public int duracion;
	public int edad;
	public String director;
	
	public PeliculaClass() {
	
	}

	

	public PeliculaClass(String titulo, int duracion, int edad, String director) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.edad = edad;
		this.director = director;
	}



	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}



	public String getDirector() {
		return director;
	}



	public void setDirector(String director) {
		this.director = director;
	}


	

}
