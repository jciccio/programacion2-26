public class PilaBasadaEnLSE{
	private ListaSimplementeEnlazada pila;

	public PilaBasadaEnLSE(){
		pila = new ListaSimplementeEnlazada();
	}

	public void push(int elemento){
		pila.agregarAlInicio(elemento);
	}

	public int pop (){
		int elemento = top();
		pila.borrar(0);
		return elemento;
	}

	public int top(){
		int resultado = 0;
		try{
			resultado = pila.getElemento(0);	
		}
		catch(ListaVaciaException e){
			System.err.println(e);
		}	
		return result
	}

	public boolean empty(){
		return pila.getLength() == 0;
	}

	public static void main (String [] args){
		PilaBasadaEnLSE pila = new PilaBasadaEnLSE();
		pila.push(1);
		pila.push(2);
		pila.push(3);
		System.out.println(pila.top());
		System.out.println(pila.pop());
		System.out.println(pila.pop());
		System.out.println(pila.pop());
		System.out.println(pila.pop());

	}
}