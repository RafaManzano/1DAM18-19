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
		int res = numero1;
		int contador = 0;
		
		while (res >= numero2) {
			contador++;
			res = res - numero2;
		}
		
		System.out.println("El cociente seria " + contador);
		System.out.println("El resto seria " + res);
		
		
		
		
	}
	
	/*
	 * Nec: Dos numeros //multiplicando y multiplicador, Por valor
	 * Dev: Un numero //Resultado de la multiplicacion, Asociado al nombre
	 * Nec/Dev: No hay
	 * Requisitos: Ambos numeros deben ser mayores que 0
	 * 
	 * Interfaz
	 * Nombre: Multiplicacion
	 * Comentario: Multiplicacion por sumas sucesivas
	 * Cabecera: int Multiplicacion (int numero1, int numero2)
	 * Precondiciones: Ambos numeros deben ser mayores que 0
	 * Entrada: - int numero1 (multiplicando)
	 * 			- int numero2 (multiplicador)
	 * 
	 * Salida: - int res (Resultado de la multiplicacion)
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

