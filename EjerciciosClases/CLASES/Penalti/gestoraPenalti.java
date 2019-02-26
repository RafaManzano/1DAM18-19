public class gestoraPenalti {
	
	/*
	 * Interfaz
	 * Nombre: cargarArrayNombres
	 * Comentario: Este subprograma carga el array de nombres
	 * Cabecera: public String[] cargarArrayNombres ()
	 * Precondiciones: No hay
	 * Entrada: no hay
	 * Salida: - String[] array //El array con los nombres cargados
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre, El array con los nombres cargados
	*/
	public String[] cargarArrayNombres () {
		String[] array = new String[20];
		
		array[0] = "Raul Gonzalez";
		array[1] = "Fernando Torres";
		array[2] = "Iker Casillas";
		array[3] = "Carles Puyol";
		array[4] = "Fernando Morientes";
		array[5] = "David Villa";
		array[6] = "Sergio Ramos";
		array[7] = "Jesus Navas";
		array[8] = "Xavi Hernandez";
		array[9] = "Andres Iniesta";
		array[10] = "Cesc Fabregas";
		array[11] = "Vicente Rodríguez";
		array[12] = "Michel Salgado";
		array[13] = "Joan Capdevila";
		array[14] = "Joaquin Sanchez";
		
		return array;
	}
	
	/*
	 * Interfaz
	 * Nombre: comprobarParada
	 * Comentario: Se comprueba si el jugador que chuta marca gol o no
	 * Cabecera: public boolean comprobarParada (JugadorImp J1, JugadorImp rival)
	 * Precondiciones: no hay
	 * Entrada: - JugadorImp J1
	 * 			- JugadorImp rival
	 * Salida: boolean parada
	 * E/S: No hay
	 * Postcondiones: Asociado al nombre, si el portero para el balon se dice true y si no es false
	 * 
	*/
	
	public boolean comprobarParada (JugadorImp J1, JugadorImp rival) {
		boolean parada = false;
		if(J1.getDecision() == rival.getDecision()) {
			parada = true;
		}
		return parada;
	}
}

