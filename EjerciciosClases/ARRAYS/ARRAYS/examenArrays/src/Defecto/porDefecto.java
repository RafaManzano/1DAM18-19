package Defecto;

import clases.FichaImp;

public class porDefecto {

	public FichaImp[] generarFichas () {
		int[] n1 = {0,0,1,1,1,1,0,1,0,1};
		int[] n2 = {1,0,1,0,1,1,0,1,0,1};
		int[] n3 = {0,0,0,0,0,0,0,0,1,1};
		int[] n4 = {1,1,1,1,1,1,1,1,0,1};
		FichaImp[] fichas = new FichaImp[50];
		
		fichas[0] = new FichaImp("Roberta", n1);
		fichas[1] = new FichaImp("Cristobal", n2);
		fichas[2] = new FichaImp("Eustaquia", n3);
		fichas[3] = new FichaImp("Robertina", n4);
		
		return fichas;
		
	}
}
