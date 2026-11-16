public class BusquedaBinaria{
	

	public int busquedaBinaria(int [] arreglo, int valor){
		AlgoritmosOrdenamiento ao = new AlgoritmosOrdenamiento();
		return busquedaBinaria(ao.ordenarSeleccion(arreglo), valor, 0, arreglo.length-1);
	}

	private int busquedaBinaria(int [] arreglo, int valor, int limInf, int limSup){
		int resultado = -1;
		int celda = (limInf + limSup)/2;
		if(limInf <= limSup && celda >= 0 && celda < arreglo.length){
			// Caso trivial
			if(arreglo[celda] == valor){
				resultado = celda; // Encontramos el valor :)
			}
			else if(arreglo[celda] > valor){ // Casos recursivos
				// Eso significa que los valores están a la izquierda
				resultado = busquedaBinaria(arreglo,valor,limInf, celda -1);
			}
			else{
				// Eso significa que los valores están a la derecha
				resultado = busquedaBinaria(arreglo,valor,celda+1 , limSup);
			}
		}
		return resultado;
	}


}