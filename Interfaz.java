import javax.swing.JOptionPane;

public class Interfaz{

	public int convertirStringAInt(String valor){
		int valorNumerico = 0;
		try{
			valorNumerico = Integer.parseInt(valor);
		}
		catch(NumberFormatException e){
			System.err.println("Ocurrió un error al convertir: " + e);
		}
		return valorNumerico;
	}

	public int solicitarNumeroEntero(String mensaje){
		boolean valido = false;
		int valorNumerico = 0;
		while(!valido){
			String valor = JOptionPane.showInputDialog(mensaje);
			
			try{
				valorNumerico = Integer.parseInt(valor);
				valido = true;
			}
			catch(NumberFormatException e){
				System.err.println("Error, intente de nuevo: " + e);
			}
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