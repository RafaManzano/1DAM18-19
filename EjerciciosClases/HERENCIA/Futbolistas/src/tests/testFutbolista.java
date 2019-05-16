package tests;

import clases.FutbolistaImp;

public class testFutbolista {
    public static void main(String [] args) {
        FutbolistaImp f1 = new FutbolistaImp();
        FutbolistaImp f2 = new FutbolistaImp("Cristiano", "Ronaldo","Bicho", 7, 34);
        FutbolistaImp f3 = new FutbolistaImp("Jese", "Rodriguez","Bichito", 10, 26);
        FutbolistaImp f4 = new FutbolistaImp(f2);

        //Nombre
        System.out.println(f1.getNombre());
        f1.setNombre("Diego");
        System.out.println(f1.getNombre());

        //Apellidos
        System.out.println(f1.getApellidos());
        f1.setApellidos("Maradona");
        System.out.println(f1.getApellidos());

        //Alias
        System.out.println(f1.getAlias());
        f1.setAlias("D10S");
        System.out.println(f1.getAlias());

        //Dorsal
        System.out.println(f1.getDorsal());
        f1.setDorsal(10);
        System.out.println(f1.getDorsal());

        //Edad
        System.out.println(f1.getEdad());
        f1.setEdad(58);
        System.out.println(f1.getEdad());

        //toString
        System.out.println(f2.toString());
        System.out.println(f3.toString());

        //hashCode
        System.out.println(f3.hashCode());

        //Equals
        System.out.println(f2.equals(f3));

        //Clone
        FutbolistaImp f5 = f1.clone();


        System.out.println(f5.equals(f1));
    }
}
