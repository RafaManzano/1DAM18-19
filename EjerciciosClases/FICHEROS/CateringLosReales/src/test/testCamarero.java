package test;

import clases.CamareroImp;

public class testCamarero {
    public static void main(String[] args) {
        CamareroImp c1 = new CamareroImp();
        CamareroImp c2 = new CamareroImp("Rafael", "Manzano");
        CamareroImp c3 = new CamareroImp("MariCarmen", "Osuna");
        CamareroImp c4 = new CamareroImp(c2);

        //ID
        System.out.println(c1.getID());
        System.out.println(c2.getID());
        System.out.println(c3.getID());
        System.out.println(c4.getID());

        //Nombre
        System.out.println(c2.getNombre());
        c2.setNombre("JoseRafael");
        System.out.println(c2.getNombre());

        //Apellidos
        System.out.println(c2.getApellidos());
        c2.setApellidos("Osuna");
        System.out.println(c2.getApellidos());

        //toString
        System.out.println(c2.toString());
        System.out.println(c3.toString());

        //hashCode
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());

        //equals
        System.out.println(c2.equals(c3));

        //clone
        CamareroImp c5 = c3.clone();

        System.out.println(c3.equals(c5));

        //compareTo
        System.out.println(c1.compareTo(c2));
        System.out.println(c3.compareTo(c5));
        System.out.println(c4.compareTo(c2));
    }
}
