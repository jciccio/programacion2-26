public class Televisor{
	
	private boolean estado;
	private int volumen;
	private String entradaActual;
	private double canalActual;


	public void encender(){
		estado = true;
	}

	public void apagar(){
		estado = false;
	}

	public void subirVolumen(){
		volumen = volumen + 1;
		// volumen += 1;
	}

	public void bajarVolumen(){
		volumen = volumen - 1;
		// volumen -= 1;
	}

	public void cambiarCanal(double canalNuevo){
		canalActual = canalNuevo;
	}


	public void cambiarEntrada(String entradaActual){
		this.entradaActual = entradaActual;
	}

}