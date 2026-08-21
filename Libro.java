public class Libro{
	
	private String nombre;
	private String estado;


	// Constructor de clase
	// NO tiene tipo de retorno
	public Libro(String nombreDelLibro){
		//Se ejecuta cuando se instancia la clase
		nombre = nombreDelLibro;
		cerrar();
	}

	// Set -> Asignar
	public void setNombre(String nombreNuevo){
		nombre = nombreNuevo;
	}

	// Get -> Obtener
	public String getNombre(){
		return nombre;
	}

	public void imprimir(){
		System.out.println("EL libro se llama: "+ this.nombre + "\nEl estado es:\n"+estado);
	}

	public void abrir(){
		String abierto = 
		 "      __...--~~~~~-._   _.-~~~~~--...__\n"
    	+"    //               `V'               \\\\ \n"
   		+"   //                 |                 \\\\ \n"
  		+"  //__...--~~~~~~-._  |  _.-~~~~~~--...__\\\\ \n"
 		+" //__.....----~~~~._\\ | /_.~~~~----.....__\\\\\n"
		+"====================\\\\|//====================\n"
        +"                    `---`";
     	estado = abierto;               
	}

	public void cerrar(){
		String cerrado = "   ,   ,\n"
		+"  /////|\n"
		+" ///// |\n"
		+"|~~~|  |\n"
		+"|===|  |\n"
		+"|j  |  |\n"
		+"| g |  |\n"
		+"|  s| /\n"
		+"|===|/\n"
		+"'---'\n";
		estado = cerrado;
	}

}