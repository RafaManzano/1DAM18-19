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
					if(dia >= 1 && dia <= 30) {
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
	   * Dev: 1 numero
	   * Nec/Dev: No hay
	   * Requisitos: No hay
	   * 
	   * Interfaz
	   * Nombre: compararFechas
	   * Comentario: Se comparan dos fechas y se dice cual es anterior y cual posterior
	   * Cabecera: int sumarFechas (int anio1, int mes1, int dia1, int anio2, int mes2, int dia2)
	   * Precondiciones: No hay
	   * Entradas: 6 int
	   * Salidas: 1 int
	   * E/S: No hay
	   * Postcondiciones: Asociado al nombre, 0 igualdad, 1 Posterior, 2 Anterior
	   * 
	  */
	  
	  public static int compararFecha (int anio1, int mes1, int dia1, int anio2, int mes2, int dia2) {
		  int res = 0;
		  if (anio1 > anio2 || (anio1 == anio2 && mes1 > mes2) || (anio1 == anio2 && mes1 == mes2 && dia1 > dia2)) {
			  res = 1;
		  }
		  else if (anio1 < anio2 || (anio1 == anio2 && mes1 < mes2) || (anio1 == anio2 && mes1 == mes2 && dia1 < dia2)) {
			  res = 2;
			   }
			   
			return res;
	  }
	  
	  /*
	   * Nec: 2 entero //Mes y anio
	   * Dev: 1 entero //Maximo cada mes
	   * Nec/Dev: No hay
	   * Requisitos: El mes tiene que estar entre 1 y 12
	   * 
	   * Interfaz
	   * Nombre: MaximoMes
	   * Comentario: Asigna el maximo de cada mes 
	   * Cabecera: int maximoMes (int mes) 
	   * Precondiciones: EL mes tiene que estar comprendido entre 1 y 12
	   * Entrada: 2 int //mes y anio
	   * Salida: 1 int //Maximo de dias en el mes
	   * E/S: No hay
	   * Postcondiciones: Asociado al nombre. Devuelve el maximo de cada mes
	   *  
	   */
	   
	   public static int maximoMes (int mes, int anio) {
		   int maximo = 0;
		   
		   switch (mes) {
			   case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					maximo = 31;
			   break;
			   
			   case 4: case 6: case 9: case 11:
					maximo = 30;
			   break;
			   
			   case 2:
				if(AnioBisiesto(anio) == true) {
					maximo = 29;
				}
				else {
					maximo = 28;
				}
		   }
		   return maximo;
	   }
	   
	   
	  /*
	   * Nec: 3 entero //dia, mes, anio //Por valor
	   * Dev: 1 entero //numero de la semana en la que se encuentra //Asociado al nombre
	   * Nec/Dev: No hay
	   * Requisitos: El mes tiene que estar entre 1 y 12, dia entre 1 y 31 y anio mayor de 1582
	   * 
	   * Interfaz
	   * Nombre: diaSemana
	   * Comentario: Segun el dia y el mes te dice en que mes de la semana esta, el anio es por si es bisiesto o no 
	   * Cabecera: int diaSemana (int dia, int mes, int anio) 
	   * Precondiciones: EL mes tiene que estar comprendido entre 1 y 12, el dia entre 1 y 31 (dependiendo del mes) y anio mayor que 1582
	   * Entrada: 3 int //dia, mes y anio
	   * Salida: 1 int //Dia de la semana que es
	   * E/S: No hay
	   * Postcondiciones: Asociado al nombre. Devuelve el numero de la semana en la qwue te encuentras
	   *  
	   */

		public static int diaSemana(int dia, int mes, int anio) {
			int diaSemanal = 0;
			
			for (int contador = 1; contador < mes; contador++) {
				diaSemanal = diaSemanal + maximoMes(contador, anio);
			}
			diaSemanal = (diaSemanal + dia) / 7;
			return diaSemanal;
		}
}


