import java.util.Scanner; 

public class InterfazConsola{
	private Scanner scanner;


	public InterfazConsola(){
		scanner = new Scanner(System.in);
	}

	public int solicitarNumeroEntero(String mensaje){
		System.out.println(mensaje);
		String numeroHilera = scanner.nextLine();
		int numero = 0;
		try{
			numero = Integer.parseInt(numeroHilera);
		}
		catch(NumberFormatException e){
			System.err.println("Ocurrió un error al convertir el numero: "+ e);
		}
		return numero;
	}

}