package ejercicio2;

public class Curso {
	private String codigoCurso;
	private String nombre;
	private double notas[]= new double[4];

	
	
	
	/**
	 * @param codigoCurso
	 * @param nombre
	 * @param notas
	 * @param promedio
	 */
	public Curso(String codigoCurso, String nombre, double[] notas) {
		super();
		this.codigoCurso = codigoCurso;
		this.nombre = nombre;
		this.notas = notas;
	}

	public String getCodigoCurso() {
		return codigoCurso;
	}
	
	public void setCodigoCurso(String codigoCurso) {
		this.codigoCurso = codigoCurso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double promedioFinal(){
		double sumatoriaNotas=0.0;
		
		for(int i=0;i<4;i++) {
			sumatoriaNotas+=notas[i];
		}
		
		return sumatoriaNotas/4;
	}
	
	 
}
