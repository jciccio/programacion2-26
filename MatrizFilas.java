public class MatrizAsientos{
	
	private  int [][] matriz;

	public MatrizFilas(int filas){
		matriz = new int [filas][];
		Interfaz interfaz = new Interfaz();  
		for(int i= 0 ; i< matriz.length; i++){
			int numero = interfaz.solicitarNumeroEntero("Digite los asientos de la fila " + i);
			matriz[i] = new int [numero];
		}
	}

}