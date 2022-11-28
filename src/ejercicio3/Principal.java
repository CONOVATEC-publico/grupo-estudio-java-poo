package ejercicio3;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Barco barco1=new Barco("yate", 50, 20);
		GPS gps=new GPS(10, 20, "13/11/202 18:51", 10);
		
		//Capitan capitan =  new Capitan(7246, 40, 10, "Miguel Grau", "28888",'M' , barco1, 8, Capitan.sueldo, 200.4f);
		Capitan capitan2 =  new Capitan(7246, 40, 10, "Miguel Grau", "28888",'M' , barco1, 8, 200.4f);
		JefeDeFlota jefe=new JefeDeFlota(777, 50, 15, "Jack Sparrow", "5555", 'M', barco1, 1000, 60000, 70000, 20f, 30f);
		
		System.out.println(barco1.toString());
		System.out.println(gps.toString());
		System.out.println(capitan2.toString());
	}

}
