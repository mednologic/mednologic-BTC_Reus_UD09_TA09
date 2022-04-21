package Class;

public class ButacaClass {
	
	public static final String LETRAS = "ABCDEFGHI";
	public static final String NUMEROS = "12345678";

	public boolean ocupado=false;
	public String nombreAsiento;
	public EspectadorClass espectador;
	
	
	
	
	public ButacaClass() {
	}

	public ButacaClass(String nombreAsiento) {
		this.nombreAsiento = nombreAsiento;
	}



	//Crea y devuelve un array con las butacas segun la cantidad de filas y columnas determinada por LETRAS Y NUMEROS
	// de esta manera si se quiere ampliar la sala solo se debe modificar LETRAS o NUMEROS
	public static ButacaClass [] generarAsientos() {
		int totalAsientos = LETRAS.length()*NUMEROS.length();
		ButacaClass [] butacaArray = new ButacaClass [totalAsientos];
		ButacaClass butaca= new ButacaClass();
		
		
		//Loop array
		for(int i=0; i<totalAsientos; i++) {
			String nom="";
			String num="";
			String letr="";
			
			//Loop numeros
			for(int x = 0; x<NUMEROS.length(); x++) {
				nom =String.valueOf(NUMEROS.charAt(x));
				//Loop Letras
			}
			/*for(int y=0; y<LETRAS.length();y++) {
				letr = String.valueOf(LETRAS.charAt(y));
			
					nom = nom + letr;	
			}*/
			butaca = new ButacaClass(nom);
			butacaArray[i]=butaca;
			//System.out.println(butacaArray[i].nombreAsiento);
			
		}
			
		return butacaArray;
	}



	

	
//Getters y setters
	public boolean isOcupado() {
		return ocupado;
	}
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
	public String getNombreAsiento() {
		return nombreAsiento;
	}
	public void setNombreAsiento(String nombreAsiento) {
		this.nombreAsiento = nombreAsiento;
	}

	public EspectadorClass getEspectador() {
		return espectador;
	}

	public void setEspectador(EspectadorClass espectador) {
		this.espectador = espectador;
	}
	
}
