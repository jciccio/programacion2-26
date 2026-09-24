public class Ciclos{
	
	public int calcularSumatoriaWhile(int limite){
		int sumatoria = 0;
		int n = 1;
		while(n  <= limite){
			sumatoria += n;
			n++; // Cambio de la condicion	
		}
		return sumatoria;
	}

	public int calcularSumatoriaDoWhile(int limite){
		int n = 1;
		int sumatoria = 0;
		if(limite >= 1){
			do{
				sumatoria += n;
				n++;
			}while(n <= limite);
		}
		return sumatoria;
	}

	public int calcularSumatoriaFor(int limite){
		int sumatoria = 0;
		for(int i = 1; i <= limite ; i++){
			sumatoria+=i;
		}
		return sumatoria;
	}


	public static void main (String [] args){
			
		Ciclos ciclos = new Ciclos();
//		System.out.println("While: " + ciclos.calcularSumatoriaWhile(10));
//		System.out.println("Do-While: " + ciclos.calcularSumatoriaDoWhile(-10));


		for(int i= 0 ; i < 10; i++){
			for(int j = 0 ; j < 5 ; j++){
				System.out.println("i:" + i + " j: "+ j );
			}
		}


	}


}