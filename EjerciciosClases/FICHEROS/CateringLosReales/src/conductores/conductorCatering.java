package conductores;

import clases.CamareroImp;
import clases.MesaImp;
import gestora.*;



public class conductorCatering {
    public static void main (String[] args) {
        gestionGenerica gestion = new gestionGenerica();
        MesaImp mesa = new MesaImp(8);
        CamareroImp c1 = new CamareroImp("Rafalito", "Manueh");
        CamareroImp c2 = new CamareroImp("Rafa", "Manh");
        CamareroImp c3 = new CamareroImp("Nzhdeh","Manueh");
        gestionCamareros g = new gestionCamareros();


        //gestion.introducir("prueba.txt", mesa);
        //gestion.introducir("prueba2.txt", c1);
        //gestion.introducir("prueba2.txt", c2);
        //gestion.introducir("prueba2.txt", c3);
        g.buscarCamarero("prueba2.txt", c2);

    }

}
