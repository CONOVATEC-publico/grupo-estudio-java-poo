package ejercicio3;

public class JefeDeFlota extends Tripulante{

	int pesoPescado;
	int sueldo=3500000;
	int sueldoTotal;
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
	 * @param sueldo
	 * @param sueldoTotal
	 * @param bonoPescado
	 * @param bonoMariscos
	 */
	public JefeDeFlota(int dni, int edad, int tiempoEmpresa, String nombre, String telefono, char sexo, Barco barco,
			int pesoPescado, int sueldo, int sueldoTotal, float bonoPescado, float bonoMariscos) {
		super(dni, edad, tiempoEmpresa, nombre, telefono, sexo, barco);
		this.pesoPescado = pesoPescado;
		this.sueldo = sueldo;
		this.sueldoTotal = sueldoTotal;
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
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	public int getSueldoTotal() {
		return sueldoTotal;
	}
	public void setSueldoTotal(int sueldoTotal) {
		this.sueldoTotal = sueldoTotal;
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
	
	void calcularBonos() {
		
	}

	@Override
	void sueldo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void mostrarDatos() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
