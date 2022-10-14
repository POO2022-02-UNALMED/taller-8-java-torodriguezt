package futbol;
public class Portero extends Futbolista {
	public short golesRecibidos;
	public byte dorsal;
	
	Portero(String nombre, int edad, short golesRecibidos, byte dorsal){
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}
	
	@Override
	public boolean jugarConLasManos() {
		return true;
	}

	@Override
	public int compareTo(Futbolista o) {
		Portero persona = (Portero) o;
		int total= Math.abs(golesRecibidos-persona.golesRecibidos);
		return total;
	}



}

