public class PruebaPerro{
	public static void main (String [] args){
		Perro perro1 = new Perro();
		perro1.sentarse();
		perro1.saludar();

		Perro perro2 = new Perro("Kirito");
		perro2.correr();
		perro2.saludar();
	}
}