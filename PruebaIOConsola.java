public class PruebaIOConsola{
	public static void main (String [] args){
		InterfazConsola interfaz = new InterfazConsola();
		int edad = interfaz.solicitarNumeroEntero("Digite su edad");
		System.out.println("El próximo año tendrá " + (edad + 1));
	}
}