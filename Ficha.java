public class Ficha{
	private int puntaje;
	private char letra;

	public Ficha(char letra, int puntaje){
		this.letra = letra;
		this.puntaje = puntaje;
	}

	public void setLetra(char letra){
		this.letra = letra;
	}

	public void setNumero(int nuevoNumero){
		puntaje = nuevoNumero;
	}

	public char getLetra(){
		return letra;
	}

	public int getPuntaje(){
		return puntaje;
	}
}