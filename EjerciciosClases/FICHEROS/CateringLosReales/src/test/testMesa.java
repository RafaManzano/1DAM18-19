package test;

import clases.MesaImp;

public class testMesa {
    public static void main(String[] args) {
        MesaImp c1 = new MesaImp();
        MesaImp c2 = new MesaImp(8);
        MesaImp c3 = new MesaImp(4);
        MesaImp c4 = new MesaImp(c2);

        //ID
        System.out.println(c1.getID());
        c1.setID(5);
        System.out.println(c1.getID());

        //toString
        System.out.println(c2.toString());
        System.out.println(c3.toString());

        //hashCode
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());

        //equals
        System.out.println(c2.equals(c3));

        //clone
        MesaImp c5 = c3.clone();

        System.out.println(c3.equals(c5));

        //compareTo
        System.out.println(c1.compareTo(c2));
        System.out.println(c3.compareTo(c5));
        System.out.println(c4.compareTo(c2));
    }
}
