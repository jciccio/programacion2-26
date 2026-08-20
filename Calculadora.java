public class Calculadora{
	private int valorA;
	private int valorB;
	private int resultado;


	public void setValorA(int valorA){
		this.valorA = valorA;
	}

	public void setValorB(int valorB){
		this.valorB = valorB;
	}

	public int getResultado(){
		return resultado;
	}

	public int getValorA(){
		return valorA;
	}

	public int getValorB(){
		return valorB;
	}

	public void sumar(){
		resultado = valorA + valorB;
	}

}