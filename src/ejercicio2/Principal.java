package ejercicio2;

/*
EJERCICIOS POO2.
Crear  un  programa  en  el  cual  se  permita  registrar  los  datos  personales  de  un estudiante, 
así como  su  promedio  final  (0-20)  del  curso  de  LPOO.
Implemente acciones  como:  Asignar  Datos,  visualizar  datos,  modificar  datos, 
condición  del estudiante  (Aprobado  a  Desaprobado).  Tenga  en  cuenta  Atributos,  
métodos  y constructores, también en el momento de la asignación tener en cuenta que no sean datos vacíos.
Construya un Menu:

 */
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double promedio=0;
		//EstudiantePrueba persona1=new EstudiantePrueba("juanito","Jimenez",22,"77777777",11);
		//System.out.println("Dinero restante de "+persona1.getNombre()+" : " +persona1.comprarGalleta(persona1.getSaldo()));
		
		double notas[]= new double[4];
		notas[0]=15.0;
		notas[1]=19.0;
		notas[2]=00;
		notas[3]=05;
		
		Curso curso1=new Curso("LPOO", "Lenguaje de Programacion Orientada a Objetos", notas);
		
		Estudiante estudiante1=new Estudiante("Adrian", "726", 23,curso1 );
		
		promedio=estudiante1.getCurso().promedioFinal();
		
		System.out.println("Promedio: "+promedio);
		
		estudiante1.condicionEstudiante(curso1);

	}

}
