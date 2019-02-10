import java.util.*;
public class utilEncuestas {
	
/*
 * Interfaz
 * Nombre: LeerPersona
 * Comentario: Este subprograma crea e inicializa una persona con los datos que introduzca el usuario
 * Cabecera: public PersonaImp leerPersona()
 * Precondiciones: No hay
 * Entrada: No hay
 * Salida: PersonaImp persona
 * E/S: No hay
 * Postcondiciones: Asociado al nombre, la persona creada e inicializada
 */
 public static PersonaImp leerPersona() {
	 Scanner teclado = new Scanner(System.in);
	 String nombre;
	 String apellidos;
	 int dia;
	 int mes;
	 int anio;
	 char genero;
	 int salario;
	 PersonaImp p1;
	 
	 System.out.print("Introduzca el nombre: ");
	 nombre = teclado.next();
	 System.out.print("Introduzca los apellidos: ");
	 apellidos = teclado.next();
	 do {
	 System.out.print("Introduzca el dia");
	 dia = teclado.nextInt();
	 System.out.print(" mes: ");
	 mes = teclado.nextInt();
	 System.out.print(" anio: ");
	 anio = teclado.nextInt();
	 }
	 while(validarFecha(dia,mes,anio) == false);
	 do {
		 System.out.print("Introduzca el genero (H/M): ");
		 genero = Character.toUpperCase(teclado.next().charAt(0));
	 }
	 while(genero != 'H' && genero != 'M');
	 
	 do{
		 System.out.print("Introduzca su salario: ");
		 salario = teclado.nextInt();
	 }
	 while(salario < 1000 || salario > 2001);
	 return p1 = new PersonaImp(nombre, apellidos, dia, mes, anio, genero, salario);
 }
 
 /*
  * Intefaz
  * Nombre: ValidarFecha
  * Comentario: Este subprograma valida una fecha
  * Cabecera: public boolean validarFecha(int dia, int mes, int anio)
  * Precondiciones: No hay
  * Entrada: - int dia
  * 		 - int mes
  * 		 - int anio
  * Salida: - boolean valido
  * E/S: No hay
  * Postcondiciones: Asociado al nombre, sera true cuando la fecha sea valida y false cuando no
  * 
 */
 
 public static boolean validarFecha(int dia, int mes, int anio) {
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
 	 * Interfaz
	 * Nombre: AnioBisiesto
	 * Comentario: Comprueba si un anio es bisiesto o no
	 * Cabecera: boolean AnioBisiesto(int anio)
	 * Precondiciones: Anio >= 1582
	 * Entrada: - int anio
	 * Salida: - boolean res
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
	 * Interfaz
	 * Nombre: LeerEncuesta
	 * Comentario: Este subprograma crea e inicializa la encuesta
	 * Cabecera: public EncuestaImp leerEncuesta(PersonaImp persona)
	 * Precondiciones: No hay
	 * Entrada: - PersonaImp persona
	 * Salida: - EncuestaImp encuesta
	 * E/S:
	 * Postcondiciones:
	*/
}

