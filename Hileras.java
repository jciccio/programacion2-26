public class Hileras{


	public int indexOfIgnoreCase(String hilera1, String hilera2){
		// Hola  != hola != HOLA
		String hilera1Mayusculas = hilera1.toUpperCase();
		String hilera2Mayusculas = hilera2.toUpperCase(); 
		return hilera1Mayusculas.indexOf(hilera2Mayusculas);
	}
	
	public static void main (String [] args){
		String x = "HolA";
		String y = new String("       Hola          mundo          ");
		System.out.println(x + " " + y);

		System.out.println(x.equals(y));
		System.out.println(x.toUpperCase());
		System.out.println(x.toLowerCase());
		System.out.println(x);
		System.out.println(y);
		System.out.println(y.trim());
		System.out.println("Las luminosas focas");
		System.out.println("Las luminosas focas".indexOf("as"));
		System.out.println("Las luminosas focas".substring("Las luminosas focas".indexOf("as") + 2));

		String busqueda = "LaS luminosas focas".toUpperCase();
		String loQueBuscamos = "as".toUpperCase();
		int contador = 0;
		while(busqueda.indexOf(loQueBuscamos) != -1){
			contador++;
			System.out.println("Antes del substring: " + busqueda);
			busqueda = busqueda.substring(busqueda.indexOf(loQueBuscamos) + loQueBuscamos.length());
			System.out.println("Después del substring: " + busqueda);
		}
		System.out.println("Veces: " + contador);

		StringBuilder stringDinamico = new StringBuilder("Hola");
		stringDinamico.append(" mundo");
		System.out.println("StringBuilder: " + stringDinamico);
		stringDinamico.replace(0,4,"12345677890");
		System.out.println("StringBuilder: " + stringDinamico);

		stringDinamico.delete(0,4);
		System.out.println("StringBuilder: " + stringDinamico);

		stringDinamico.insert(0, "hola");
		System.out.println("StringBuilder: " + stringDinamico);
		System.out.println("String Substring: " + "hola mundo".substring(0,4));


		String hileraDia = "Hola mundo hoy es lunes 28 de setiembre";
		String [] partes = hileraDia.split(" ");
		String hileraSinEspacios = "";
		for(int i = 0 ; i < partes.length; i++){
			hileraSinEspacios += partes[i];
		}
		System.out.println(hileraSinEspacios);
	}


}