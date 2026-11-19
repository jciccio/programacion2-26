public class ListaSimplementeEnlazadaPersonas{
	private Nodo punteroPrimero;


	public class Nodo{
		private Persona elemento;
		private Nodo siguiente;
		private Nodo anterior;

		public Nodo (Persona elemento){
			this.elemento = elemento;
			this.anterior = this.siguiente = null;
		}

		public String toString(){
			return "" + elemento + " ";
		}
	}

	public boolean insertar(Persona persona) {
        boolean insertado = false;
        if (persona != null) {
            Nodo nuevo = new Nodo(persona);
            Nodo nodoPrevio = buscarPosicion(persona);
            if (nodoPrevio == null) {
                // Caso 1: Lista vacía o debe insertarse antes del primer elemento
                nuevo.siguiente = punteroPrimero;
                punteroPrimero = nuevo;
            } else {
                // Caso 2: Se inserta en medio o al final de la lista
                nuevo.siguiente = nodoPrevio.siguiente;
                nodoPrevio.siguiente = nuevo;
            }
            insertado = true;
        }
        return insertado;
    }

	 private Nodo buscarPosicion(Persona persona) {
        Nodo anterior = null;
        Nodo actual = this.punteroPrimero;
        boolean encontrado = false;
        while (actual != null && !encontrado) {
            // Si el elemento actual es mayor al nuevo, encontramos el punto de parada
            if (actual.elemento.getNombre().compareTo(persona.getNombre()) > 0) {
            	encontrado = true;	
            } else {
            	if(actual.elemento.getNombre().equals(persona.getNombre())){
            		System.out.println("Son iguales: " + actual.elemento);
            		if(actual.elemento.getEdad() > persona.getEdad()){
            			encontrado = true;
            		}
            		else{
            			anterior = actual;
                		actual = actual.siguiente;
            		}
            	}
            	else{
            		anterior = actual;
               		actual = actual.siguiente;
            	}               
            }
        }
        return anterior; 
    }

	


	public String toString(){
		String contenido = "La lista ->";
		Nodo actual = punteroPrimero;
		while(actual != null){
			contenido += "[" + actual.toString().trim() + "]";
			actual = actual.siguiente;
		}
		return contenido.trim();
	}




	public static void main (String [] args){
		ListaSimplementeEnlazadaPersonas lde = new ListaSimplementeEnlazadaPersonas();
		lde.insertar(new Persona("Jose", 10));
		lde.insertar(new Persona("Maria", 10));
		lde.insertar(new Persona("Maria", 1));
		lde.insertar(new Persona("Mario", 10));
		lde.insertar(new Persona("Maria", 11));
		lde.insertar(new Persona("Ariana", 10));
		System.out.println(lde);
	}






}