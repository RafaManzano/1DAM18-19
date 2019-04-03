package conductores;

import clases.CamareroImp;
import clases.MesaImp;
import enumeraciones.EnumTurno;
import gestora.*;



public class conductorCatering {
    public static void main (String[] args) {

        gestionGenerica gestion = new gestionGenerica();
        MesaImp m1 = new MesaImp(8);
        MesaImp m2 = new MesaImp(6);
        MesaImp m3 = new MesaImp(2);
        MesaImp m4 = new MesaImp(5);
        MesaImp[] mesas = {m1, m2, m3, m4};
        EnumTurno turno = EnumTurno.NODEFINIDO;
        CamareroImp c1 = new CamareroImp("Rafalito", "Manueh", turno.MANHANA, mesas);
        CamareroImp c2 = new CamareroImp("Rafa", "Manh", turno.NOCHE, mesas);
        CamareroImp c3 = new CamareroImp("Nzhdeh","Manueh", turno.NOCHE, mesas);
        gestionCamareros g = new gestionCamareros();


        //gestion.introducir("prueba.txt", mesa);
        gestion.introducir("prueba2.txt", c1);
        gestion.introducir("prueba2.txt", c2);
        gestion.introducir("prueba2.txt", c3);
        //g.buscaryEliminarCamarero("prueba2.txt", c2);
        //g.mostrarCamarerosTurno("prueba2.txt", turno.MANHANA);

    }

}
