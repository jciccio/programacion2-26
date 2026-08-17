public class Primitivos{
	public static void main (String [] args){
		int numero1 = 12;
		int numero2 = 365;
		final int numero7 = 7;
		String hilera1 = "El valor del numero1 es: " + numero1;
		String hilera2 = "El valor del numero2 es: " + numero2;
		System.out.println(hilera1);
		System.out.println(hilera2);
		int multiplicacion = numero1 * numero2; // comentario -> 4380
		System.out.println(multiplicacion);
		int cuadrado = multiplicacion * multiplicacion;
		System.out.println(cuadrado);
		System.out.println(multiplicacion/7.0);
		System.out.println((double)multiplicacion/numero7); // casting a un numero entero

		// Uso de letras
		char letra1 = 'A';
		System.out.println(letra1);

		int valorNumericoLetra = (int)letra1;
		System.out.println(valorNumericoLetra);

		valorNumericoLetra = valorNumericoLetra + 25;
		System.out.println(valorNumericoLetra);
		System.out.println((char)valorNumericoLetra);

		
	}
}