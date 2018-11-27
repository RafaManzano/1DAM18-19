/*
 * resguardosF
 * 
 */


public class resguardosF {
	
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
		 System.out.println("En resguardo");
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
		 System.out.println("En resguardo");
		 return true;
	 }
	 
	 /*
	  * Nec: anio, mes, dia //Por valor
	  * Dev: 1 boolean //Asociado al nombre
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
		  System.out.println("En resguardo");
		  return true;
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
	  public static int compararFecha(int anio1, int mes1, int dia1, int anio2, int mes2, int dia2) {
		  System.out.println("En resguardo");
		  return 1;
	  }
} 

