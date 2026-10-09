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

	public static void main (String [] args){
		Recursividad rec = new Recursividad();
		int resultado = rec.calcularSumatoria(5);
		System.out.println("La sumatoria de 5 es: " + resultado);

		System.out.println("Fibonacci de 5 es: " + rec.calcularFibonacci(20));
		System.out.println("La cantidad de llamados es: " + rec.getContador());
	}

}