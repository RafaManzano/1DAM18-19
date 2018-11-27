/*
 * utilidadesF
 * 
 */


public class utilidadesF {
	
	/*
	 * Nec: No hay
	 * Dev: No hay
	 * Nec/Dev: No hay
	 * Requisitos: No hay
	 * 
	 * Interfaz
	 * Nombre: PresentarMenu
	 * Comentario: Pinta el menu
	 * Cabecera: void PresentarMenu()
	 * Precondiciones: No hay
	 * Entrada: No hay
	 * Salida: No hay
	 * E/S: No hay
	 * Postcondiciones: Solo pinta el menu
	 */
	 
	 public static void PresentarMenu() {
		 System.out.println("Elija una opcion");
		 System.out.println("1. Sumar fechas");
		 System.out.println("2. Restar fechas");
		 System.out.println("3. Comparar Fechas");
		 System.out.println("4. Dia Semana");
		 System.out.println("0. Salir");
	 }
	 
	 	 /*
	 * Nec: 1 anio //Pasado por valor
	 * Dev: 1 logico //Asociado al nombre
	 * Nec/Dev: No hay
	 * Requisitos: Anio mayor que 1582
	 * 
	 * Interfaz
	 * Nombre: AnioBisiesto
	 * Comentario: Comprueba si un anio es bisiesto o no
	 * Cabecera: boolean AnioBisiesto(int anio)
	 * Precondiciones: Anio >= 1582
	 * Entrada: 1 int (es el anio)
	 * Salida: 1 boolean
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre, si es true el anio es bisiesto y si es false no lo es
	 */
	 
	 public static boolean AnioBisiesto(int anio) {
		 boolean res = false;
		 
		 if(((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))) {
			 res = true;
		 }
		 return res;
	}
	
	 /*
	  * Nec: anio, mes, dia //Por valor
	  * Dev: 1 logico //Asociado al nombre
	  * Nec/Dev: No hay
	  * Requisitos: No hay
	  * 
	  * Interfaz
	  * Nombre: ValidarFecha
	  * Comentario: Valida si una fecha es correcta 
	  * Cabecera: boolean validarFecha(int anio, int mes, int dia)
	  * Precondiciones: No hay
	  * Entrada: 3 int (anio, mes, dia)
	  * Salida: 1 boolean
	  * E/S: No hay
	  * Postcondiciones: Asociado al nombre, si es true la fecha es correcta y si es false no lo es
	  */
	  
	  public static boolean validarFecha(int anio, int mes, int dia) {
		  boolean valido = false;
		  if (anio >= 1582 && mes >= 1 && mes <= 12) {
			  switch (mes) {
				  case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					if(dia >= 1 && dia <= 31) {
						valido = true;
					}
				  break;
				  
				  case 4: case 6: case 9: case 11:
					if(dia >= 1 && dia <= 3) {
						valido = true;
					}
				  break;
				  
				  case 2:
					if (AnioBisiesto(anio) == true) {
						if(dia >= 1 && dia <= 29) {
							valido = true;
						}
					}
					else if(dia >= 1 && dia <= 28) { {
						valido = true;
					}
				  break;
			  }
		  }
		} 
		  return valido;
	  }
	  
	  /*
	   * Nec: 2 Fechas (anio/mes/dia)
	   * Dev: 1 logico
	   * Nec/Dev: No hay
	   * Requisitos: No hay
	   * 
	   * Interfaz
	   * Nombre: compararFechas
	   * Comentario: Se comparan dos fechas y se dice cual es anterior y cual posterior
	   * Cabecera: boolean sumarFechas (int anio1, int mes1, int dia1, int anio2, int mes2, int dia2)
	   * Precondiciones: No hay
	   * Entradas: 6 int
	   * Salidas: 1 boolean
	   * E/S: No hay
	   * Postcondiciones: Asociado al nombre, si es true la primera fecha es anterior y si es false es posterior
	   * 
	  */
	  
	  public boolean compararFecha (int anio1, int mes1, int dia1, int anio2, int mes2, int dia2) {
		  
	  }

}


