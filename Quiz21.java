public class Quiz21{
	public int redonear(double numeroReal){
		/*int parteEntera = (int)(numeroReal);
		int parteDecimal = numeroReal - parteEntera;
		int numeroRedoneado =  (parteDecimal >= 0.5) ? parteEntera + 1 : parteEntera;
		return numeroRedondeado;*/
		return (numeroReal - (int)numeroReal) >= 0.5 ? (int)numeroReal+1 : (int)numeroReal;
	}
}