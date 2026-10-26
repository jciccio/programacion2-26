public class ListaSimplementeEnlazadaCartas{
	private Nodo primero;

	private class Nodo{
		private Carta elemento;
		private Nodo siguiente;

		public Nodo(Carta elemento){
			this.elemento = elemento;
			this.siguiente = null;
		}

		public String toString(){
			return "" + elemento + " ";
		}
	}

	public ListaSimplementeEnlazadaCartas(){
		this.primero = null;
	}

	public void agregarAlInicio(Carta elemento){
		// 1. Necesitamos crear un Nodo nuevo (comienza desconectado de la lista)
		// 2. El siguiente del nodo nuevo va a ser el primero actual de la lista
		// 3. El primer elemento de la lista, va a ser el nodo nuevo.
		// (Actualizar los punteros de la lista).
		Nodo nuevo = new Nodo (elemento);
		nuevo.siguiente = primero;
		primero  = nuevo;
	}

	public void agregarAlFinal(Carta elemento){
		// Necesitamos recorrer la lista completa
		// hasta el último elmento (no nulo)
		// Creamos un nodo nuevo
		// Lo conectamos a nuestra lista (como el siguiente del ultimo actual)
		if(primero == null) {
			// La lista está vacía
			agregarAlInicio(elemento);
		}
		else{
			Nodo actual = primero;
			while(actual.siguiente != null){
				actual = actual.siguiente;
			}
			// Actual tiene una referencia al último nodo de la lista
			Nodo nuevo = new Nodo(elemento);
			actual.siguiente = nuevo;
		}
	}

	public String toString(){
		String contenido = "";
		Nodo actual = primero;
		while(actual != null){
			contenido += actual.toString();
			actual = actual.siguiente;
		}
		return contenido;
	}

	public static void main (String  [] args){
		ListaSimplementeEnlazadaCartas lse = new ListaSimplementeEnlazadaCartas();
		lse.agregarAlInicio(new Carta(1,"Corazones"));
		lse.agregarAlInicio(new Carta(5,"Corazones"));
		lse.agregarAlInicio(new Carta(8,"Corazones"));
		System.out.println(lse);
		lse.agregarAlFinal(new Carta(7,"Treboles"));
		System.out.println(lse);
		
		
	}













}