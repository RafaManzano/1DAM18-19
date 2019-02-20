package test;

import ordenacion.MetodosOrdenacion;

public class testOrdenacion {

	public static void main(String[] args) {
		int[] array = {0,2,9,1,3,8,2,0,4};
		
		MetodosOrdenacion.pintarArray(array);
		System.out.println();
		
		//MetodosOrdenacion.bubbles(array);
		//MetodosOrdenacion.plomada(array);
		//MetodosOrdenacion.seleccionDirecta(array);
		//MetodosOrdenacion.insercionDirectaC(array);
		MetodosOrdenacion.insercionDirecta(array);
		
		MetodosOrdenacion.pintarArray(array);
		//MetodosOrdenacion.bubbles(array);
		
		
	}

}
