/*
 * Funcionalidades.java
 *
 * 
 * 
 */


public class FuncionalidadesDM {
	
/*
	 * Nec: Dos numeros //Dividendo y divisor, Por valor
	 * Dev: Dos numero //Cociente y resto //Por Referencia
	 * Nec/Dev: No hay
	 * Requisitos: Ambos numeros deben ser mayores que 0
	 * 
	 * Interfaz intermedia
	 * Nombre: Division
	 * Comentario: Division por restas sucesivas
	 * Cabecera: void Division (int numero1, int numero2, ref int cociente, ref int resto)
	 * Precondiciones: Ambos numeros deben ser mayores que 0
	 * Entrada: - int numero1 (Dividendo)
	 * 			- int numero2 (Divisor)
	 * Salida:  - int cociente
	 * 			- int resto
	 * E/S: No hay
	 * Postcondiciones: Por referencia, el resto y el cociente 
	 * 
	 * Interfaz Java
	 * Nombre: Division
	 * Comentario: Division por restas sucesivas
	 * Cabecera: void Division (int numero1, int numero2)
	 * Precondiciones: Ambos numeros deben ser mayores que 0
	 * Entrada: - int numero1 (Dividendo)
	 * 			- int numero2 (Divisor)
	 * Salida: No hay
	 * E/S: No hay
	 * Postcondiciones: Pintamos tanto el cociente como el resto 
	 * 
	*/
	
	public static void Division (int numero1, int numero2) {
		int resultado;
		int resto = numero1;
		
		resultado = numero1 / numero2;
		
		System.out.println("El cociente de la division es " + resultado);
		
		for(int contador = 0; contador < numero2; contador++) {
			resto = resto - resultado;
		}
		System.out.println("El resto de la division es " + resto);
	}
	
	/*
	 * Nec: Dos numeros
	 * Dev: Un numero
	 * Nec/Dev: No hay
	 * Requisitos: No hay
	 * 
	 * Interfaz
	 * Nombre: Multiplicacion
	 * Comentario: Multiplicacion por sumas sucesivas
	 * Cabecera: void Multiplicacion (int numero1, int numero2)
	 * Precondiciones: Ambos numeros deben ser mayores que 0
	 * Entrada: Dos enteros
	 * Salida: Un entero
	 * E/S: No hay
	 * Postcondiciones: El resulado de la multiplicacion. Asociado al nombre
	 * 
	*/
	
	public static int Multiplicacion (int numero1, int numero2) {
		int resultado = 0;
		
		for (int contador = 0; contador < numero1; contador++) {
			resultado = resultado + numero2;
		}
		return resultado;
	}
}

