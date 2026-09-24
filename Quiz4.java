public class Quiz4{
	
	public boolean estaOrdenado(int [] arreglo){
		boolean ordenado = true;
		int indice = 0;
		while(ordenado && indice < arreglo.length - 1){
			if(arreglo[indice] > arreglo[indice + 1]){
				ordenado = false;
			}
			indice++;
		}
		return ordenado;
	}

	public boolean esPrimo(int numero){
		boolean primo = false;
		if(numero < 2){
			primo = true;
			int contador = 2;
			while(primo && contador <= numero/2){
				if(numero % contador == 0){
					primo = false;
				}
				contador++;
			}
		}
		return primo;
	}
}