public class EjerciciosMatriz{
	
	public int [][] clonarMatriz(int [][] matriz){
		int [][] copia = new int [matriz.length][matriz[0].length];
		for(int f = 0; f < matriz.length; f++){
			for(int c = 0; c < matriz[f].length; c++){
				copia[f][c] = matriz[f][c];
			}
		}
		return copia;
	}

	public int [][] rotarInverso (int [][] matriz){
		int [][] rotada = new int [matriz[0].length][matriz.length];
		for(int f = 0 ; f < rotada.length; f++){
			for(int c = 0 ; c < rotada[f].length; c++){
				rotada[rotada.length - 1 - f][c] = matriz[c][f];
			}
		}
		return rotada;
	}

	public int[][] eliminarFila(int [][] matriz){
		int [][] matrizNueva = new int [matriz.length-1][matriz[0].length];
		for(int i = 1; i < matriz.length; i++){
			matrizNueva[i-1] = matriz[i];
		}	
		return matrizNueva;
	}

	public String retornarFila(int [] fila){
		String contenido = "";
		for (int i = 0 ; i < fila.length; i++){
			 contenido += (fila[i] + " ");
		}
		return contenido;
	}

	public void imprimirEspiral(int [][] matrizParametro){
		String matrizString = "";
		int [][] matriz = clonarMatriz(matrizParametro);
		while(matriz.length > 0){
			matrizString += retornarFila(matriz[0]);
			matriz = eliminarFila(matriz);
			if(matriz.length > 0)
				matriz = rotarInverso(matriz);
		}
		System.out.println(matrizString);
	}
	
	public void imprimir(int [][] matriz){
		String contenido = "";
		for(int fila = 0; fila < matriz.length; fila++){
			for(int columna = 0; matriz[fila] != null && columna < matriz[fila].length; columna++){
				contenido += matriz[fila][columna] + "\t";
			}
			contenido += "\n";
		}
		System.out.println(contenido);
	}


	public static void main (String [] args){
		int [][] m = {{1,2},{3,4},{5,6}};
		EjerciciosMatriz em = new EjerciciosMatriz();
		em.imprimirEspiral(m);
	}


}