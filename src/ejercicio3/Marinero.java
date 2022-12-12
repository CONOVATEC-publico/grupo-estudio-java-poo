package ejercicio3;

public class Marinero extends Tripulante {
    
    /**
     * @param dni
     * @param edad
     * @param tiempoEmpresa
     * @param nombre
     * @param telefono
     * @param sexo
     * @param barco
     * @param pesoTotal
     * @param bono
     */
    public Marinero(int dni, int edad, int tiempoEmpresa, String nombre, String telefono, char sexo, Barco barco,
            int pesoTotal, float bono) {
        super(dni, edad, tiempoEmpresa, nombre, telefono, sexo, barco);
        this.pesoTotal = pesoTotal;
        this.bono = bono;
    }

    int pesoTotal;
    final float sueldo = 90000;
    float sueldoTotal;
    float bono;

    public int getPesoTotal() {
        return pesoTotal;
    }
    public void setPesoTotal(int pesoTotal) {
        this.pesoTotal = pesoTotal;
    }
    public float getSueldo() {
        return sueldo;
    }
    public float getSueldoTotal() {
        return this.sueldo + this.calcularBono();
    }
    public float getBono() {
        return bono;
    }
    public void setBono(float bono) {
        this.bono = bono;
    }

    private float calcularBono() {
        if (this.pesoTotal >= 1) {
            return this.bono * (1 + 0.25f);
        }

        return this.bono;
    }
    @Override
    void sueldo() {
        this.sueldoTotal = this.sueldo + this.calcularBono();
        
    }
    @Override
    void mostrarDatos() {
        System.out.println();
		System.out.println("Datos del Marinero");
		System.out.println(" Numero de Carnet: " + this.dni);
		System.out.println(" Nombre: " + this.nombre);
		System.out.println(" Sexo: " + this.sexo);
		System.out.println(" Edad: " + this.edad);
		System.out.println(" Telefono: " + this.telefono);
		System.out.println(" Tiempo en la Empresa: " + this.tiempoEmpresa + " años");
		System.out.println(" Monto del bono: " + this.calcularBono());
		System.out.println(" Sueldo Total: " + this.getSueldoTotal());
		System.out.println();
    }
}
