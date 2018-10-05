public class amigo implements java.io.Serializable {
	
	protected String nombre;
	protected long telefono;
	
	public amigo (String n, long t) {
		nombre = n;
		telefono = t;
	}
	
	public void print() {
		System.out.println(nombre + " -> " + telefono);
	}
}

