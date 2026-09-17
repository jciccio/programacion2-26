public class PasoCopiaYReferencia{
	
	public void ejemploPasoCopia(int i){
		i = i + 10;
		System.out.println("En el metodo ejemploPasoCopia i vale: " + i);
	}	


	public void ejemploPasoReferenciaArreglo(int [] arreglo){
		arreglo[0] = 42;
	}

	public void ejemploReferenciaObjeto(Carta carta1){
		carta1.setPalo("Palo sobreescrito en método ejemploReferenciaObjeto");
		carta1.setNumero(1337);
	}


	public static void main (String [] args){
		PasoCopiaYReferencia pc = new PasoCopiaYReferencia();

		int i = 15;
		pc.ejemploPasoCopia(i);
		System.out.println("En el main i vale: " + i);

		Arreglo instanciaArreglo = new Arreglo();
		int [] arregloEnElMain = {1,2,3,4};
		instanciaArreglo.imprimir(arregloEnElMain);
		pc.ejemploPasoReferenciaArreglo(arregloEnElMain);
		instanciaArreglo.imprimir(arregloEnElMain);


		Carta c1 = new Carta(10, "Diamantes");
		System.out.println(c1);
		pc.ejemploReferenciaObjeto(c1);
		System.out.println(c1);

	}

}