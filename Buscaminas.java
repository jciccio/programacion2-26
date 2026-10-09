public class Buscaminas {
	// Hay dos matrices
	// La matriz logica -> tiene los valores del tablero
	// Matriz del usuario -> Mostramos al usuario
	// ?? Cuantas minas hay


	private int [][] tablero;
	// -1 -> Representa una mina
	// 0-8 -> Representan las minas alrededor
	private String [][] tableroUsuario;
	private int minas;

	public Buscaminas(int filas, int columnas, int minas){
		generarMinas(filas, columnas, minas);
		llenarTablero();
	}

	public boolean generarMinas(int filas, int columnas, int minas){
		boolean generadas = false;
		if(filas * columnas > minas){
			generadas = true;
			this.minas = minas;
			this.tablero = new int[filas][columnas];
			this.tableroUsuario = new String[filas][columnas];
			
			for(int f = 0; f < tableroUsuario.length; f++){
				for(int c = 0; c < tableroUsuario[f].length; c++){
					tableroUsuario[f][c] = "_";
				}
			}

			int minasColocadas = 0;
			int filaActual = 0;
			int columnaActual = 0;
			while(minasColocadas < minas){
				tablero[filaActual][columnaActual] = -1;
				minasColocadas++;
				columnaActual++;
				if(columnaActual >= columnas){
					columnaActual = 0;
					filaActual++;
				}
			}

			for(int f = 0; f < tablero.length ; f++){
				for(int c = 0; c < tablero[f].length; c++){
					if(tablero[f][c] == -1){
						int filaAleatoria = (int)(Math.random()*filas);
						int columnaAleatoria = (int)(Math.random()*columnas);
						if(tablero[filaAleatoria][columnaAleatoria] == 0){
							tablero[filaAleatoria][columnaAleatoria] = -1;
							tablero[f][c] = 0;
						}
					}
				}
			}
		}
		return generadas;
	}

	public boolean realizarMovimiento(int f, int c, boolean perdio){
		if(f >= 0 && c >= 0 && 
		   f < tablero.length && 
		   c < tablero[f].length){ // Casos base o triviales
			if(tablero[f][c] == -1){ // Caemos en una mina
				perdio = true;
				tableroUsuario[f][c] = "M";
			}
			else if(tablero[f][c] > 0){  // caso trivial
				tableroUsuario[f][c] = ""+tablero[f][c];
				perdio = false;
			}
			else if(tableroUsuario[f][c] == "_"){
				tableroUsuario[f][c] = "" + tablero[f][c];
				int [] cF = {-1,-1,-1,0,0,1,1,1};
				int [] cC = {-1,0,1,-1,1,-1,0,1};
				int contador = 0;
				while (contador < cF.length){
					int nuevaF = f + cF[contador];
					int nuevaC = c + cC[contador];				
					perdio = realizarMovimiento(nuevaF, nuevaC, perdio);
					contador += 1;
				}
			}
		}
		return perdio;
	}

	public void llenarTablero(){
		int [] cF = {-1,-1,-1,  0,0, 1,1,1};
		int [] cC = {-1, 0, 1, -1,1,-1,0,1};
		for(int f = 0; f < tablero.length; f++){
			for(int c = 0 ; c < tablero[f].length; c++){
				if(tablero[f][c] == -1){ // Hay una mina y queremos sumar a los vecinos
					for(int i = 0 ; i < cF.length; i++){
						int nuevaFila = f + cF[i];
						int nuevaColumna = c + cC[i];
						if(nuevaFila >= 0 && 
						   nuevaFila <tablero.length &&
						   nuevaColumna >= 0 && 
						   nuevaColumna < tablero[nuevaFila].length && 
						   tablero[nuevaFila][nuevaColumna] != -1){
							tablero[nuevaFila][nuevaColumna]++;
						}
					}
				}
			}
		}
	}

	public String toString(){
		String contenido = "";
		contenido += "\nTablero Del Juego\n";
		for(int f = 0; f < tablero.length; f++){
			for(int c = 0 ; c < tablero[f].length; c++){
				contenido += tablero[f][c]+ "\t";
			}
			contenido +=  "\n";
		}

		contenido += "\nTablero Usuario\n";
		for(int f = 0; f < tableroUsuario.length; f++){
			for(int c = 0 ; c < tableroUsuario[f].length; c++){
				contenido += tableroUsuario[f][c]+ "\t";
			}
			contenido +=  "\n";
		}
		return contenido;
	}

	public static void main (String [] args){
		Buscaminas buscaminas = new Buscaminas(10, 10, 10);
		System.out.println(buscaminas);
		buscaminas.realizarMovimiento(0,0,false);
		System.out.println(buscaminas);
	}

}