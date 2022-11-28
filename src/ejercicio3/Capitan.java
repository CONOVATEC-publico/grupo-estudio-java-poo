package ejercicio3;

public class Capitan extends Tripulante{
	int horas;
	//static final int sueldo=2500000;
	int sueldo;
	float bono;


	
	
	/*
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}*/


	/**
	 * @param dni
	 * @param edad
	 * @param tiempoEmpresa
	 * @param nombre
	 * @param telefono
	 * @param sexo
	 * @param barco
	 * @param horas
	 * @param sueldo
	 * @param bono
	 */
	public Capitan(int dni, int edad, int tiempoEmpresa, String nombre, String telefono, char sexo, Barco barco,
			int horas, float bono) {
		super(dni, edad, tiempoEmpresa, nombre, telefono, sexo, barco);
		this.horas = horas;
		this.sueldo = 2500000;
		this.bono = bono;
	}

	
	public int getHoras() {
		return horas;
	}



	public void setHoras(int horas) {
		this.horas = horas;
	}



	public int getSueldo() {
		return sueldo;
	}



	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}



	public float getBono() {
		return bono;
	}



	public void setBono(float bono) {
		this.bono = bono;
	}
	//Implementado por Ever
	void sueldo() {
		
	}
	
	void mostrarDatos() {
		
	}

	void calcularBono() {
		
	}


	@Override
	public String toString() {
		return "Capitan ["+"dni=" +dni+"edad=" +edad+"tiempoEmpresa=" +tiempoEmpresa+"nombre=" +nombre+",horas=" + horas + ", sueldo=" + sueldo + ", bono=" + bono + "]";
	}
	
	
	
	
}
