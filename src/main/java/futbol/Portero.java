package futbol;
public class Portero extends Futbolista {
	public short golesRecibidos;
	public byte dorsal;
	
	Portero(String nombre, int edad, short golesRecibidos, byte dorsal){
		super(nombre, "Portero", edad);
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}

	public int compareTo(Portero o) {
		int total= Math.abs(golesRecibidos-o.golesRecibidos);
		return total;
	}
	
	@Override
	public boolean jugarConLasManos() {
		// TODO Auto-generated method stub
		return false;
	}



}

