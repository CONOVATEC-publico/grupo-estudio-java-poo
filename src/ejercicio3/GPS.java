package ejercicio3;

public class GPS {
	int x;
	int y;
	String fechaHora;
	int diasTripulando;
	
	
	/**
	 * @param x
	 * @param y
	 * @param fechaHora
	 * @param diasTripulando
	 */
	public GPS(int x, int y, String fechaHora, int diasTripulando) {
		super();
		this.x = x;
		this.y = y;
		this.fechaHora = fechaHora;
		this.diasTripulando = diasTripulando;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getFechaHora() {
		return fechaHora;
	}
	public void setFechaHora(String fechaHora) {
		this.fechaHora = fechaHora;
	}
	public int getDiasTripulando() {
		return diasTripulando;
	}
	public void setDiasTripulando(int diasTripulando) {
		this.diasTripulando = diasTripulando;
	}

	@Override
	public String toString() {
		return "GPS [x=" + x + ", y=" + y + ", fechaHora=" + fechaHora + ", diasTripulando=" + diasTripulando + "]";
	}
	
	
	
}
