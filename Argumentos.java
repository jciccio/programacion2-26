public class Argumentos{
	
	public static void main (String [] args){
		Calculadora2 calculadora = new Calculadora2();
		Interfaz interfaz = new Interfaz();

		for(int i = 0 ; i < args.length	; i++){
			System.out.println(args[i]);
		}

		if(args != null && args.length >= 2){
			int base = interfaz.convertirStringAInt(args[0]);
			int exponente = interfaz.convertirStringAInt(args[1]);
			int resultado = calculadora.calcularExponente(base, exponente);
			System.out.println(resultado);
		}
	}

}