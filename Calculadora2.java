public class Calculadora2{
	public int sumar(int x, int y, int z){
		return x+y+z;
	}

	public int elevarAlCubo(int base){
		return base * base * base;
	}

	public double calcularSeno(int n, int x){
		double resultado = 0;
		if(n > 0){
			if(n % 2 == 0)
			{
				n++;
			}
			int contador = 1;
			int signo = 1;
			while(contador <= n){
				double numerador = (double)(calcularExponente(x,contador));
				double denominador = (double)(calcularFactorial(contador));
				double fraccion = numerador / denominador * signo;
				resultado += fraccion;
				signo *= -1;
				contador += 2;
			}
		}
		return resultado;
	}

	public long calcularFactorial(int n){
		long resultado = 1;
		for(int c = 1; c <= n; c++){
			resultado *= c;
		}
		return resultado;
	}

	public int calcularExponente(int base, int exponente){
		int resultado = 1;
		int contador = 1;
		while(contador <= exponente){
			resultado *= base;
			contador++;
		}
		return resultado;
	}


	public int contarDigitos(int numero){
		int contador = 0;
		while(numero != 0){
			contador++;
			numero /= 10;
		}
		return contador;
	}

	public boolean esArmstrong(int numero){
		int suma = 0;
		int cantidadDigitos = contarDigitos(numero);
		int numeroOriginal = numero;
		while(numero != 0){
			int ultimoDigito = numero%10;
			int exponente = calcularExponente(ultimoDigito, cantidadDigitos);
			suma += exponente;
			numero /= 10;
		}
		return (suma == numeroOriginal);
	}

	public void imprimirArmstrong(){
		for(int i = 1 ; i <= 100000; i++){
			if(esArmstrong(i)){
				System.out.println( i + " es Armstrong");
			}
		}
	}

	public static void main (String [] args){
		Calculadora2 calcu = new Calculadora2();
		calcu.imprimirArmstrong();
		
	}

















}