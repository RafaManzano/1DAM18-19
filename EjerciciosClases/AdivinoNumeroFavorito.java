/*
 * Nombre del programa: 
 * Breve comentario: Realizar un programa que lea una fecha de nacimiento de la forma dia, mes y anyo y 
 * 					  de como resultado el numero del Tarot. El programa verificara si la fecha es correcta.
 * 					 El numero del Tarot se haya sumando los numeros de la fecha de nacimiento y reduciendolos a un unico digito
 * 					 Ejemplo: 20/7/1984 = 2011 = 4
 * Analisis: 
 * 	Entrada: - Respuesta
 * 			 - Dia
 * 			 - Mes
 * 			 - Anyo
 *  Salida: - Eco de los datos
 * 			- Numero del tarot
 * 
 * 	Restricciones: - Respuesta tiene que ser s o n
 * 				   - Dia tiene que ser del 1 al 31
 * 				   - Mes tiene que ser del 1 al 12
 * 				   - Anyo tiene que ser del 1582 hacia delante
 * 
 * PG Level 0 
 * Inicio
 * 	LeeryValidarRespuesta
 * 	Mientras la respuesta sea s
 * 		LeeryValidarFechaNacimiento
 * 		CalcularNumeroFavorito
 * 		MostrarResultado
 * 	FinMientras
 * 	LeeryValidarRespuesta
 * Fin
 * 
 * Estudio del bucle
 * Nombre del bucle: BucleRespuestaSoN
 * VCB: Centinela
 * Inicialización VCB: Lectura anticipada, antes de la primera iteración
 * Actualización VCB: Lectura final, físicamente al final del bucle
 * Condición de salida: respuesta == 's' || respuesta == 'n' && respuesta == 'S' || respuesta == 'N' //toUpperCase()
 * 
 * Nombre del bucle: MientrasRespuestaSi
 * VCB: Centinela
 * Inicializacion VCB: Lectura Anticipada, antes de la primera iteracion
 * Actualizacion VCB: Lectura final, fisicamente al final de cada bucle
 * Condicion de salida: respuesta == s
 * 
 * Nombre del bucle:
 * VCB:
 * Inicializacion VCB:
 * Actualizacion VCB:
 * Condicion de salida:
 * 
 * //Fechas posibles 1 3 5 7 8 10 12 = 31
 * 					2 28 - 29
 * 					4 6 9 11 = 30
 */


public class sin título {
	
	public static void main (String[] args) {
		
	}
}

