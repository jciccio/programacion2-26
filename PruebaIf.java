public class PruebaIf{
	
	public String convertirADia(int diaNumero){
		String dia = "Número inválido";
		if(diaNumero == 1){
			dia = "Lunes";
		}
		else{
			if(diaNumero == 2){
				dia = "Martes";
			}
			else{
				if(diaNumero == 3){
					dia = "Miercoles";
				}
				else{
					if(diaNumero == 4){
						dia = "Jueves";
					}
					else{
						if(diaNumero == 5){
							dia = "Viernes";
						}
						else{
							if(diaNumero == 6){
								dia = "Sabado";
							}
							else{
								if(diaNumero == 7){
									dia = "Domingo";
								}
							}
						}
					}
				}
			}
		}
		return dia;
	}

}