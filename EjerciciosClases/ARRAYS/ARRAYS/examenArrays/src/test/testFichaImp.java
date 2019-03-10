package test;

import clases.FichaImp;

public class testFichaImp {

	public static void main(String[] args) {
		int[] preguntas = {0,1,0,0,1,0,0,1,0,1};
		FichaImp f1 = new FichaImp();
		FichaImp f2 = new FichaImp("Rafa", preguntas);
		FichaImp f3 = new FichaImp("Pablo Manueh", preguntas);
		FichaImp f4 = new FichaImp(f2);
		
		//getID
		System.out.println(f1.getIDAspirante());
		System.out.println(f2.getIDAspirante());
		System.out.println(f2.getIDAspirante());
		System.out.println(f4.getIDAspirante());
		
		//getNombreAspirante
		System.out.println(f2.getNombreAspirante());
		System.out.println(f1.getNombreAspirante());
		
		//setNombreAspirante
		System.out.println(f2.getNombreAspirante());
		f2.setNombreAspirante("Yeray");
		System.out.println(f2.getNombreAspirante());
		
		//Calificaciones
		System.out.println(f3.getCalificaciones());
		
		//toString
		System.out.println(f2.toString());
		
		//hashCode
		System.out.println(f2.hashCode());
		System.out.println(f3.hashCode());
		
		//equals
		System.out.println(f2.equals(f1));
		System.out.println(f2.equals(f2));
		
		//clone
		FichaImp f5 = f2.clone();
		System.out.println(f5.equals(f2));
		
		//compareTo
		System.out.println(f5.compareTo(f2));
		System.out.println(f1.compareTo(f2));
		System.out.println(f4.compareTo(f3));
		
		//Nota
		System.out.println(f2.nota());
		System.out.println(f4.nota());
		
	}
}
