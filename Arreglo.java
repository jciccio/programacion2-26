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