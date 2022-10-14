package futbol;

public abstract class Futbolista implements Comparable <Futbolista> {
	private String nombre;
	private int edad;
	private final String posicion;
	
	Futbolista(String nombre, String posicion, int edad){
		this.nombre = nombre;
		this.posicion = posicion;
		this.edad = edad;

	}
	Futbolista(){
		this("Maradona", "delantero", 30);
	}
	
	public boolean equals(Futbolista f) {
		return (this == f);
	}
	
	public abstract boolean jugarConLasManos();
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getPosicion() {
		return posicion;
	}
	
	
}
