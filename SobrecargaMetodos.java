public class SobrecargaMetodos{


	public SobrecargaMetodos(){
		System.out.println("Se llama al constructor sin parámetros");
	}

	public SobrecargaMetodos(int a){
		System.out.println("Se llama al constructor con el parámetro int " + a);
	}


	public double sumar(double a, double b){
		System.out.println("Estoy en el metodo: sumar(double a, double b)");
		return a+b;
	}

	public int sumar(int a, int b){
		System.out.println("Estoy en el metodo: sumar(int a, int b)");
		return a+b;
	}

	public double sumar(double a, int b){
		System.out.println("Estoy en el metodo: sumar(double a, int b)");
		return a+ (double)(b);
	}

	public double sumar(int a, double b){
		System.out.println("Estoy en el metodo: sumar(int a, double b)");
		return (double)a+ (b);
	}


	public static void main (String [] args){
		SobrecargaMetodos instancia = new SobrecargaMetodos();
		SobrecargaMetodos instancia2 = new SobrecargaMetodos(10);
		instancia.sumar(2,3);
		instancia.sumar(2.5,3.14);
		instancia.sumar(2.5,3);
		instancia.sumar(2,3.14);
	}
}