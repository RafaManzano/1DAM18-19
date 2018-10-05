public class testInicializador {
	
	static {
		System.out.println("Llamada al inicializador");
	}
	
	static {
		System.out.println("Llamada al segundo inicializador");
	}
	
	public testInicializador() {
		System.out.println("Llamada al constructor");
	}
	
	
}

