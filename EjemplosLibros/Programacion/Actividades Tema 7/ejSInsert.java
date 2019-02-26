public class ejSInsert {
	
	public static void main (String[] args) {
		
		StringBuffer nombre = new StringBuffer("EMMA");
		String apellidos = new String(" MORENO");
		nombre.insert(nombre.length(), apellidos);
		System.out.println(nombre);
	}
}

