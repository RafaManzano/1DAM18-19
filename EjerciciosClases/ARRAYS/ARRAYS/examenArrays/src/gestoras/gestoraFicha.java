package gestoras;

import java.util.Random;

import clases.FichaImp;

public class gestoraFicha {
	/*
	 * Interfaz
	 * Nombre: pintarArray
	 * Comentario: Este subprograma pinta el array de calificaciones
	 * Cabecera: public void pintarArray(FichaImp[] fichas)
	 * Precondiciones: No hay
	 * Entrada: - FichaImp[] fichas //Es el array que contiene todas las fichas validas
	 * Salida: No hay
	 * E/S: No hay
	 * Postcondiciones: Solo pinta el array en pantalla
	 */
	
	public void pintarArray(FichaImp[] fichas) {
		int contObjetos = 0;
        for(int i = 0; i < fichas.length && fichas[i] != null; i++){
            contObjetos++;
        }
        
		for(int i = 0; i < contObjetos;i++) {
			System.out.println(fichas[i].toString());
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
			if((cal[3] == 1 && cal[4] == 1) || (cal[3] == 1 && cal [5] == 1) || (cal[3] == 1 && cal[6] == 1) || (cal[4] == 1 && cal[5] == 1) || (cal[4] == 1 && cal[6] == 1) || (cal[5] == 1 && cal[6] == 1)) {
				if(cal[7] == 1 || cal[8] == 1 || cal[9] == 1) {
					validado = true;
				}
			}
		}
		
		return validado;
	}
	
	public boolean fichaValidaBonita(int[] cal) {
		boolean validado = false;
		
		if((cal[0] + cal[1] + cal[2] == 3) && (cal[3] + cal[4] + cal[5] + cal[6] >= 2) && (cal[7] + cal[8] + cal[9] >= 1)) {
			validado = true;
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
    
    /*
     * Interfaz
     * Nombre: pintarTercero
     * Comentario: Este subprograma pinta la lista de tercero
     * Cabecera: public void pintarTercero(int fichasTotales, FichaImp maximo, FichaImp minimo, int media)
     * Precondiciones: No hay
     * Entrada: - int fichasTotales
     * 			- FichaImp maximo
     * 			- FichaImp minimo
     * 			- int media
     * Salida: No hay
     * E/S: No hay
     * Postcondiciones: Solo pinta en pantalla el siguiente listado
     */
    
    public void pintarTercero(int fichaTotales, FichaImp maximo, FichaImp minimo, double media) {
    	System.out.println("Numero Total de admitidos........." + fichaTotales);
    	System.out.println("Ficha Maxima........." + maximo);
    	System.out.println("Ficha Minimo........." + minimo);
    	System.out.println("Media........." + media);
    }
    
	/*
	 * Interfaz
	 * Nombre: MaximoPuntuacion
	 * Comentario: Este subprograma da la ficha con la maxima puntuacion
	 * Cabecera: public FichaImp maximoPuntuacion(FichaImp[] fichas)
	 * Precondiciones: El array no puede estar vacio
	 * Entrada: - FichaImp[] fichas //Es el array de fichas
	 * Salida: FichaImp maximo //La ficha con la puntuacion mas alta
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre, es la ficha con la puntuacion mas alta
	 */
	
	public FichaImp maximoPuntuacion(FichaImp[] fichas) {
		FichaImp maximo = fichas[0];
		
		for(int i = 1; i < fichas.length && fichas[i] != null; i++) {
			if(fichas[i].nota() > maximo.nota()) {
					maximo = fichas[i];
			}
		}
		return maximo;
	}
	
	/*
	 * Interfaz
	 * Nombre: MinimoPuntuacion
	 * Comentario: Este subprograma da la ficha con la minima puntuacion
	 * Cabecera: public FichaImp minimoPuntuacion(FichaImp[] fichas)
	 * Precondiciones: El array no puede estar vacio
	 * Entrada: - FichaImp[] fichas //Es el array de fichas
	 * Salida: FichaImp maximo //La ficha con la puntuacion mas baja
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre, es la ficha con la puntuacion mas baja
	 */
	
	public FichaImp minimoPuntuacion(FichaImp[] fichas) {
		FichaImp minimo = fichas[0];
		
		
		for(int i = 1; i < fichas.length && fichas[i] != null; i++) {
			if(fichas[i].nota() < minimo.nota()) {
					minimo = fichas[i];
			}
		}
		return minimo;
	}
	
	/*
	 * Interfaz
	 * Nombre: mediaTotal
	 * Comentario: Este subprograma calcula la media de todos los participantes validos
	 * Cabecera: public double mediaTotal(FichaImp[] fichas)
	 * Precondiciones: No hay
	 * Entrada: - FichaImp[] fichas //Son las fichas totales validas para coger su nota
	 * Salida: - double media //Es la media de las fichas validas
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre, es la media de las fichas validas
	 */
	
	public double mediaTotal(FichaImp[] fichas) {
		double media = 0;
		int contObjetos = 0;
		int suma = 0;
		
        for(int i = 0; i < fichas.length && fichas[i] != null; i++){
            contObjetos++;
        }
        
        for(int i = 0; i < contObjetos; i++) {
        	suma += fichas[i].nota();
        }
		
        media = suma / contObjetos;
        
		return media;
		
	}
    
    
}
