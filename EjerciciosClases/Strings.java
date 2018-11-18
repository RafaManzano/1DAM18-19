/*
 * En este programa usaremos la clase String y StringBuilder
 * 
 */


public class Strings {
	
	public static void main (String[] args) {
		//Declaracion de String
		String cad1 = "Probando String";
		String cad2 = new String("Hola");
		String cad3 = new String(cad1);
		StringBuilder cad4 = new StringBuilder("Prueba");
		StringBuilder cad5 = new StringBuilder("Prueba");
		
		//Metodos de String
		System.out.println(cad1.length());
		System.out.println(cad1.equals(cad3));
		System.out.println(cad2.indexOf('a'));
		System.out.println(cad2.toUpperCase());
		System.out.println(cad3.toLowerCase());
		
		//Metodos de StringBuilder
		System.out.println(cad4.append(" Programacion")); 
		System.out.println(cad5.reverse());
		System.out.println(cad5.toString());
		System.out.println(cad4.insert(6, " apruebame asun"));
		System.out.println(cad4.length());
		
		//
	}
}

