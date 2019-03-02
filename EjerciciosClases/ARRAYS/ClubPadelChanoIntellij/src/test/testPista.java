package test;

import clases.PistaImp;
import clases.SocioImp;
import excepciones.ExcepcionPista;

public class testPista {
    public static void main(String[] args) {
    SocioImp javi = new SocioImp("Lopez", "Javier", 50, 30, 'm');
    SocioImp otro = new SocioImp("Otro", "Otros", 50, 30, 'm');
    PistaImp p1 = new PistaImp();
    PistaImp p2 = new PistaImp(1, javi, 20, false);
    PistaImp p3 = new PistaImp(2, javi, 21, true);
    PistaImp p4 = new PistaImp(p2);

    //NumeroPista
    System.out.println(p1.getNumeroPista());
    try {
        p1.setNumeroPista(-5);
    }
    catch(ExcepcionPista err) {
        System.out.println("ERROR: " + err);
    }

    try {
        p1.setNumeroPista(8);
    }
    catch(ExcepcionPista err) {
        System.out.println("ERROR: " + err);
    }
    System.out.println(p1.getNumeroPista());

    //Socio
    System.out.println(p2.getSocio());
    p2.setSocio(otro);
    System.out.println(p2.getSocio());

    //Hora
    System.out.println(p2.getHora());
    try {
        p2.setHora(-2);
    }
    catch(ExcepcionPista err) {
        System.out.println("ERROR: " + err);
    }

    try {
        p2.setHora(0);
    }
    catch(ExcepcionPista err) {
        System.out.println("ERROR: " + err);
    }
    System.out.println(p2.getHora());

    //Rechazada
    System.out.println(p3.getRechazada());
    p3.setRechazada(false);
    System.out.println(p3.getRechazada());

    //Metodos de la clase object
    //toString
    System.out.println(p2.toString());
    System.out.println(p1.toString());

    //hashCode
    System.out.println(p2.hashCode());
    System.out.println(p3.hashCode());

    //equals
    System.out.println(p2.equals(p3));

    //clone
    PistaImp p5 = p3.clone();

    System.out.println(p5.equals(p3));

    }
}

