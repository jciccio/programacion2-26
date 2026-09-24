public class PruebaJugador{
	public static void main (String [] args){
		Jugador j1 = new Jugador();
		Carta[] cartasDelJugador = j1.obtenerCartas();
		String contenidoDeLaCarta = cartasDelJugador[0].toString();
		System.out.println(contenidoDeLaCarta);

		cartasDelJugador[1].setPalo("Otro palo");
		contenidoDeLaCarta = cartasDelJugador[1].toString();
		System.out.println(contenidoDeLaCarta);
	}
}