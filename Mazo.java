public class Mazo{

	private Carta [] cartas;


	public Mazo(){
		cartas = new Carta[52];
		int contador = 0;
		for(int j = 1; j <= 4; j++){
			for(int i = 1; i <=13 ; i++){
				Carta cartaInstancia = new Carta(i, obtenerPalo(j));
				cartas[contador] = cartaInstancia;
				contador++;
			}
		}
	}

	public void revolver(){
		for(int i = 0; i< cartas.length; i++){
			int aleatorio = (int)(Math.random()*52);
			Carta temporal = cartas[i];
			cartas[i] = cartas[aleatorio];
			cartas[aleatorio] = temporal;
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

	public void imprimir(){
		for(int i = 0 ; i < cartas.length; ++i){
			System.out.println(cartas[i].obtenerValoresCarta());
		}
	}

	public static void main (String [] args){
		Mazo mazo = new Mazo();
		mazo.imprimir();
		System.out.println((int)(Math.random()*52));
		mazo.revolver();
		mazo.imprimir();
	}
}