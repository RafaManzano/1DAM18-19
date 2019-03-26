package conductor;

import Defecto.porDefecto;
import clases.FichaImp;
import gestoras.gestoraFicha;
import ordenacion.metodosOrdenacion;

public class conductorOrdenacion {

	public static void main(String[] args) {
		FichaImp[] fichas = new FichaImp[50];
		porDefecto defecto = new porDefecto();
		metodosOrdenacion ordenar = new metodosOrdenacion();
		gestoraFicha gestora = new gestoraFicha();
		fichas = defecto.generarFichas();
		
		System.out.println(gestora.maximoPuntuacion(fichas));
		System.out.println(gestora.minimoPuntuacion(fichas));
	}

}
