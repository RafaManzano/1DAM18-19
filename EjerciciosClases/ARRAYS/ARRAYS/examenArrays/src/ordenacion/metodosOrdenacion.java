package ordenacion;

import clases.FichaImp;

public class metodosOrdenacion {

	/*
	 * Interfaz
	 * Nombre: ordenarListaPuntuacion
	 * Comentario: Este subprograma ordena por puntuacion de mayor a menor
	 * Cabecera: public void ordenarListaPuntuacion(FichaImp[] fichas)
	 * Precondiciones: No hay
	 * Entrada: - FichaImp[] fichas
	 * Salida: No hay
	 * E/S: No hay
	 * Postcondiciones: El array fichas quedaria ordenado de mayor a menor
	 */
	
	public void ordenarListaPuntuacion(FichaImp[] fichas) {
			FichaImp aux;			
			int contObjetos = 1;
	        for(int i = 0; i < fichas.length && fichas[i] != null; i++){
	            contObjetos = i;
	        }
	        
			for(int i = 0; i <= contObjetos; i++) {
				for(int j = contObjetos - 1; j > i; j--) {
					if(fichas[j].nota() > fichas[j-1].nota()) {
						aux = fichas[j];
						fichas[j] = fichas[j-1];
						fichas[j-1] = aux;
					}
				}
			}
	}
	
	/*
	 * Interfaz
	 * Nombre: ordenarListaNumeroAspirante
	 * Comentario: Este subprograma ordena por numero de aspirante de mayor a menor
	 * Cabecera: public void ordenarListaNumeroAspirante(FichaImp[] fichas)
	 * Precondiciones: No hay
	 * Entrada: - FichaImp[] fichas
	 * Salida: No hay
	 * E/S: No hay
	 * Postcondiciones: El array fichas quedaria ordenado de mayor a menor
	 */
	
	public FichaImp[] ordenarListaNumeroAspirante(FichaImp[] fichas) {
		FichaImp aux;
		int contObjetos = 1;
		
        for(int i = 0; i < fichas.length && fichas[i] != null; i++){
            contObjetos = i;
        }
			for(int i = 0; i <= contObjetos; i++) {
				for(int j = contObjetos - 1; j > i; j--) {
					if(fichas[j].getIDAspirante() > fichas[j-1].getIDAspirante()) {
						aux = fichas[j];
						fichas[j] = fichas[j-1];
						fichas[j-1] = aux;
					}
				}
			}
		return fichas;
	}
	

	
	
}

