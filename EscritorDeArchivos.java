import java.io.*;
public class EscritorDeArchivos{
	
	private BufferedWriter escritor;
	private boolean abierto;

	public EscritorDeArchivos(String ruta){
		abrir(ruta, false);
	}

	public EscritorDeArchivos(String ruta, boolean agregarAlFinal){
		abrir(ruta, agregarAlFinal);
	}

	public void abrir(String ruta, boolean agregarAlFinal){
		// C:/Users/Jose/Desktop/prueba.txt -> Ruta Absoluta
		// prueba.txt
		try{
			escritor = new BufferedWriter(new FileWriter(ruta, agregarAlFinal));
			abierto = true;
		}
		catch(IOException e){
			System.err.println("EscritorDeArchivos - Ocurrió un error al abrir el archivo " + e);
			abierto = false;
		}
	}

	public void cerrar(){
		if(abierto){
			try{
				escritor.close();
			}
			catch(IOException e){
				System.err.println("EscritorDeArchivos - Ocurrió un error al cerrar el archivo " + e);
				
			}
			abierto = false;
		}
	}

	public void escribir(String datos){
		if(abierto){
			try{
				escritor.write(datos);
			}
			catch(IOException e){
				System.err.println("EscritorDeArchivos - Ocurrió un error al escribir el archivo " + e);
			}
		}
	}

	public static void main (String [] args){
		EscritorDeArchivos e1 = new EscritorDeArchivos("PruebaEscritura");
		e1.escribir("Esto es una prueba.\n");
		e1.cerrar();
	}
}