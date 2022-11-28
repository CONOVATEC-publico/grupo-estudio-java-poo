package ejercicio3;

public abstract class Tripulante {
	
	int dni;
	int edad;
	int tiempoEmpresa;
	String nombre;
	String telefono;
	char sexo;
	Barco barco;
	
	
	/**
	 * @param dni
	 * @param edad
	 * @param tiempoEmpresa
	 * @param nombre
	 * @param telefono
	 * @param sexo
	 * @param barco
	 */
	public Tripulante(int dni, int edad, int tiempoEmpresa, String nombre, String telefono, char sexo, Barco barco) {
		super();
		this.dni = dni;
		this.edad = edad;
		this.tiempoEmpresa = tiempoEmpresa;
		this.nombre = nombre;
		this.telefono = telefono;
		this.sexo = sexo;
		this.barco = barco;
	}
	
	public int getDni() {
		return dni;
	}
	
	public void setDni(int dni) {
		this.dni = dni;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getTiempoEmpresa() {
		return tiempoEmpresa;
	}
	public void setTiempoEmpresa(int tiempoEmpresa) {
		this.tiempoEmpresa = tiempoEmpresa;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public Barco getBarco() {
		return barco;
	}
	public void setBarco(Barco barco) {
		this.barco = barco;
	}
	
	
	abstract void sueldo();
	
	abstract void mostrarDatos();
	
}
