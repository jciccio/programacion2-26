public class Buscaminas{
	private int [][] tableroJuego;


	public Buscaminas(int filas, int columnas, int minas){
		// Como colocamos las minas?
		// Como colocamos los numeros de las minas (adyacentes)
		// Como le mostramos al jugador los datos
		tableroJuego = new int [filas][columnas];
		colocarMinas(minas);
		colocarNumeros();
	}

	private boolean colocarMinas(int minas){
		boolean colocado = false;
		int filas = tableroJuego.length;
		int cols = tableroJuego[0].length;
		
		if(minas < filas * cols){
			// Colocar minas de forma aleatoria
			// Defino que una mina es un -1
			int minasColocadas = 0;
			while (minasColocadas < minas){
				int filaAleatoria = (int)(Math.random()*filas); //[0,1[
				int colAleatoria = (int)(Math.random()*cols); //[0,1[
				if(tableroJuego[filaAleatoria][colAleatoria] != -1){
					tableroJuego[filaAleatoria][colAleatoria] = -1;
					minasColocadas++;
				}
			}
		}
		return colocado;
	}

	// alguien llamo a colocar las minas
	private void colocarNumeros(){
		for(int f = 0 ; f < tableroJuego.length; f++){
			for(int c = 0; c < tableroJuego[f].length; c++){
				if(tableroJuego[f][c] == -1){
					int [] cFilas = {-1,-1,0,1,1, 1, 0,-1};
					int [] cCols  = { 0, 1,1,1,0,-1,-1,-1};
					for(int i = 0 ; i <cFilas.length; i++){
						int nuevaFila =  f + cFilas[i];
						int nuevaColumna = c + cCols[i];
						// Está dentro los límites de la matriz?
						if(nuevaFila >= 0 && nuevaFila < tableroJuego.length && nuevaColumna>= 0 && nuevaColumna < tableroJuego[f].length){
							if(tableroJuego[nuevaFila][nuevaColumna] != -1){
								tableroJuego[nuevaFila][nuevaColumna]++;
							}
						}
					}
				}
			}		
		}	
	}

	public String toString(){
		String contenido = "";
		for(int f = 0 ; f < tableroJuego.length; f++){
			for(int c = 0; c < tableroJuego[f].length; c++){
				contenido += (tableroJuego[f][c] == -1 ? "M" : tableroJuego[f][c])  + "\t";
			}	
			contenido += "\n";
		}
		return contenido;
	}

	public static void main (String [] args){
		Buscaminas buscaminas = new Buscaminas(10,10,2);
		System.out.println(buscaminas);

		System.out.println((int)(Math.random()*10));
	}

}