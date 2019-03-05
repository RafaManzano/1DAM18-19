package conductores;

import clases.*;
import gestora.gestoraPadelPista;
import interfaces.Pista;

public class conductorGestoraP {
    public static void main (String[] args) {
        gestoraPadelPista gestoraP = new gestoraPadelPista();
        SocioImp s1 = new SocioImp("Manzano Medina", "Rafael", 30, 50, 'M');
        PistaImp pista = new PistaImp(1, s1,20,false);

        System.out.println("Array vacio");
        PistaImp[] pistas = gestoraP.generarArrayPistas();
        gestoraP.pintarArrayPista(pistas);
        System.out.println("Array con pistas");
        gestoraP.arrayConPistas(pistas);
        gestoraP.pintarArrayPista(pistas);
        System.out.println("Introducir Pista");
        gestoraP.introducirPista(pistas, pista);
        gestoraP.pintarArrayPista(pistas);
        System.out.println("Borrar Pista");
        gestoraP.borrarPista(pistas, 5);
        gestoraP.pintarArrayPista(pistas);
        System.out.println("Esta vacio (Esta vez sera true)");
        gestoraP.pintarArrayPista(pistas);
        System.out.println(gestoraP.estaVacio(pistas));
        pistas = gestoraP.generarArrayPistas();
        System.out.println("Esta vacio (Esta vez sera false)");
        gestoraP.pintarArrayPista(pistas);
        System.out.println(gestoraP.estaVacio(pistas));
    }
}
