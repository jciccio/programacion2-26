public class Letras{
	
	public static void main (String [] args){
		char letra = 'A';
		int valorLetra = (int)(letra);
		for(int i = valorLetra ; i <= (int)'Z'; i++){
			System.out.println((char)(valorLetra));
			valorLetra++;
		}
	}
}