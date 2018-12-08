/*
 * utilidadesF
 * 
 */

import java.util.*;
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
		 System.out.println("5. Dias Pasados");
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
	 * Salida: 1 boolean //resultado
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
	   * Nec: 2 Fechas (anio/mes/dia) //Por valor
	   * Dev: 1 numero //Asociado al nombre 0 igualdad, 1 Posterior, 2 Anterior
	   * Nec/Dev: No hay
	   * Requisitos: El anio seria mayor que 1582, el mes entre 1 y 12 y el dia del 1 al 31 (depende de los meses)
	   * 
	   * Interfaz
	   * Nombre: compararFechas
	   * Comentario: Se comparan dos fechas y se dice cual es anterior, cual posterior y cual iguales
	   * Cabecera: int sumarFechas (int anio1, int mes1, int dia1, int anio2, int mes2, int dia2)
	   * Precondiciones: El anio seria mayor que 1582, el mes entre 1 y 12 y el dia del 1 al 31 (depende de los meses)
	   * Entradas: 6 int (anio1/mes1/dia1) (anio2/mes2/dia2)
	   * Salidas: 1 int //resultado
	   * E/S: No hay
	   * Postcondiciones: Asociado al nombre, Se devolvera un resultado que valdra 0 igualdad, 1 Posterior, 2 Anterior
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
	   * Precondiciones: El mes tiene que estar comprendido entre 1 y 12, el dia entre 1 y 31 (dependiendo del mes) y anio mayor que 1582
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
		
		/*
		 * Nec: 2 Fechas //Por valor
		 * Dev: 1 Numero //Dias que han pasado de una fecha a otra //Asociado al nombre
		 * Nec/Dev:
		 * Requisitos: El anio seria mayor que 1582, el mes entre 1 y 12 y el dia del 1 al 31 (depende de los meses)
		 * 
		 * Interfaz
		 * Nombre: diasPasados
		 * Comentario: Este subprograma se encarga de contar los dias pasados de una fecha a otra
		 * Cabecera: int diaPasados 
		 * Precondiciones: El anio seria mayor que 1582, el mes entre 1 y 12 y el dia del 1 al 31 (depende de los meses)
		 * Entrada: 6 int (int anio1, int mes1, int dia1, int anio2, int mes2, int dia2)
		 * Salida: 1 int (Numero de dias pasados de una fecha a otra)
		 * E/S: No hay
		 * Postcondiciones: Asociado al nombre. El resultado es el numero de dias que pasan de una fecha a otra
		*/
		 
		 public static int diasPasados (int anio1, int mes1, int dia1, int anio2, int mes2, int dia2) {
			 int res;
			 int fecha1;
			 int fecha2;
			 int diasFecha1 = 0;
			 int diasFecha2 = 0;
			 int aux = 0;
			 
			 /*
			 if (anio1 < anio2) {
				 while (anio1  <= anio2) {
					anio1++;
					 if(AnioBisiesto(anio1) == true) {
						 bisiesto++;
					 }
				 }
			 }
			 else {
				  while (anio1  >= anio2) {
					anio2++;
					 if(AnioBisiesto(anio1) == true) {
						 bisiesto++;
					 }
				 }
			 }
			 */
			
			 //Fecha1 en dias
			 for (int contador = 1; contador < mes1; contador++) {
				diasFecha1 = diasFecha1 + maximoMes(contador, anio1);
			 }
			 
			
			 fecha1 = ((anio1 - 1) * 365) + diasFecha1 + dia1 + sumarBisiestos(anio1);
			 
			 for (int contador = 1; contador < mes2; contador++) {
				diasFecha2 = diasFecha2 + maximoMes(contador, anio2);
			 }
			 
			  
			 
			 fecha2 = ((anio2 - 1) * 365) + diasFecha2 + dia2 + sumarBisiestos(anio2);
			 
			 res = Math.abs(fecha1 - fecha2) ;
			 
			 return res;
			 
		 }
		 
		 /* Nec: 1 entero //Por valor Anio
		  * Dev: 1 entero //Asociado al nombre //La suma de los años bisiestos
		  * Nec/Dev: No hay
		  * Requisitos: El año tiene que ser mayor que 1582
		  * 
		  * Interfaz
		  * Nombre: sumarBisiestos
		  * Comentario: Este subprograma suma todos los años bisiestos desde el calendario gregoriano (1582)
		  * Cabecera: int sumarBisiestos(int anio)
		  * Precondiciones: El anio tiene que ser mayor de 1582
		  * Entradas: 1 int //anio
		  * Salidas: 1 int // la suma de los anios bisiestos 
		  * E/S: No hay
		  * Precondiciones: Asociado al nombre. El resultado de la suma de todos los anios bisiestos desde 1582
		  * 
		 */
		 
		 public static int sumarBisiestos(int anio) {
			 int res = 0;
			 
			 for (int aux = 1582; aux <= anio; aux++) {
				 if(AnioBisiesto(aux) == true) {
					 res++;
				 }
			 }
			 return res;
		 }
		 
		 /*
		  * Nec: 2 Fechas, 6 enteros
		  * Dev: 1 fecha, 3 enteros
		  * Nec/Dev: No hay
		  * Requisitos: anio, mes, dia mayores que 0
		  * 
		  * Interfaz
		  * Nombre: sumarAFecha
		  * Comentario: Este subprograma suma a una fecha los dias, meses y anios 
		  * Cabecera: public void sumarAFecha(int anio1, int mes1, int dia1, int anio2, int mes2, int dia2)
		  * Precondiciones: anio, mes, dia mayores que 0
		  * Entrada: 6 int
		  * 		 - anio1
		  * 		 - mes1
		  * 		 - dia1
		  * 		 - anio2
		  * 		 - mes2
		  * 		 - dia2
		  * 
		  * Salida: 3 int
		  * 		- anio
		  * 		- mes
		  * 		- dia 
		  * 
		  * E/S: No hay
		  * Postcondiciones: Por referencia, porque no puedo devolver los 3 asociados al nombre los devuelvo pintando, el resultado de sumar a la fecha 1 la fecha 2
		 */
		 
		 public static void sumarAFecha(int anio1, int mes1, int dia1, int anio2, int mes2, int dia2) {
			 int anio = anio1 + anio2;
			 int mes = mes1 + mes2;
			 int dia = dia1 + dia2;
			 
			 
			 do {
				 if(mes > 12) {
					 mes = mes - 12;
					 anio++;
				 }
				 
			   switch (mes) {
			   case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					if(dia > 31) {
						dia = dia - 31;
						mes++;
					}
			   break;
			   
			   case 4: case 6: case 9: case 11:
					if(dia > 30) {
						dia = dia - 30;
						mes++;
					}
			   break;
			   
			   case 2:
				if(AnioBisiesto(anio) == true) {
					if(dia > 29) {
						dia = dia - 29;
						mes++;
					}
				}
				else {
					if(dia > 28) {
						dia = dia - 28;
						mes++;
					}
				}
			}
			}
			while(validarFecha(anio,mes,dia) == false);
			
			System.out.println("La nueva fecha seria " + dia + "/" + mes + "/" + anio);
		 }
		 
		 
		 /*
		  * Nec: 2 Fechas, 6 enteros
		  * Dev: 1 fecha, 3 enteros
		  * Nec/Dev: No hay
		  * Requisitos: anio, mes, dia mayores que 0
		  * 
		  * Interfaz
		  * Nombre: restarAFecha
		  * Comentario: Este subprograma resta a una fecha los dias, meses y anios 
		  * Cabecera: public void restarAFecha(int anio1, int mes1, int dia1, int anio2, int mes2, int dia2)
		  * Precondiciones: anio, mes, dia mayores que 0
		  * Entrada: 6 int
		  * 		 - anio1
		  * 		 - mes1
		  * 		 - dia1
		  * 		 - anio2
		  * 		 - mes2
		  * 		 - dia2
		  * 
		  * Salida: 3 int
		  * 		- anio
		  * 		- mes
		  * 		- dia 
		  * 
		  * E/S: No hay
		  * Postcondiciones: Por referencia, porque no puedo devolver los 3 asociados al nombre los devuelvo pintando, el resultado de restar a la fecha 1 la fecha 2
		 */
		 
		 public static void restarAFecha(int anio1, int mes1, int dia1, int anio2, int mes2, int dia2) {
			 int anio = anio1 - anio2;
			 int mes = mes1 - mes2;
			 int dia = dia1 - dia2;
			 
			 
			 do {
				 if(mes <= 0) {
					 mes = mes + 12;
					 anio--;
				 }
				 
			   switch (mes) {
			   case 5: case 7:  case 10: case 12:
					if(dia <= 0) {
						dia = dia + 30;
						mes--;
					}
			   break;
			   
			    case 1: case 2: case 4: case 6: case 8: case 9: case 11:
					if(dia <= 0) {
						dia = dia + 31;
						mes--;
					}
			   break;
			   
			   case 3:
				if(AnioBisiesto(anio) == true) {
					if(dia <= 0) {
						dia = dia + 29;
						mes--;
					}
				}
				else {
					if(dia <= 0) {
						dia = dia + 28;
						mes--;
					}
				}
			}
			}
			while(validarFecha(anio,mes,dia) == false);
			
			System.out.println("La nueva fecha seria " + dia + "/" + mes + "/" + anio);
		 }
		 
}



