import java.io.*;
public class LectorDeArchivos{
	
	private BufferedReader lector;
	private boolean abierto;

	public LectorDeArchivos(String ruta){
		try{
			lector = new BufferedReader(new FileReader(ruta));
			abierto = true;
		}
		catch(IOException e){
			abierto = false;
			System.err.println("LectorDeArchivos ocurrió un error al abrir " + e);
		}
	}

	public void cerrar(){
		if(abierto){
			try{
				this.lector.close();	
			}
			catch(IOException e){
				System.err.println("LectorDeArchivos ocurrió un error al abrir " + e);
			}
			abierto = false;
		}
	}

	public String leerLinea(){
		String lineaLeida = null;
		if(abierto){
			try{
				lineaLeida = lector.readLine();
			}
			catch(IOException e){
				System.err.println("LectorDeArchivos ocurrió un error al abrir " + e);
			}
		}
		return lineaLeida;
	}

	public String leerArchivo(){
		return null;
	}

	public static void main (String [] args){
		LectorDeArchivos lector = new LectorDeArchivos("Mazo.java");
		String linea = lector.leerLinea();
		System.out.println(linea);
		linea = lector.leerLinea();
		System.out.println(linea);
		linea = lector.leerLinea();
		System.out.println(linea);
		linea = lector.leerLinea();
		System.out.println(linea);
	}
}