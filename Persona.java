public class Persona{
	
	private int edad;
	private String nombre;

	public Persona(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}

	public int getEdad(){
		return edad;
	}

	public String getNombre(){
		return nombre;
	}

	public String toString(){
		return nombre + " " + edad ;
	}
}