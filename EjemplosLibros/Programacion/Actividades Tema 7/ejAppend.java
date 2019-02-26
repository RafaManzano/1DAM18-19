public class ejAppend {
	
	public static void main (String[] args) {
		
		StringBuffer nombre = new StringBuffer("JUAN CARLOS");
		String apellidos = new String(" MORENO PEREZ");
		nombre.append(apellidos);
		System.out.println(nombre);
		
	}
}

