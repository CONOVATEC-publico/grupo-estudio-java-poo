package ejercicio3;

import java.util.Scanner;

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
	void sueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	
	void mostrarDatos(int horas) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese las horas de trabajo:");
		horas = sc.nextInt();
		System.out.println(horas);
		double suma_sueldo = 0; //creamos el acumulador
		
		sueldo();
		double sueld = sc.nextDouble();
		suma_sueldo = suma_sueldo + sueld;
		
		calcularBono(bono);
		double bon = sc.nextDouble();
		suma_sueldo = suma_sueldo + bon;
		System.out.println("El sueldo total es:"+suma_sueldo);
		
				
	}
		
	void calcularBono(double bono) {
		if (horas >= 5000 && horas < 150000){
			bono = (0.20*sueldo); 
		}
		else if (horas >= 150000 && horas < 300000) {
			bono = (0.40*sueldo);
		}
		else if (horas >= 300000) {
			bono = (0.75*sueldo);
		}
	}


	@Override
	public String toString() {
		return "Capitan ["+"dni=" +dni+"edad=" +edad+"tiempoEmpresa=" +tiempoEmpresa+"nombre=" +nombre+",horas=" + horas + ", sueldo=" + sueldo + ", bono=" + bono + "]";
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
