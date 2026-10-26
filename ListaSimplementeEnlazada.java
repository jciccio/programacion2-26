public class ListaSimplementeEnlazada{
	private Nodo primero;
	private int length;

	private class Nodo{
		private int elemento;
		private Nodo siguiente;

		public Nodo(int elemento){
			this.elemento = elemento;
			this.siguiente = null;
		}

		public String toString(){
			return "" + elemento + " ";
		}
	}

	public ListaSimplementeEnlazada(){
		this.primero = null;
		this.length = 0;
	}

	public void agregarAlInicio(int elemento){
		// 1. Necesitamos crear un Nodo nuevo (comienza desconectado de la lista)
		// 2. El siguiente del nodo nuevo va a ser el primero actual de la lista
		// 3. El primer elemento de la lista, va a ser el nodo nuevo.
		// (Actualizar los punteros de la lista).
		Nodo nuevo = new Nodo (elemento);
		nuevo.siguiente = primero;
		primero  = nuevo;
		this.length++;
	}

	public void agregarAlFinal(int elemento){
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
		this.length++;
	}


	private Nodo buscarPosicion(int posicion){
		int posicionActual = 0;
		Nodo actual = primero;
		while(actual != null && posicion != posicionActual){
			actual = actual.siguiente;
			posicionActual++;
		}
		return actual;
	}

	public int getElemento(int posicion){
		return buscarPosicion(posicion).elemento;
	}

	public boolean agregar(int posicion, int elemento){
		boolean agregado = false;
		if(posicion == 0){
			agregarAlInicio(elemento);
		}
		else if (posicion > 0){
			Nodo anterior = buscarPosicion(posicion - 1);
			if (anterior != null){
				Nodo nuevo = new Nodo(elemento);
				nuevo.siguiente = anterior.siguiente;
				anterior.siguiente = nuevo;
				agregado = true;
				this.length++;
			}
		}
		return agregado;
	}

	public boolean borrar(int posicion){
		// Casos para borrar
		// Es el primero de la lista
		// Es un nodo intermedio o final

		boolean borrado = false;

		if (posicion  >= 0  && primero != null){
			if(posicion == 0){
				// Posicion inicial
				Nodo nodoABorrar = primero;
				this.primero = primero.siguiente;
				nodoABorrar.siguiente = null;
				nodoABorrar = null;
				borrado = true;
				this.length--;
			}
			else {
				// Nodo intermedio o final
				Nodo anterior  = buscarPosicion(posicion -1);
				if(anterior != null){
					Nodo borrar = anterior.siguiente; //buscarPosicion(posicion);
					if(borrar != null){
						anterior.siguiente = borrar.siguiente;
						borrar.siguiente = null;
						borrar = null;
						borrado = true;
						this.length--;
					}
				}
			}
		}
		return borrado;
	}

	public int getLength(){
		return this.length;
	}

	public String toString(){
		String contenido = "La lista -> [";
		Nodo actual = primero;
		while(actual != null){
			contenido += actual.toString();
			actual = actual.siguiente;
		}
		return contenido.trim()  + "] tam: " + length;
	}

	public static void main (String  [] args){
		ListaSimplementeEnlazada lse = new ListaSimplementeEnlazada();
		lse.agregarAlInicio(1);
		lse.agregarAlInicio(2);
		lse.agregarAlInicio(3);
		System.out.println(lse);
		lse.agregarAlFinal(4);
		System.out.println(lse);
		lse.agregar(1,10);
		System.out.println(lse);
		lse.agregar(0,12);
		System.out.println(lse);
		lse.agregar(100,11);
		lse.agregar(-100,11);
		System.out.println(lse);
		
		lse.borrar(0);
		System.out.println(lse);
		lse.borrar(1);
		System.out.println(lse);
		lse.borrar(3);
		System.out.println(lse);
	}













}