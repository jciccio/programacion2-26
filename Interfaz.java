import javax.swing.JOptionPane;

public class Interfaz{

	public int solicitarNumeroEntero(String mensaje){
		String valor = JOptionPane.showInputDialog(mensaje);
		int valorNumerico = 0;
		try{
			valorNumerico = Integer.parseInt(valor);
		}
		catch(NumberFormatException e){
			System.err.println("Ocurrió un error al convertir: " + e);
		}
		return valorNumerico;
	}

	public double solicitarNumeroReal(String mensaje){
		String valor = JOptionPane.showInputDialog(mensaje);
		double valorNumerico = 0.0;
		try{
			valorNumerico = Double.parseDouble(valor);
		}
		catch(NumberFormatException e){
			System.err.println("Ocurrió un error al convertir: " + e);
		}
		return valorNumerico;
	}
}