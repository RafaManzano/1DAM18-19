package test;

import clases.TrabajadorImp;

public class testTrabajadorImp {
    public static void main(String[] args) {
        TrabajadorImp t1 = new TrabajadorImp();
        TrabajadorImp t2 = new TrabajadorImp("Rafael", "Manzano", 25, 'M');
        TrabajadorImp t3 = new TrabajadorImp("Rafael", "Manzano", 25, 'F');
        TrabajadorImp t4 = new TrabajadorImp(t3);

        //ID
        System.out.println(t1.getID());
        System.out.println(t2.getID());
        System.out.println(t3.getID());
        System.out.println(t4.getID());

        //Nombre
        System.out.println(t2.getNombre());
        t2.setNombre("MariCarmen");
        System.out.println(t2.getNombre());

        //Apellidos
        System.out.println(t2.getApellidos());
        t2.setApellidos("Osuna");
        System.out.println(t2.getApellidos());

        //Edad
        System.out.println(t2.getEdad());
        t2.setEdad(20);
        System.out.println(t2.getEdad());

        //Sexo
        System.out.println(t3.getSexo());

        //toString
        System.out.println(t2.toString());
        System.out.println(t3.toString());

        //hashCode
        System.out.println(t2.hashCode());
        System.out.println(t3.hashCode());

        //equals
        System.out.println(t2.equals(t3));

        //clone
        TrabajadorImp t5 = t2.clone();

        System.out.println(t5.equals(t2));

        //compareTo
        System.out.println(t1.compareTo(t2));
        System.out.println(t5.compareTo(t2));
        System.out.println(t3.compareTo(t2));
    }
}
