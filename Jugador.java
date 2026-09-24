public class Jugador{
	
	private Carta [] cartas;

	public Jugador(){
		cartas = new Carta[4];
		cartas[0] = new Carta (3, "Espadas");
		cartas[1] = new Carta (5, "Diamantes");
		cartas[2] = new Carta (7, "Corazones");
		cartas[3] = null;
	}


	public Carta[] obtenerCartas(){
		return cartas;
	}

	public void agregarFicha(Carta carta){
		// ver cual el primer campo vacío
		// Asignamos el valor a una celda vacía
	}

}