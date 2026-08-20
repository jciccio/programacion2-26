public class Carta{
	
	private int numero;
	private String palo;


	public void setPalo(String palo){
		this.palo = palo;
	}

	public void setNumero(int numero){
		this.numero = numero;
	}

	// Metodo de tipo get
	public int getNumero(){
		return numero;
	}

	public String getPalo(){
		return palo;
	}

	public String obtenerValoresCarta(){
		String contenidoDeLaCarta =  numero +  " de " + palo;
		return contenidoDeLaCarta;
	}
}