package gestoras;

import java.util.Random;

import clases.FichaImp;

public class gestoraFicha {
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
		for(int i = 0; i < calificaciones.length;i++) {
			System.out.println(calificaciones[i].toString());
		}
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
		boolean validado = false;
		
		if(cal[0] == 1 && cal[1] == 1 && cal[2] == 1) {
			if(cal[3] == 1 && cal[4] == 1 || cal[3] == 1 && cal [5] == 1 || cal[3] == 1 && cal[6] == 1 || cal[4] == 1 && cal[5] == 1 && cal[4] == 1 && cal[6] == 1 || cal[5] == 1 && cal[6] == 1) {
				if(cal[7] == 1 || cal[8] == 1 || cal[9] == 1) {
					validado = false;
				}
			}
		}
		
		return validado;
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
        String nombre = " ";
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            nombre += (char)(random.nextInt(25) + 97);
        }
        
        return nombre;
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
    	Random random = new Random();
    	
    	for(int i = 0; i < calificaciones.length; i++) {
			calificaciones[i] = random.nextInt(2);
    	}
    	
    	return calificaciones;
    }
    
    
}
