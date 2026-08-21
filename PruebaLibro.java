public class PruebaLibro{
	public static void main (String [] args){
		Libro libro1 = new Libro("El Alquimista");
		libro1.imprimir();
		Libro libro2 = new Libro("El Principito");
		libro2.abrir();
		libro2.imprimir();
		libro1.setNombre("Caballero Ladron");
		libro1.imprimir();
		String nombreDelLibro2 = libro2.getNombre();
		System.out.println("El nombre del libro 2 es: "+ nombreDelLibro2);
	}
}