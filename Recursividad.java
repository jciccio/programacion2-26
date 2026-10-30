public class Recursividad{
	
	private int contador = 0;

	public int getContador(){
		return contador;
	}

	
	public int calcularFibonacci(int n){
		int resultado = 0;
		//System.out.println("calcularFibonacci " + n);
		if(n>=0){
			if (n == 0){
				resultado =0;
			}
			else if(n==1){
				resultado = 1;
			}
			else{
				resultado = calcularFibonacci(n-1) + calcularFibonacci(n-2);
			}
		}
		contador++;
		return resultado;
	}

	public int calcularSumatoria(int n){
		int resultado = 0;
		// Caso base o caso trivial
		if(n==0){
			resultado = 0;
			System.out.println("Estamos en el caso trivial cuando n vale 0");
		}
		else{ // Caso recursivo
			System.out.println("Estamos entrando en el caso recursivo con n="+n);
			resultado = n + calcularSumatoria(n-1);
			System.out.println("Estamos saliendo del en el caso recursivo con n="+n);
		}

		return resultado;
	}

	public int calcularFactorial(int  n){
		int resultado = 0;
		if(n >= 0){
			if(n == 0){
				resultado = 1;
			}
			else{
				resultado = n * calcularFactorial(n-1);
			}
		}
		return resultado;
	}

	private void imprimir(int [] arreglo, int contador){
		if(contador < arreglo.length){
			imprimir(arreglo, contador+1);
			System.out.print(arreglo[contador]+" ");
		}
	}

	public void imprimir(int [] arreglo){
		imprimir(arreglo, 0);
		System.out.println();
	}

	public String invertirHilera(String hilera, int contador){
		String hileraInvertida = "";
		if(contador < hilera.length()){			
			hileraInvertida = invertirHilera(hilera, contador+1);	
			hileraInvertida += hilera.charAt(contador);
		}
		
		return hileraInvertida;
	}

	public int buscarMenor (int [] arreglo){
		int menor = arreglo[0];
		for(int i = 1 ; i < arreglo.length; i++){
			if(menor > arreglo[i]){
				menor = arreglo[i];
			}
		}
		return menor;
	}

	public int buscarMenor(int [] arreglo, int indice){
		int resultado = 0;
		if(indice == arreglo.length-1){
			System.out.println("Caso trivial: " + arreglo[indice]);
			resultado = arreglo[indice];
		}
		else if(indice < arreglo.length-1){
			System.out.println("Indice: " + indice + " contenido: " + arreglo[indice]);
			resultado = buscarMenor(arreglo, indice+1);
			if(resultado > arreglo[indice]){
				resultado = arreglo[indice];
			}
			System.out.println("Resultado Indice: " + indice +" " + resultado);
		}

		return resultado;
	}

	public static void main (String [] args){
		Recursividad rec = new Recursividad();
		//int resultado = rec.calcularSumatoria(5);
		//System.out.println("La sumatoria de 5 es: " + resultado);

		//System.out.println("Fibonacci de 5 es: " + rec.calcularFibonacci(20));
		//System.out.println("La cantidad de llamados es: " + rec.getContador());
	
		int [] arreglo = {1,2,-9,3,4,5,6,7,8,10,-1};
		//rec.imprimir(arreglo);

		//System.out.println(rec.invertirHilera("Hola",0));


		int menor = rec.buscarMenor(arreglo,0);
		String valor = rec.invertirHilera("Hola",0);
		System.out.println(valor);
	}

}