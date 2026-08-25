import javax.swing.JOptionPane;

public class PruebaIOBasico{
	public static void main (String [] args){
		Interfaz interfaz = new Interfaz();
		int numero1 = interfaz.solicitarNumeroEntero("Digite el numero a elevar al cubo");
		
		Calculadora2 calculadora2 = new Calculadora2();
		int resultado = calculadora2.elevarAlCubo(numero1);
		JOptionPane.showMessageDialog(null, numero1 + " al cubo es " + resultado,
		 "Resultado elevar al cubo", JOptionPane.INFORMATION_MESSAGE); 


		int x = interfaz.solicitarNumeroEntero("Digite un numero x");
		int y = interfaz.solicitarNumeroEntero("Digite un numero y");
		int z = interfaz.solicitarNumeroEntero("Digite un numero z");
		int suma = calculadora2.sumar(x,y,z);
		System.out.println ("El resultado de la suma es: "+ suma);

	}
}