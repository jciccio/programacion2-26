public class Mazo{
	public Mazo(){
		for(int j = 1; j <= 4; j++){
			for(int i = 1; i <=13 ; i++){
				Carta cartaInstancia = new Carta(i, obtenerPalo(j));
				System.out.println(cartaInstancia.obtenerValoresCarta());

			}
		}
	}

	private String obtenerPalo(int numeroPalo){
		String palo ="";
		switch(numeroPalo){
			case 1:
				palo = "Espadas";
			break;
			case 2:
				palo = "Diamantes";
			break;
			case 3:
				palo = "Treboles";
			break;
			case 4:
				palo = "Corazones";
			break;
		}
		return palo;
	}

	public static void main (String [] args){
		Mazo mazo = new Mazo();
	}
}