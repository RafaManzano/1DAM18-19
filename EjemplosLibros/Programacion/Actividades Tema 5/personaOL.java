public class personaOL {
	
	private int sinsegundo = 0;
	private String nombre;
	private String apellido1;
	private String apellido2;
	
	public void setNombre(String nom, String ape1, String ape2) {
		nombre = nom;
		apellido1 = ape1;
		apellido2 = ape2;
	}
	
	public void setNombre(String nom, String ape1) {
		nombre = nom;
		apellido1 = ape1;
		sinsegundo = 1;
	}
}

