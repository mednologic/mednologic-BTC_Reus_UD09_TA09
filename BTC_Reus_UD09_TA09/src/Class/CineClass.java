package Class;

public class CineClass {
	
	public PeliculaClass pelicula;
	public int dinero;
	
	public CineClass() {
	
	}
	
	public CineClass(PeliculaClass pelicula, int dinero) {
		
		this.pelicula = pelicula;
		this.dinero = dinero;
	}
	public PeliculaClass getPelicula() {
		return pelicula;
	}
	public void setPelicula(PeliculaClass pelicula) {
		this.pelicula = pelicula;
	}
	public int getDinero() {
		return dinero;
	}
	public void setDinero(int dinero) {
		this.dinero = dinero;
	}
	
	
	
	


}
