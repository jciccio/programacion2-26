// Toda la documentación la puede encontrar acá:
// https://www.doxygen.nl/manual/index.html

//! \class Clase Carta de un mazo de naipes
/*!
  Clase encargada de representar una carta de un naipe. 
  Puede almacenar, retornar e imprimir los valores de la carta y un palo que la representa
*/
public class CartaDoxygen
{
	// Atributos
	// Caracteristicas
	private int numero; /*!< Numero que tendrá la carta */
	private String palo;/*!< Palo de la carta */

	/*! \brief Constructor por omision, aquí se explica qué hace cada método
	 */
	public CartaDoxygen(){
		numero = 10;
		palo = "Diamantes";
	}

	/*! \brief Constructor sobrecargado
	 *
	 *Se utiliza para instanciar el objeto y asignarle el número y palo
	    \param numero número entero entre 1 y 13.
      \param palo hilera de caracteres con el nombre del palo.
	 */
	public CartaDoxygen(int numero, String palo){
		this.numero = numero;
		this.palo = palo;
	}

	// Metodos
	// Acciones

	/*! \brief Imprime el contenido de la carta
	 *
	 * Imprime en consola el número en formato numérico y el palo
	 */
	private void imprimir(){
		System.out.println("Soy un " + numero + " de " + palo);
	}

	public String toString(){
		return imprimirSwitch();
	}

	/*! \brief Imprime el contenido de la carta
	 *
	 * Imprime el contenido de la carta en consola haciendo la traducción
	 entre el contenido de la carta y su valor J, Q, K o As y el palo
	 utilizando una estructura de datos switch internamente.
	 */
	public String imprimirSwitch(){
		String datosDeLaCarta = "";
		String numeroCarta = "";

		switch(this.numero){
			case 1:
				numeroCarta = "As";
			break;
			case 11:
				numeroCarta ="J";
			break;
			case 12:
				numeroCarta ="Q";
			break;
			case 13:
				numeroCarta ="K";
			break;
			default:
				numeroCarta += this.numero;
		}

		datosDeLaCarta = numeroCarta + " de " + this.palo;
		return datosDeLaCarta;
	}

	/*! \brief Imprime el contenido de la carta
	 *
	 * Imprime el contenido de la carta en consola haciendo la traducción
	 entre el contenido de la carta y su valor J, Q, K o As y el palo
	 utilizando una estructura de datos if internamente.
	 */
	public void imprimirIf(){
		// Se va a hacer una traduccion del numero de la carta a su valor
		// como Hilera 2..10, 11=>J 12=>Q 13=>K 1=>As
		String datosDeLaCarta = "";
		String numeroCarta = "";

		if(numero == 11){
			// J
			numeroCarta = "J";
		}
		else {
			if(numero == 12){
				// Q
				numeroCarta = "Q";
			}
			else{
				if(numero == 13){
					// K
					numeroCarta = "K";
				}
				else {
					if(numero == 1){
						// As
						numeroCarta = "As";
					}
					else{
						numeroCarta += this.numero;// numeroCarta = numeroCarta + this.numero; 
						// Valor entre 2..10
					}
				}
			}
		}
		datosDeLaCarta = numeroCarta + " de " + this.palo;
		System.out.println(datosDeLaCarta);
	}

	// Metodos de asignación
	/*! \brief Asigna un número a la carta
	 *
	 \param int el número que tendrá la carta entre 1 y 13
	 */
	public void setNumero(int numeroParametro){
		this.numero = numeroParametro;
	}
	/*! \brief Asigna un palo a la carta 
	 *
	 \param String el palo que tendrá la carta
	 */
	public void setPalo(String paloParametro){
		this.palo = paloParametro;
	}

	// Metodos de retorno
	/*! \brief Retorna el valor del palo de la carta
	 *
	 \return String el palo que de la carta
	 */
	public String getPalo(){
		return palo;
	}

	/*! \brief Retorna el valor del número de la carta
	 *
	 \return int el numero que de la carta
	 */
	public int getNumero(){
		return numero;
	}



}