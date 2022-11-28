package ejercicio3;

public class Barco {
	String nombre;
	int capacidadPasajero;
	int capacidadCarga;
	
	
	
	/**
	 * @param nombre
	 * @param capacidadPasajero
	 * @param capacidadCarga
	 */
	public Barco(String nombre, int capacidadPasajero, int capacidadCarga) {
		super();
		this.nombre = nombre;
		this.capacidadPasajero = capacidadPasajero;
		this.capacidadCarga = capacidadCarga;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCapacidadPasajero() {
		return capacidadPasajero;
	}
	public void setCapacidadPasajero(int capacidadPasajero) {
		this.capacidadPasajero = capacidadPasajero;
	}
	public int getCapacidadCarga() {
		return capacidadCarga;
	}
	public void setCapacidadCarga(int capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}
	
	@Override
	public String toString() {
		return "Barco [nombre=" + nombre + ", capacidadPasajero=" + capacidadPasajero + ", capacidadCarga="
				+ capacidadCarga + "]";
	}
	
	
	
}
