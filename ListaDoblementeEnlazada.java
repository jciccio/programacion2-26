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

		}
	}

	public void agregarAlInicio(int elemento){
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

	public void agregarAlFinal(int elemento){

	}

	public String toString(){
		return "";
	}
}