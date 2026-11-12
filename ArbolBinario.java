public class ArbolBinario {
	private Nodo raiz;

	 private class Nodo {
	 	private int elemento;
	 	private Nodo hijoIzq;
	 	private Nodo hijoDer;

	 	public Nodo (int elemento){
	 		this.elemento = elemento;
	 		//hijoIzq = hijoDer = null;
	 		hijoIzq = null;
	 		hijoDer = null;
	 	}

	 	public String toString(){
	 		return "Elemento:  " + elemento ;
	 	}

	 }

	 public Nodo insertar(int elemento){
	 	return insertar(raiz, elemento);
	 }

	 private Nodo insertar (Nodo nodo, int elemento){
	 	Nodo nuevo = nodo;
	 	if(nodo == null){
	 		// Caso trivial,  podemos crear un nodo nuevo
	 		nuevo = new Nodo(elemento);
	 		if(raiz == null){
	 			raiz = nuevo;
	 		}
	 	}
	 	else{
	 		// Este es nuestro caso recursivo
	 		// Quermos movernos por el árbol hasta llegar a la hoja/ nodo terminal)
	 		if(nodo.elemento  > elemento){
	 			// Nos tenemos que mover hacia la izquierda
	 			nodo.hijoIzq = insertar(nodo.hijoIzq,elemento);
	 		}
	 		else if(nodo.elemento  < elemento){
	 			// Nos tenemos que mover hacia la derecha
	 			nodo.hijoDer = insertar(nodo.hijoDer, elemento);
	 		}
	 	}
	 	return nuevo;
	 }

	 // Existen 3 formas de imprimir un arbol (acceder)
	 // Pre Orden - Imprimir la raíz, imprimir sub árbol izquierdo, sub ábol derecho
	 // Post Orden - Sub árbol izquierdo, sub ábol derecho, raiz
	 // In Orden - Sub árbol izquierdo,  raíz, sub ábol derecho
	 private void imprimir(Nodo nodo){
	 	if(nodo != null){
	 		
	 		imprimir(nodo.hijoIzq);
	 		
	 		imprimir(nodo.hijoDer);

	 		System.out.println(nodo);
	 	}
	 }

	 public void imprimir(){
	 	this.imprimir(raiz);
	 }

	 public boolean buscar(int elemento){
	 	return buscar(raiz,elemento) != null;
	 }
	 
	 private Nodo buscar(Nodo nodo, int elemento){
	 	Nodo buscado = null;
	 	if(nodo != null){
	 		if(nodo.elemento > elemento){
	 			// Nos movemos hacia la izquierda
	 			buscado = buscar(nodo.hijoIzq, elemento);
	 		}
	 		else if (nodo.elemento < elemento){
	 			buscado = buscar(nodo.hijoDer, elemento);
	 		}
	 		else{
	 			buscado = nodo;
	 		}
	 	}
	 	return buscado;
	 }


	 public static void main (String [] args){
	 	ArbolBinario ab = new ArbolBinario();
	 	ab.insertar(20);
	 	ab.insertar(10);
	 	ab.insertar(50);
	 	ab.insertar(40);
	 	ab.insertar(30);
	 	ab.insertar(5);
	 	ab.insertar(8);
	 	ab.insertar(2);
	 	ab.insertar(3);
	 	ab.insertar(6);
	 	ab.imprimir();
	 }















}