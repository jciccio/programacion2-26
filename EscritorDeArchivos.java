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
		EscritorDeArchivos e1 = new EscritorDeArchivos("archivoExcel.csv");

		String hilera1 = "Provincia;canton;distrito\n";
		String [] partes = hilera1.split(";");

		e1.escribir(hilera1);
		e1.escribir("San Jose;Montes de Oca;San Rafael\n");
		e1.escribir("San Jose;Curridabat;Curridabat\n");
		e1.cerrar();
	}
}