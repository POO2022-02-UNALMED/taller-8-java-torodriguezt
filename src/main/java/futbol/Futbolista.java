package futbol;

public abstract class Futbolista implements Comparable <Futbolista> {
	private String nombre;
	private int edad;
	private final String posicion;
	
	public Futbolista(String nombre,  int edad, String posicion){
		this.nombre = nombre;
		this.posicion = posicion;
		this.edad = edad;

	}
	
	public Futbolista(){
		this("Maradona", 30, "delantero");
	}
	
	public boolean equals(Futbolista f) {
		return (this == f);
	}
	
	public String toString() {
		return "El futbolista " + nombre + " tiene " + edad + ", y juega de " + posicion;
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
