package resguardos;

import java.util.Random;

import clases.FichaImp;

public class resguardoGestora {

	/*
	 * Interfaz
	 * Nombre: pintarArray
	 * Comentario: Este subprograma pinta el array de calificaciones
	 * Cabecera: public void pintarArray()
	 * Precondiciones: No hay
	 * Entrada: No hay
	 * Salida: No hay
	 * E/S: No hay
	 * Postcondiciones: Solo pinta el array en pantalla
	 */
	
	public void pintarArray(FichaImp[] calificaciones) {
		System.out.println("En resguardo");
	}
	
	/*
	 * Interfaz
	 * Nombre: fichaValida
	 * Comentario: Este subprograma comprueba si la ficha es valida
	 * Cabecera: public boolean fichaValida(FichaImp[] ficha)
	 * Precondiciones: No hay
	 * Entrada: -int[] calificaciones //Las calificaciones de cada ficha
	 * Salida: - boolean validado 
	 * E/S: No hay
	 * Postcondiciones: Asociado el nombre, Devuelve true si las calificaciones son validas y false si no lo son
	 */
	
	public boolean fichaValida(int[] cal) {
		System.out.println("En resguardo");
		
		return false;
	}
	
	/* Interfaz
	 * Nombre: generarNombre
	 * Comentario: Este subprograma genera el nombre de la persona
	 * Cabecera: public String generarNombre() 
	 * Precondiciones: No hay
     * Entrada: No hay
     * Salida: String nombre
     * E/S: No hay
     * Postcondiciones: Asociado al nombre, El nombre generado automaticamente
     * 
     */
    public String generarNombre() {
    	System.out.println("En resguardo");
        return " ";
    }
    
    /*
     * Interfaz
     * Nombre: generarCalificaciones
     * Comentario: Este subprograma genera las notas automaticamente
     * Cabecera: public int[] generarCalificaciones()
     * Precondiciones: No hay
     * Entrada: No hay
     * Salida: -int[] calificaciones
     * E/S: No hay
     * Postcondiciones: Asociado al nombre. El array de enteros con las calificaciones
     */
    
    public int[] generarCalificaciones() {
    	int[] calificaciones = new int[10];
    	
    	System.out.println("En resguardo");
    	
    	return calificaciones;
    }
}
