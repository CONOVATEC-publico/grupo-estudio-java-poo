package ejercicio1;
/*
EJERCICIOS POO1.
Crea una clase CRectangulo. La clase tiene dos datos miembro, base y altura.
La clase cuenta con métodos que calculan el perímetro (obtenPerimetro) y el area (obtenArea) 
del  rectángulo,  así  como  métodos  para  obtener (get)y  poner(set)los  valores correspondientes 
a  los  atributos basey altura.  Los  métodos  poner  deben  comprobar que tanto basecomo altura 
sean mayores que 0 y menores que 20. Crea  un  constructor  para  la  clase  CRectangulo.
El  valor  por  defecto  de  los  atributos será 1.

Construya un Menu: 
1. Ingrese Base y Altura
2.Calcular Area
3. Calcular Perimetro
4. Salir

 */
public class Principal {
	
	public static void main(String[] args) {
		CRectangulo rectangulo1=new CRectangulo();
		
		rectangulo1.setAltura(10);
		rectangulo1.setBase(19);

		System.out.println("Area: "+rectangulo1.obtenArea());
		System.out.println("Perimetro: "+rectangulo1.obtenPerimetro());
	}
	
	
	
	

	
}
