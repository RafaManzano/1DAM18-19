public class ejSReplace {
	
	public static void main (String[] args) {
		
		StringBuffer nombre = new StringBuffer("MARI CARMEN");
		nombre = nombre.replace(5, 11, "MANZANO");
		System.out.println(nombre);
	}
}

