public class ejSSubString {
	
	public static void main (String[] args) {
		
		StringBuffer nombre = new StringBuffer("MARI CARMEN OSUNA");
		String apellido = nombre.substring(0,4)+ nombre.substring(11);
		System.out.println(apellido);
	}
}

