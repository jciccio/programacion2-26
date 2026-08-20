public class Perro{
	// Queremos dos atributos: nombre y el estado
	private String nombre;
	private String estado;



	// Constructor de clase
	// Es un método que se ejecuta sólo 1 vez
	// Al instanciar un objeto
	public Perro(){
		nombre = "Elsa";
		estado = "haciendo nada";
	}

	public Perro(String nombre){
		this.nombre = nombre;
		estado ="";
	}

	public void saludar(){
		System.out.println("Hola me llamo: " + nombre + "\nY estoy: \n" + estado + "\n\n");
	}

	public void sentarse(){
	  String sentarse = "                                           /\\ /\\\n";
      sentarse = sentarse + "                                          /  \\---._\n";
      sentarse += "                                         / / `     `\\\n";
      sentarse += "                                         \\ \\   `'<@)@)      \n";
      sentarse += "                                         /`         ~ ~._ \n";
      sentarse += "                                        /                `() \n";
      sentarse += "                                       /    \\   (` ,_.:.  /\n";
      sentarse += "                                      / ~    `\\   (vVvvvvV\n";
      sentarse += "                                     /       |`\\_ `^^^/\n";
      sentarse += "                                 ___/________|_  `---'\n";
      sentarse += "                                (______________) _\n";
      sentarse += "                                _/~          | `(_)\n";
      sentarse += "                              _/~             \\  \n";
      sentarse += "                            _/~               |\n";
      sentarse += "                          _/~                 |\n";
      sentarse += "                        _/~                   |\n";
      sentarse += "                      _/~         ~.          |\n";
      sentarse += "                    _/~             \\        /\\\n";
      sentarse += "                 __/~               /`\\     `||\n";
      sentarse += "               _/~      ~~-._     /~   \\     ||\n";
      sentarse += "              /~             ~./~'      \\    |)\n";
      sentarse += "             /                 ~.        \\   )|\n";
      sentarse += "            /                    :       |   ||\n";
      sentarse += "            |                    :       |   ||\n";
      sentarse += "            |                   .'       |   ||\n";
      sentarse += "       __.-`                __.'--.      |   |`---. \n";
      sentarse += "    .-~  ___.         __.--~`--.))))     |   `---.)))\n";
      sentarse += "   `---~~     `-...--.________)))))      \\_____)))))\n";


	  estado = sentarse;
	}

	public void correr(){
		String correr = "              .--~~,__\n"+ 
      					" :-....,-------`~~'._.'\n"+ 
					      "  `-,,,  ,_      ;'~U'\n"+ 
					      "   _,-' ,'`-__; '--.\n"+ 
					      "  (_/'~~      ''''(;\n";
		estado = correr;
	}

}