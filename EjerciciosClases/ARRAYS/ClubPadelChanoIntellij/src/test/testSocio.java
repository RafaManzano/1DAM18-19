package test;

import clases.SocioImp;
import excepciones.ExcepcionSocio;

public class testSocio {
    public static void main (String[] args) {
        SocioImp s1 = new SocioImp();
        SocioImp s2 = new SocioImp("Xavier", "Profesor", 20, 30, 'M');
        SocioImp s3 = new SocioImp("Ciclope", "Un", 50, 19, 'M');
        SocioImp s4 = new SocioImp(s3);

        //numSocio
        System.out.println(s1.getNumSocio());
        System.out.println(s2.getNumSocio());
        System.out.println(s3.getNumSocio());
        System.out.println(s4.getNumSocio());

        //Apellidos
        System.out.println(s3.getApellidos());
        s3.setApellidos("Lobezno");
        System.out.println(s3.getApellidos());

        //Nombre
        System.out.println(s3.getNombre());
        s3.setNombre("Wolwerine");
        System.out.println(s3.getNombre());

        //Cuota
        System.out.println(s2.getCuota());
        try {
            s2.setCuota(-2);
        }
        catch(ExcepcionSocio err) {
            System.out.println("ERROR: " + err);
        }

        try {
            s2.setCuota(9);
        }
        catch(ExcepcionSocio err) {
            System.out.println("ERROR: " + err);
        }
        System.out.println(s2.getCuota());

        //Edad
        System.out.println(s2.getEdad());
        try {
            s2.setEdad(16);
        }
        catch(ExcepcionSocio err) {
            System.out.println("ERROR: " + err);
        }

        try {
            s2.setEdad(60);
        }
        catch(ExcepcionSocio err) {
            System.out.println("ERROR: " + err);
        }
        System.out.println(s2.getEdad());

        //Genero
        System.out.println(s2.getGenero());
        try {
            s2.setGenero('v');
        }
        catch(ExcepcionSocio err) {
            System.out.println("ERROR: " + err);
        }

        try {
            s2.setGenero('m');
        }
        catch(ExcepcionSocio err) {
            System.out.println("ERROR: " + err);
        }
        System.out.println(s2.getGenero());

        //Metodos de la clase object
        //toString
        System.out.println(s2.toString());
        System.out.println(s1.toString());

        //hashCode
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());

        //equals
        System.out.println(s2.equals(s3));

        //clone
        SocioImp s5 = s2.clone();

        System.out.println(s5.equals(s2));

        //compareTo
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s1));
        System.out.println(s5.compareTo(s2));
    }
}
