public class EstructurasDeRepeticion{
	// Un algoritmo que hace la sumatoria desde 1 hasta N y retorna el valor de la sumatoria

	public int sumatoriaWhile(int n){
		int suma = 0;
		int i = 1;
		while(i <= n){
			suma += i;
			i++;
		}
		return suma;
	} 

	public int sumatoriaDoWhile(int n){
		int suma = 0;
		int i = 1;
		do{
			suma += i;
			i++;
		}while(i <= n);
		return suma;
	}

	public int sumatoriaFor(int n){
		int suma = 0;
		for(int i = 0; i <= n ; i++){
			suma += i;
		}
		return suma;
	}


	public static void main (String [] args){
		Interfaz interfaz = new Interfaz();
		int numero = interfaz.solicitarNumeroEntero("Digite el numero para la sumatoria");
		EstructurasDeRepeticion edr = new EstructurasDeRepeticion();
		System.out.println("Sumatoria While: " +  edr.sumatoriaWhile(numero));
		System.out.println("Sumatoria Do-While: " +  edr.sumatoriaDoWhile(numero));
		System.out.println("Sumatoria For: " +  edr.sumatoriaFor(numero));
	}

















}