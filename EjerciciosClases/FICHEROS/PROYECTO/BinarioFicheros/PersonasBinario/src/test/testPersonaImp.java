package test;

import clases.PersonaImp;

public class testPersonaImp {

	public static void main(String[] args) {
		PersonaImp p1 = new PersonaImp();
		PersonaImp p2 = new PersonaImp("501X", "Rafael", "Manzano");
		PersonaImp p3 = new PersonaImp("009P", "MariCarmen", "Osuna");
		PersonaImp p4 = new PersonaImp(p2);
		
		//DNI
		System.out.println(p1.getDNI());
		System.out.println(p2.getDNI());
		System.out.println(p3.getDNI());
		System.out.println(p4.getDNI());
		
		//Nombre
		System.out.println(p2.getNombre());
		p2.setNombre("Willy");
		System.out.println(p2.getNombre());

		//Apellidos
		System.out.println(p2.getApellidos());
		p2.setApellidos("Wonka");
		System.out.println(p2.getApellidos());
		
		//toString
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		
		//hashCode
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		
		//equals
		System.out.println(p1.equals(p3));
		
		//clone
		PersonaImp p5 = p2.clone();
		
		System.out.println(p5.equals(p2));
	}

}
