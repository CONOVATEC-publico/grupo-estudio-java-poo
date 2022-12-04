package ejercicio3;

public class JefeDeFlota extends Tripulante {

	int pesoPescado;
	int pesoMariscos;
	final int sueldo = 3500000;
	float sueldoTotal;
	float bonoPescado;
	float bonoMariscos;

	/**
	 * @param dni
	 * @param edad
	 * @param tiempoEmpresa
	 * @param nombre
	 * @param telefono
	 * @param sexo
	 * @param barco
	 * @param pesoPescado
	 * @param pesoMariscos
	 * @param bonoPescado
	 * @param bonoMariscos
	 */
	public JefeDeFlota(int dni, int edad, int tiempoEmpresa, String nombre, String telefono, char sexo, Barco barco,
			int pesoPescado, int pesoMariscos, float bonoPescado, float bonoMariscos) {
		super(dni, edad, tiempoEmpresa, nombre, telefono, sexo, barco);
		this.pesoPescado = pesoPescado;
		this.pesoMariscos = pesoMariscos;
		this.bonoPescado = bonoPescado;
		this.bonoMariscos = bonoMariscos;
	}
	
	public int getPesoPescado() {
		return pesoPescado;
	}
	public void setPesoPescado(int pesoPescado) {
		this.pesoPescado = pesoPescado;
	}
	public int getSueldo() {
		return sueldo;
	}
	public float getSueldoTotal() {
		this.sueldo();
		return sueldoTotal;
	}
	public float getBonoPescado() {
		return bonoPescado;
	}
	public void setBonoPescado(float bonoPescado) {
		this.bonoPescado = bonoPescado;
	}
	public float getBonoMariscos() {
		return bonoMariscos;
	}
	public void setBonoMariscos(float bonoMariscos) {
		this.bonoMariscos = bonoMariscos;
	}
	float calcularBonos() {
		return this.bonoPescado + this.bonoMariscos * 2;
	}

	@Override
	void sueldo() {
		this.sueldoTotal = this.sueldo + this.calcularBonos();
	}

	@Override
	void mostrarDatos() {
		System.out.println();
		System.out.println("Datos del Jefe de Flota");
		System.out.println(" Numero de Carnet: " + this.dni);
		System.out.println(" Nombre: " + this.nombre);
		System.out.println(" Sexo: " + this.sexo);
		System.out.println(" Edad: " + this.edad);
		System.out.println(" Telefono: " + this.telefono);
		System.out.println(" Tiempo en la Empresa: " + this.tiempoEmpresa + " años");
		System.out.println(" Sueldo Base: " + (float)this.sueldo);
		System.out.println(" Bono por Pescado: " + this.bonoPescado);
		System.out.println(" Bono por Marisco y Molusco: " + this.bonoMariscos*2);
		System.out.println(" Sueldo Total: " + this.getSueldoTotal());
		System.out.println();
	}
}
