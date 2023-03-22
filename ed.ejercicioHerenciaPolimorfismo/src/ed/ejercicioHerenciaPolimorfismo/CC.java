package ed.ejercicioHerenciaPolimorfismo;

public class CC extends CD {

	
	public CC(int x, int y) {
		super(x, y);
	}

	//Añadir e implementar el método int dobleSuma() en CC .
	public int dobleSuma() {
		return suma()*2;		
	}
}
