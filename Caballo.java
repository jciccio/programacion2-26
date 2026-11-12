public class Caballo{
	private int [][] tablero;

	public Caballo(){
		tablero = new int [8][8];
	}

	public boolean realizarMovimiento(int fila, int columna, int contador){
		boolean solucionado = false;
		// Caso(s) trivial
		if(contador > 63){
			solucionado = true;
			tablero[fila][columna] = contador;
		}
		// Caso(s) recursivo
		else{
			tablero[fila][columna] = contador;
			imprimir();
			int [] vF = {-1,-2,-2,-1, 1, 2, 2, 1};
			int [] vC = { 2, 1,-1,-2,-2,-1, 1, 2};
			int i =  0;
			while(i < 8 && !solucionado){
				// está en los límites
				// si la casilla está vacía
				int nuevaFila = fila + vF[i];
				int nuevaCol = columna + vC[i];
				if(nuevaFila >= 0 && nuevaFila < 8 && 
					nuevaCol >= 0 && nuevaCol < 8){
					if(tablero[nuevaFila][nuevaCol] == 0){
						solucionado = realizarMovimiento(nuevaFila, nuevaCol, contador+1);
					}
				}
				i++;
			}
			if (!solucionado){
				tablero[fila][columna] = 0;
			}
		}
		return solucionado;
	}

	public void imprimir(){
		for (int  f = 0 ; f < tablero.length; f++){
			for (int  c = 0 ; c < tablero[f].length; c++){
				System.out.print(tablero[f][c] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main (String [] args){
		Caballo caballo = new Caballo();
		caballo.realizarMovimiento(0,0,1);
		caballo.imprimir();
	}

}