public class ListaDoblementeEnlazada{
	private Nodo punteroPrimero;
	private Nodo punteroUltimo;

	public class Nodo{
		private int elemento;
		private Nodo siguiente;
		private Nodo anterior;

		public Nodo (int elemento){
			this.elemento = elemento;
			this.anterior = this.siguiente = null;
		}

		public String toString(){
			return "" + elemento + " ";
		}

		public int getElemento(){
			return this.elemento;
		}
	}

	public void insertarAlInicio(int elemento){
		Nodo nuevo = new Nodo(elemento);
		if(punteroPrimero == null){
			// La lista está vacía
			punteroPrimero = nuevo;
			punteroUltimo = nuevo;
		}
		else{
			// La lista tiene al menos un elemento
			punteroPrimero.anterior = nuevo;
			nuevo.siguiente = punteroPrimero;
			punteroPrimero = nuevo;
		}
	}

	public void insertarAlFinal(int elemento){

	}

	private Nodo buscar(int posicion){
		Nodo actual = this.punteroPrimero;
		int posicionActual = 0;
		while(actual != null && posicion != posicionActual){
			actual = actual.siguiente;
			posicionActual++;
		}
		return actual;
	}

	public boolean insertar(int elemento, int posicion){
		// Tenemos 3 casos:
		// Insertar al inicio
		// Insertar al final
		// Insertar al medio 
		// No insertar viene por omisión
		boolean insertado = false;
		if(posicion == 0){ // Insertar al inicio
			insertarAlInicio(elemento);
			insertado = true;
		}
		else if(posicion > 0 && this.punteroPrimero != null){
			Nodo anterior = buscar(posicion-1);
			if(anterior != null){
				Nodo nuevo = new Nodo (elemento);
				nuevo.siguiente = anterior.siguiente;
				nuevo.anterior = anterior;
				nuevo.siguiente.anterior = nuevo;
				anterior.siguiente = nuevo;
				insertado =true;
				if(anterior == punteroUltimo){
					punteroUltimo = nuevo;
				}
			}
		}
		return insertado;
	}

	public boolean borrar(int posicion){
		// Casos para borrar un nodo
		// Si es el primer elemento
		// Si es un nodo intermedio
		// Si es el último nodo dentro de la lista
		boolean borrado = true;
		Nodo borrar = buscar(posicion);
		if(punteroPrimero != null && borrar != null){
			if(punteroPrimero == borrar){
				// Borrar el primero
				punteroPrimero = punteroPrimero.siguiente;
			}
			if(borrar.siguiente != null){
				borrar.siguiente.anterior = borrar.anterior;
			}
			if(borrar.anterior != null){
				borrar.anterior.siguiente = borrar.siguiente;
			}
			if(punteroUltimo == borrar){
				punteroUltimo = punteroUltimo.anterior;
			}
			borrar.siguiente = null;
			borrar.anterior = null;
		}
		return borrado;
	}




	public String toString(){
		return "";
	}











}