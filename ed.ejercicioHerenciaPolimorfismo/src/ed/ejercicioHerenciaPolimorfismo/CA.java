package ed.ejercicioHerenciaPolimorfismo;

public class CA extends CB implements IC, Comparable{
	
	int x,y;
	
	public CA(int x,int y,int z) {
		super();
		this.z=z;
		this.y=y;
		this.x=x;
	}
	public CA() {
		
	}
	public int suma() {
		return x+y;
	}
	@Override
	public int mayor() {
		return 0;
	}

	@Override
	public int compareTo(CA uno, CA dos) {
		

		if(uno.z==dos.z)
			return 0;
		else if(uno.z<dos.z)
			return -1;
		else 
			return +1;
	}
	
	
}
