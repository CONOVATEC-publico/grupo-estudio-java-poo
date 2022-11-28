package ejercicio2;

public class Estudiante {
	private String nombre;
	private String dni;
	private int edad;
	private Curso curso;
	private enum estado{
		Aprobado,Desaprobado;
	}
	
	/**
	 * @param nombre
	 * @param dni
	 * @param edad
	 * @param curso
	 */
	public Estudiante(String nombre, String dni, int edad, Curso curso) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.curso = curso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	
	/*
	public double promedioFinal(Curso curso1){
		double promedio=0.0;
		
		for(int i=0;i<4;i++) {
			promedio=promedio+curso1.getNotas()[i];
		}
		
		return promedio;
	}*/
	
	public void asignarDatos(String nombre, String dni, int edad, Curso LPoo) {
		this.setNombre(nombre);
		this.setDni(dni);
		this.setEdad(edad);
		this.setCurso(LPoo);
		
	}
	
	public void modificarDatos(String nombre, String dni, int edad, Curso curso1) {
		this.setNombre(nombre);
		this.setDni(dni);
		this.setEdad(edad);
		this.setCurso(curso1);
	}
	
	public void condicionEstudiante(Curso curso1){
		estado estatus;
		if(curso1.promedioFinal()>11) {
			estatus=estado.Aprobado;
		}else {
			estatus=estado.Desaprobado;
		}
		
		System.out.println("Estado:"+estatus);
	}
	
	
	public void asignarCurso(Curso curso1) {
		this.setCurso(curso1);
	}
	
	
	
}
