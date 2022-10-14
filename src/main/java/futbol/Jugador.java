package futbol;
public class Jugador extends Futbolista {
	public short golesMarcados;
	public byte dorsal;
	
	Jugador(String nombre, String posicion, int edad, short golesMarcados, byte dorsal){
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}
	
	Jugador(){
		super();
		golesMarcados = 289;
		dorsal = 7;
	}

	@Override
	public int compareTo(Futbolista o) {
		int diferencia = Math.abs(getEdad()-o.getEdad());
		return diferencia;
	}

	@Override
	public boolean jugarConLasManos() {
		return false;
	}
}
