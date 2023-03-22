package ed.ejercicioHerenciaPolimorfismo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Dado el código: CA a = new CB(1,2,3); ¿qué valor devuelve “a.suma();”?
		//Lo que pide el ejercicio 1 da error, al igual que si hacemos el casteo a CA.
		//CA a = new CB(1,2,3); 
		//CA a = (CA) new CB(1,2,3);
		
		CD instanciaCD = new CD(2,2);
		CC instanciaCC = new CC(2,2);
	
		System.out.println(instanciaCD.suma());
		System.out.println(instanciaCC.dobleSuma());
		
		Comparable intC = new CA();
		
		CA ca1 = new CA(5,5,5);
		CA ca2 = new CA(5,5,5);

		if(intC.compareTo(ca1, ca2)==0)
			System.out.println("El campo z de los objetos tienen el mismo valor");
		else if(intC.compareTo(ca1, ca2)==-1)
			System.out.println("El campo z del objeto ca1 es mayor que el de ca2");
		else
			System.out.println("El campo z del objeto ca2 es mayor que el de ca1");

 	}

}
