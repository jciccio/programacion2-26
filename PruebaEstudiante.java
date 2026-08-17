public class PruebaEstudiante{
	public static void  main (String [] args){
		// Los tipos no primitivos se inicializan con new
		Estudiante estudiante1 = new Estudiante();
		estudiante1.bautizar("Jean Karlo");
		estudiante1.saludar();

		Estudiante estudiante2 = new Estudiante();
		estudiante2.bautizar("Paula");
		estudiante2.saludar();

		Estudiante estudiante3 = new Estudiante();
		estudiante3.bautizar("Derek");
		estudiante3.saludar();

		estudiante1.bautizar("Elias");
		estudiante1.saludar();
	}
}