public class PruebaCarta{
	public static void main (String [] args){
		Carta carta1 = new Carta();
		carta1.setNumero(2);
		carta1.setPalo("Diamantes");
		String contenidoC1 = carta1.obtenerValoresCarta();
		System.out.println(contenidoC1);

		Carta carta2 = new Carta();
		carta2.setNumero(5);
		carta2.setPalo("Espadas");
		int carta2Valor = carta2.getNumero();
		String carta2Palo = carta2.getPalo();
		System.out.println(carta2Valor + " de " + carta2Palo);

	}
}