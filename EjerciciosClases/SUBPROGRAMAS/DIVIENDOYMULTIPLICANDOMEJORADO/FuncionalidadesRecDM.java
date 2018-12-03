/*
 * Funcionalidades.java
 *
 * 
 * 
 */


public class FuncionalidadesRecDM {
	
	/*
	 * Nec: Dos numeros //Dividendo y divisor, Por valor
	 * Dev: 1 numero //Cociente, Asociado al nombre
	 * Nec/Dev: No hay
	 * Requisitos: Ambos numeros deben ser mayores que 0
	 * 
	 * Interfaz
	 * Nombre: DivisionRec
	 * Comentario: Division por restas sucesivas
	 * Cabecera: int DivisionRec (int numero1, int numero2)
	 * Precondiciones: Ambos numeros deben ser mayores que 0
	 * Entrada: - int numero1 (Dividendo)
	 * 			- int numero2 (Divisor)
	 * 
	 * Salida: - int res (Cociente)
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre. El cociente de la division 
	 * 
	*/
	
	public static int DivisionRec (int numero1, int numero2) {
		int res;
		
		if(numero2 > numero1){
            res = 0;
        } 
        else {
			res = 1 + DivisionRec(numero1 - numero2, numero2);
        }
        return res;
    }
 
	/*
	 * Nec: Dos numeros //multiplicando y multiplicador, Por valor
	 * Dev: Un numero //Resultado de la multiplicacion, Asociado al nombre
	 * Nec/Dev: No hay
	 * Requisitos: Ambos numeros deben ser mayores que 0
	 * 
	 * Interfaz
	 * Nombre: MultiplicacionRec
	 * Comentario: Multiplicacion por sumas sucesivas
	 * Cabecera: int MultiplicacionRec (int numero1, int numero2)
	 * Precondiciones: Ambos numeros deben ser mayores que 0
	 * Entrada: - int numero1 (multiplicando)
	 * 			- int numero2 (multiplicador)
	 * 
	 * Salida: - int res (Resultado de la multiplicacion)
	 * E/S: No hay
	 * Postcondiciones: El resulado de la multiplicacion. Asociado al nombre
	 * 
	*/
	
	public static int MultiplicacionRec (int numero1, int numero2) {
		int res;
		
		if(numero2 == 0) {
			res = 0;
	    }
        else {
          res = (numero1 + MultiplicacionRec(numero1 , numero2 - 1));   
		}
		
		return res;
	}
}

