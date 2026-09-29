import java.time.Instant;
import java.time.Duration;

public class StringRendimiento{
	public static void main (String [] args){
		
		SystemInfo info = new SystemInfo();
		// Estática
		//String x = new String( "Hola");
		// Dinámica
		StringBuilder x =new StringBuilder("Hola");

		Instant tiempoInicial = Instant.now();
		for(int i = 0; i < 100000000; i++){
			//x += "hola";
			x.append("hola");
		}
		Instant tiempoFinal = Instant.now();
		long tiempoTranscurrido = Duration.between(tiempoInicial,tiempoFinal).toMillis();
		System.out.println("Tiempo " + tiempoTranscurrido/1000.0);
		System.out.println("Tam del String "+ x.length());
		System.out.println(info.MemInfo());
	}
}