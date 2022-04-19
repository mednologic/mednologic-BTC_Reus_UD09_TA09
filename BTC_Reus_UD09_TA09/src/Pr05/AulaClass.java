package Pr05;

import java.util.List;

public class AulaClass {
	
	protected int id;
	protected int num_max_students;
	enum materiaClase {Matematicas, Filosofia, Fisica}
	protected String materia;
	protected int num_clases; //Cantidad de clases impartidas
	protected List <AlumnoClass> alumnos;
	protected boolean [][]asistenciaAlumnosClase;
	protected boolean [] clasesRealizadas;
	protected ProfesorClass profesor;
	protected int aprovadosTotal;
	
	
	//Los arrays de asistencuaAlumnosClase y clases realizadas se crea la dimension al crear el objeto
	public AulaClass() {
		
	}

	public AulaClass(int id, int num_max_students) {
		super();
		this.id = id;
		this.num_max_students = num_max_students;
	}
	public AulaClass(int id, int num_max_students, String materia, int num_clases) {
		super();
		this.id = id;
		this.num_max_students = num_max_students;
		this.materia = materia;
		this.num_clases = num_clases;
		asistenciaAlumnosClase = new boolean [num_clases][num_max_students];
		clasesRealizadas = new boolean [num_clases];
	}
//Methods
	//TODO: Generar metodo crear sesiones de clase
	//Todo: si hay mas del 50% de los alumnos se hace clase y profe disponible
	//TODO: profe va a clase?
	public void clasePosible(int numClase) {
		int contador=0;
		System.out.println("Clase numero :"+(numClase+1)+"\n______________________________________________");
		System.out.println("Num alumnos: "+alumnos.size());
		boolean alumnoEnClase = false;
		//boolean [] asistenciaClase = new boolean [num_clases];
		for(int i=0; i<alumnos.size();i++) {
			//Comprobamos si van a clase
			alumnoEnClase = alumnos.get(i).vaAClase();
			//Lo grabamos en el array de asistencia
			asistenciaAlumnosClase[numClase][i]=alumnoEnClase;
			if(asistenciaAlumnosClase[numClase][i]=alumnoEnClase) {
				contador++;
			}
			//TODO: comprobar si el profe va a clase con un random boolean 0.2
			//Si mas del 50% se hace clase y si el profe va tb
		}
		
		//Comprobando si la clase se ha realizado
		if((alumnos.size()/2)<=contador) {
			System.out.println("\nClase realizada");
			clasesRealizadas[numClase]=true;
		}else {
			System.out.println("\nClase no realizada");
			clasesRealizadas[numClase]=false;
		}
		//TODO: Esto va a toString
		System.out.println("Han asistido : "+contador+" de "+(alumnos.size()));
		
		//TODO: si no se hace clase todo en false
	}
	//TODO: Asignar notas
	public void asignarNotas() {
		for(AlumnoClass target: alumnos) {
			target.setCalificacion(target.calidicacionRecibida());
		}
	}
	//TODO: Mostrar aprovados
	public void verAprovados() {
		for(AlumnoClass target: alumnos) {
			if(target.getCalificacion()>=5) {
				aprovadosTotal++;
			}
		}
		System.out.println("\n\nAPROVADOS: "+aprovadosTotal);
		for(AlumnoClass target: alumnos) {
			if(target.getCalificacion()>=5) {
				System.out.println("El alumno: "+target.nombre+ " a aprovado con un: "+ target.calificacion);
			}
		}
	}
	//TODO: Esto va a toString
	public void verClasesRealizadas() {
		
		for (int i=0; i<clasesRealizadas.length;i++) {
			System.out.println("");
			System.out.print("Clase num: "+i+" ");
			if(clasesRealizadas[i]) {
				System.out.print("realizada");
			}else {
				System.out.print("no realizada");
			}
		}
	}
	//TODO: profesor
	public void verProfeAula() {
		System.out.println("El profesor del aula: "+profesor.nombre+" \nMateria: "+profesor.materia);
	}
	
	//TODO: revisar esto
@Override
	public String toString() {
		verClasesRealizadas();
		return super.toString();
	}

	//Getters and setters
	public int getNum_max_students() {
		return num_max_students;
	}

	public void setNum_max_students(int num_max_students) {
		this.num_max_students = num_max_students;
	}

	public List<AlumnoClass> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<AlumnoClass> alumnos) {
		this.alumnos = alumnos;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public ProfesorClass getProfesor() {
		return profesor;
	}

	public void setProfesor(ProfesorClass profesor) {
		this.profesor = profesor;
	}

	public int getNum_clases() {
		return num_clases;
	}

	public void setNum_clases(int num_clases) {
		this.num_clases = num_clases;
	}
	
	
}
