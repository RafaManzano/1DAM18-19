package conductor;

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
        CamareroImp c1 = new CamareroImp(1,"Rafalito", "Manueh", turno.MANHANA, mesas);
        CamareroImp c2 = new CamareroImp(2,"Rafa", "Manh", turno.NOCHE, mesas);
        CamareroImp c3 = new CamareroImp(3,"Nzhdeh","Manueh", turno.NOCHE, mesas);
        CamareroImp c4 = new CamareroImp(4,"asdhkgfasjgfjksgakf","Manueh", turno.NOCHE, mesas);
        CamareroImp c5 = new CamareroImp(5,"Pablito","Manueh", turno.NOCHE, mesas);
        


        //gestion.introducir("prueba.txt", mesa);
        gestion.introducir("prueba2.txt", c1);
        gestion.introducir("prueba2.txt", c2);
        gestion.introducir("prueba2.txt", c3);
        gestion.introducir("prueba2.txt", c4);
        gestion.introducir("prueba2.txt", c5);
        gestion.eliminar("prueba2.txt", 3);
        //g.mostrarCamarerosTurno("prueba2.txt", turno.MANHANA);

        //System.out.println(gestion.stringEnBytes(c2.toString()));

    }

}
