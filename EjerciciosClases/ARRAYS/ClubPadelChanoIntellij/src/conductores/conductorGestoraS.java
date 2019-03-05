package conductores;

import clases.SocioImp;
import gestora.gestoraPadelSocio;

public class conductorGestoraS {
    public static void main(String[] args) {
        gestoraPadelSocio gestoraS = new gestoraPadelSocio();
        SocioImp s1 = new SocioImp("Manzano Medina", "Rafael", 30, 50, 'M');

        System.out.println("Array vacio");
        SocioImp[] socios = gestoraS.generarArraySocios();
        gestoraS.pintarArraySocios(socios);
        System.out.println("Array con socios");
        gestoraS.arrayConSocios(socios);
        gestoraS.pintarArraySocios(socios);
        System.out.println("Introducir Socios");
        gestoraS.introducirSocio(socios, s1);
        gestoraS.pintarArraySocios(socios);
        System.out.println("Borrar Socio");
        gestoraS.borrarSocio(socios, 5);
        gestoraS.pintarArraySocios(socios);
        System.out.println("Esta vacio (Esta vez sera true)");
        gestoraS.pintarArraySocios(socios);
        System.out.println(gestoraS.estaVacio(socios));
        socios = gestoraS.generarArraySocios();
        System.out.println("Esta vacio (Esta vez sera false)");
        gestoraS.pintarArraySocios(socios);
        System.out.println(gestoraS.estaVacio(socios));
    }
}
