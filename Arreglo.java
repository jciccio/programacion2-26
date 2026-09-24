public class Arreglo{


	public void imprimir(int[] arreglo){
		for(int i = 0; i < arreglo.length ; i++){
			System.out.print (arreglo[i] + " ");
		}
		System.out.println();
	}

	// condicional y un ciclo
	public int[] crearArregloPares(int cantidad){
		int [] arreglo = new int [cantidad];
		for (int i = 0; i < arreglo.length; i++){
			arreglo[i] = (i+1)*2;
		}
		return arreglo;
	}

	public int realizarProductoPunto(int[] a, int [] b){
		int menosElementos = a.length < b.length ? a.length : b.length; 
		int resultado = 0;
		/*int menosElementos = a.length;
		if (a.length > b.length){
			menosElementos = b.length;
		}*/
		for(int i = 0; i < menosElementos; i++){
			resultado += a[i] * b[i];
		}
		return resultado;
	}

	public int[] eliminarDuplicados(int [] arregloEntrada){
		int [] arregloIntermedio = new int [arregloEntrada.length];
		int ultimoUsado = 0;
		for(int i = 0; i < arregloEntrada.length; i++){
			boolean agregado = agregarAArregloIntermedio(arregloEntrada[i], ultimoUsado, arregloIntermedio);
			if(agregado){
				ultimoUsado++;
			}
		}
		int [] arregloFinal = new int [ultimoUsado];
		for(int i = 0 ; i < arregloFinal.length; i++){
			arregloFinal[i] = arregloIntermedio[i];
		}
		return arregloFinal;
	} 
	
	private boolean agregarAArregloIntermedio(int valor, int ultimoUsado, int [] arregloIntermedio){
		boolean esta = false;
		for(int i = 0 ; i < ultimoUsado; i++){
			if(valor == arregloIntermedio[i]){
				esta = true;
			}
		}
		if(!esta){// esta o no está?
			arregloIntermedio[ultimoUsado] = valor;
		}
		return !esta;
	}

	public static void main (String [] args){
		Arreglo arregloInstancia = new Arreglo();
		int [] arregloNumeros = new int [10]; 

		// [0,0,0,0,0,0,0,0,0,0]
		arregloInstancia.imprimir(arregloNumeros);

		arregloNumeros[2] = 345;
		arregloNumeros[7] = 78;
		
		arregloInstancia.imprimir(arregloNumeros);

		int [] arreglo2Numeros = {10,20,30,40,50,60,70,80,90,100};
		arregloInstancia.imprimir(arreglo2Numeros);

		int [] arregloPares = arregloInstancia.crearArregloPares(1000);
		arregloInstancia.imprimir(arregloPares);
	}


}