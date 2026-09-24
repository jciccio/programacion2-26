public class AlgoritmosOrdenamiento{
	
	public int [] clonar(int [] arreglo){ // 1,2,3,4
		int [] copia = new int [arreglo.length]; //0,0,0,0
		for(int i = 0 ; i < arreglo.length; i++){
			copia[i] = arreglo[i];
		}
		return copia;
	}


	public int [] ordenarSeleccion(int [] arregloParametro){
		int [] arreglo = clonar(arregloParametro);
		for(int i = 0; i < arreglo.length; i++){ // [1,2,3,4]
			for(int j = i+1; j < arreglo.length; j++){
				if(arreglo[i] > arreglo[j]){
					int temporal = arreglo[i];
					arreglo[i] = arreglo[j];
					arreglo[j] = temporal;
				}
			}
		}
		return arreglo;
	}

	public int[] ordenarBurbuja(int[] arregloParametro){
		int [] arreglo = clonarArreglo(arregloParametro);
		for(int i = 0; i < arreglo.length; i++){
			for(int j = arreglo.length-1; j > i; j--){
				if(arreglo[j-1] > arreglo[j]){
					// Intercambio elementos
					int temporal = arreglo[j];
					arreglo[j] = arreglo[j-1];
					arreglo[j-1] = temporal;
				}
			}
		}
		return arreglo;
	}



	public static void main (String [] args){
		int [] arreglo1 = {5,3,6,7,9,1,0,8,8,8,8};
		AlgoritmosOrdenamiento ao = new AlgoritmosOrdenamiento();
		int []  arregloOrdenado = ao.ordenarSeleccion(arreglo1);
		Arreglo arregloInstancia = new Arreglo();
		arregloInstancia.imprimir(arreglo1);
		arregloInstancia.imprimir(arregloOrdenado);
	}

}