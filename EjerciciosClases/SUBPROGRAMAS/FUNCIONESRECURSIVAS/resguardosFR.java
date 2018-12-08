public class resguardosFR {
	
	/*
	 * Estudio
	 * Nec: No hay
	 * Dev: No hay
	 * Dev/Nec: No hay
	 * Requisitos: No hay
	 * 
	 * Interfaz
	 * Nombre: presentarMenu
	 * Comentario: Presenta el menu de opciones
	 * Cabecera: void presentarMenu ()
	 * Precondiciones: No hay
	 * Entrada: No hay
	 * Salida: No hay
	 * E/S: No hay
	 * Postcondiciones: Solo pinta el menu 
	 * 
	*/
	
	public static void presentarMenu() {
		System.out.println("En resguardo");
	}
	
	
	/*
	 * entero función (entero n)
		Inicio
			entero resultado
			SI (n == 0)
				resultado = 0
			ENOTROCASO
				resultado = n + funcion(n-1)
			FINSI
			Devolver (resultado)
		Fin
	 * 
	 * 
	 * Estudio
	 * Nec: un numero entero //Por valor
	 * Dev: un numero entero //Asociado al nombre
	 * Dev/Nec: No hay
	 * Requisitos: El numero debe de ser mayor que 0
	 * 
	 * Interfaz
	 * Nombre: primerEjercicio
	 * Comentario: Es el primer ejercicio del boletin de recursividad
	 * Cabecera: int primerEjercicio (int n)
	 * Precondiciones: n tiene que ser mayor que 0
	 * Entrada: - int n //Un numero
	 * Salida: - int res //Un numero despues de realizar calculos
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre. Es el resultado de realizar los calculos de la funcion recursiva
	*/
	
	public static int primerEjercicio (int n) {
		System.out.println("En resguardo");
		return 1;
	}
	
	/*
	 * entero función (entero x)
		Inicio
			entero resultado
			SI (x < 3)
				resultado = x
			ENOTROCASO
				resultado = función(x-1) * función(x-3)
			FINSI
			Devolver (resultado)
		Fin
	 * 
	 * 
	 * Estudio
	 * Nec: un numero entero //Por valor
	 * Dev: un numero entero //Asociado al nombre
	 * Dev/Nec: No hay
	 * Requisitos: No hay
	 * 
	 * Interfaz
	 * Nombre: segundoEjercicio
	 * Comentario: Es el segundo ejercicio del boletin de recursividad
	 * Cabecera: int segundoEjercicio (int n)
	 * Precondiciones: No hay
	 * Entrada: - int n //Un numero
	 * Salida: - int res //Un numero despues de realizar calculos
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre. Es el resultado de realizar los calculos de la funcion recursiva
	*/
	
	public static int segundoEjercicio (int x) {
		System.out.println("En resguardo");
		return 1;
	}
	
	
/*
   entero función (entero x)
	Inicio
		entero resultado
		SI (x>100)
			resultado = x-10
		ENOTROCASO
			resultado = función (función(x+11))
		FINSI
		Devolver (resultado)
	Fin 
  
	 * Estudio
	 * Nec: un numero entero //Por valor
	 * Dev: un numero entero //Asociado al nombre
	 * Dev/Nec: No hay
	 * Requisitos: No hay
	 * 
	 * Interfaz
	 * Nombre: tercerEjercicio
	 * Comentario: Es el tercero ejercicio del boletin de recursividad
	 * Cabecera: int tercerEjercicio (int n)
	 * Precondiciones: No hay
	 * Entrada: - int n //Un numero
	 * Salida: - int res //Un numero despues de realizar calculos
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre. Es el resultado de realizar los calculos de la funcion recursiva
*/

	public static int tercerEjercicio (int x) {
		System.out.println("En resguardo");
		return 1;
	}
	
	/*
	 * Formula Ackerman
	 * Si m = 0, n +1
	 * Si m > 0 y n = 0, A(m - 1, 1)
	 * Si m > 0 y n > 0, A(m - 1, A(m, n-1))
	 * 
	 * Estudio
	 * Nec: 2 Numeros enteros //Por valor
	 * Dev: 1 numero entero //Asociado al nombre
	 * Nec/Dev: No hay
	 * Requisitos: Los numeros pueden ser 0 o superiores
	 * 
	 * Interfaz
	 * Nombre: Ackerman
	 * Comentario: Se realiza la funcion de Ackerman
	 * Cabecera: int ackerman (int m, int n)
	 * Precondiciones: Los numeros pueden ser 0 o superiores
	 * Entrada: - int m //Primer numero
	 * 			- int n //Segundo numero
	 * 
	 * Salida: - int res //El resultado de la funcion
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre. El resultado de realizar la funcion
	 * 
	 * 
	*/
	
	public static int ackerman (int m, int n) {
		System.out.println("En resguardo");
		return 1;
	}
	
	/*
	 * Estudio
	 * Nec: Un numero //Por valor
	 * Dev: Un numero //Asociado al nombre
	 * Nec/Dev: No hay
	 * Requisitos: El numero tiene que ser mayor o igual que 0
	 * 
	 * Interfaz
	 * Nombre: Fibonacci
	 * Comentario: Este subprograma hara la sucesion de fibonacci
	 * Cabecera: int fibonacci (int numero)0
	 * Precondiciones: El numero tiene que ser mayor o igual que 0
	 * Entrada: - int numero 
	 * Salida: - int res
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre, la suma de los numeros de la serie de fibonacci
	 * 
	*/
	

	public static int fibonacci (int n) {
		System.out.println("En resguardo");
		return 1;
	}
	
	/*
	 * Estudio
	 * Nec: Un numero //Por valor
	 * Dev: No hay
	 * Nec/Dev: No hay
	 * Requisitos: El numero tiene que ser mayor o igual que 0
	 * 
	 * Interfaz
	 * Nombre: pintarFibonacci
	 * Comentario: Este subprograma pinta la serie de fibonacci paso a paso
	 * Cabecera: void ointarFibonacci (int numero)
	 * Precondiciones: El numero tiene que ser mayor o igual que 0
	 * Entrada: - int numero
	 * Salida: No hay
	 * E/S: No hay
	 * Postcondiciones: Solo pinta la serie de fibonacci completa
	 * 
	*/
	
	public static void pintarFibonacci (int numero) {
		System.out.println("En resguatdo");
}
}

