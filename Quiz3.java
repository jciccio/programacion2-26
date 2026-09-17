public class Quiz3{
	
	public double buscarMenor(double [] arreglo){
		double menor = arreglo[0]; // primer elemento
		for(int i = 1; i < arreglo.length; i++){
			if(menor > arreglo[i]){
				menor = arreglo[i];
			}
		}
		return menor;
	}

	public static void main (String [] args){
		double [] arreglo = {1,7,0.75, 5,7,9,9,19,10};
		Quiz3 quiz3 = new Quiz3();
		System.out.println("El valor menor: " + quiz3.buscarMenor(arreglo));
	}

}