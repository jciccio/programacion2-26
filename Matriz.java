public class Matriz {
	

	private int [][] matriz;

	public Matriz(int filas, int columnas){
		matriz = new int [filas][columnas];
	}

	public void crearMatrizExtension(){
		int [][] matriz = {
			{1,2,3},
			{4,5,6},
			{7,8,9},
			{10,11,12}
		};
		this.matriz = matriz;
	}

	public void setCelda(int f, int c, int valor){
		this.matriz[f][c] = valor;
	}

	public void crearMatrizDistintasColumnas(int filas){
		int [][] matriz = new int [filas][];
		for(int f = 0; f < filas; f++){
			int [] fila = new int [(int)(Math.random()*10)+1];
			matriz[f] = fila;
		}
		this.matriz = matriz;
	}

	public void sobreescribirFila(int fila, int columnasQueVaATener){
		int [] arreglo = new int[columnasQueVaATener];
		matriz[fila] = arreglo;
	}

	public String toString(){
		String contenido = "";
		for(int fila = 0; fila < matriz.length; fila++){
			for(int columna = 0; matriz[fila] != null && columna < matriz[fila].length; columna++){
				contenido += matriz[fila][columna] + "\t";
			}
			contenido += "\n";
		}
		return contenido;
	}

	public void crearMatrizPares(int filas, int columnas){
		int contador = 2;
		int [][] matriz = new int [filas][columnas];
		for(int fila = 0; fila < matriz.length; fila++){
			for(int columna = 0; matriz[fila] != null && columna < matriz[fila].length; columna++){
				matriz[fila][columna] = contador;
				contador+=2;
			}
		}
		this.matriz = matriz;
	}


	public static void main (String [] args){
		Matriz matrizInstancia = new Matriz(3,5);
		matrizInstancia.setCelda(0,0,12);
		System.out.println(matrizInstancia);

		matrizInstancia.crearMatrizDistintasColumnas(5);
		matrizInstancia.setCelda(3,0,14);
		System.out.println(matrizInstancia);

		matrizInstancia.crearMatrizExtension();
		matrizInstancia.setCelda(3,2,6543);
		System.out.println(matrizInstancia);

		matrizInstancia.sobreescribirFila(1,10);
		System.out.println(matrizInstancia);

		matrizInstancia.crearMatrizPares(200,3);
		System.out.println(matrizInstancia);
		//Matriz matrizInstancia2 = new Matriz(5,3);
		//System.out.println(matrizInstancia2);
	}
}