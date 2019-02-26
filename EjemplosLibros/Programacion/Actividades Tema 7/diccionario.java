import java.util.*;

public class diccionario {
	
	public static void main (String[] args) {
		
		Hashtable dic = new Hashtable();
		dic.put("HOLA","HELLO");
		dic.put("ADIOS","BYE");
		dic.put("MESA","TABLE");
		dic.put("SILLA","CHAIR");
		dic.put("CABEZA","HEAD");
		dic.put("CARA","FACE");
		String saludo = (String) dic.get("HOLA");
		String despedida = (String) dic.get("ADIOS");
		String brazo = (String) dic.get("BRAZO");
		System.out.println("HOLA : " + saludo);
		System.out.println("ADIOS : " + despedida);
		System.out.println("BRAZO : " + brazo);
		System.out.println("dic contiene " + dic.size() + " pares");
		
		if (dic.containsKey("HOLA")) {
			System.out.println("dic contiene HOLA como clave");
		}
		else {
			System.out.println("dic NO contiene HOLA como clave");
		}
		
		if (dic.contains("HELLO")) {
			System.out.println("dic contiene HELLO como valor");
		}
		else {
			System.out.println("dic NO contiene HELLO como valor");
		}
		
		System.out.println("Mostrando todos los datos de la tabla hash...");
		Enumeration k = dic.keys();
		
		while(k.hasMoreElements()) {
			System.out.println(k.nextElement());
		}
		
		System.out.println("Mostrando todos los elementos de la tabla hash...");
		Enumeration e = dic.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		System.out.println("Eliminando el dato " + dic.remove("HOLA"));
		
		
	}
}

