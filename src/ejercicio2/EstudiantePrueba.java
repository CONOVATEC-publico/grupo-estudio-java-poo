package ejercicio2;

public class EstudiantePrueba {
	private String nombre;
	private String apellido;
	private int edad;
	private String dni;
	private double saldo;
	//double saldo2;
	//Curso curso;
	
	public double comprarGalleta(double dinero) {
		double nuevo_saldo=0;
		nuevo_saldo=dinero-1.5;
		
		return  nuevo_saldo;
	}
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	EstudiantePrueba(String nombre, String apellido, int edad, String dni, double saldo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.dni = dni;
		this.saldo = saldo;
	}



	
	
	
}
