public class PruebaCalculadora{
	public static void main (String [] args){
		Calculadora c1 = new Calculadora();
		c1.setValorA(200);
		c1.setValorB(300);
		c1.sumar();
		System.out.println(c1.getValorA() +  " + " + c1.getValorB() + " = " + c1.getResultado());


		Calculadora2 c2 = new Calculadora2();
		System.out.println( c2.sumar(1,2,3));
		System.out.println( c2.elevarAlCubo(2));
	}
}