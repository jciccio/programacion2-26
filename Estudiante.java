public class Estudiante{
	// Sección para los Atributos
	// Hay que definir si son publicos o privados (para nosotros todos son privados)
	// Definir el tipo de datos
	// Definir el nombre de la variable
	private String nombre;

	// Sección para los métodos
	// Son las acciones que puedo llevar a cabo desde una instancia de objeto o clase
	// los métodos son públicos
	// Hay que definir que retorna el método
	// Se define su nombre
	// Se define qué necesita para funcionar entre los ()

	// void significa que el método no retorna nada
	public void bautizar(String elNombreNuevo){
		nombre = elNombreNuevo;
	}

	public void saludar(){
		System.out.println("Hola me llamo: " + nombre);
	}











}