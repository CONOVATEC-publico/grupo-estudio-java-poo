package ejercicio1;

public class CRectangulo {
	private double base;
	private double altura;
	
	
	
	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		if(base>0 && base <20) {
			this.base = base;
		}else {
			System.out.println("base no cumple con los requisitos del sistema");
		}
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		if(altura>0 && altura <20) {
			this.altura = altura;
		}else {
			System.out.println("altura no cumple con los requisitos del sistema");
		}
	}


	double obtenPerimetro() {
		return base+altura;
	}
	
	
	double obtenArea() {
		return base*altura;
	}


	/**
	 * @param base
	 * @param altura
	 */
	public CRectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}


	/**
	 * 
	 */
	public CRectangulo() {
		super();
	}
	
	
	
}
