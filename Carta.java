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
		String contenidoDeLaCarta =  convertirALetrasSwitch() +  " de " + palo;
		return contenidoDeLaCarta;
	}

	public String convertirALetras(){
		// Si el numero está entre 2 y 10 lo mantenemos, 11 - J 12 - Q 13 - K 1 - As
		String numeroString = ""+numero;
		if(numero == 11){
			numeroString = "J";
		}
		else if (numero == 12){
			numeroString = "Q";
		}
		else if (numero == 13){
			numeroString = "K";
		}
		else if (numero == 1){
			numeroString = "As";
		}
		return numeroString;
	}

	public String convertirALetrasSwitch(){
		String numeroString = "";
		if(numero >= 1 && numero <= 13){
			switch(numero){
				case 1:
					numeroString = "As";
				break;
				case 11:
					numeroString = "J";
				break; 
				case 12:
					numeroString = "Q";
				break;
				case 13:
					numeroString = "K";
				break;
				default:
					numeroString = "" + numero;
			}
		}
		return numeroString;
	}


}