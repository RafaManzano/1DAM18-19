public class rectangulo {
	
	private int ancho;
	private int alto;
	
	public rectangulo () { //Constructor definido y se usa sin parametros
		ancho = 0;
		alto = 0;
	}
	
	public rectangulo (int ancho, int alto) { //Constructor definido con dos parametros
		this.ancho = ancho;
		this.alto = alto;
	}
	
	public rectangulo (rectangulo copia) { //Constructor definido con un objeto
		this.ancho = copia.ancho;
		this.alto = copia.alto;
	}
	
	public int getAncho() {
        return ancho;
    }
    
    public int getAlto() {
        return alto;
    }
    
    public void setAncho (int ancho) {
		this.ancho = ancho;
	}
	
	public void setAlto (int alto) {
		this.alto = alto;
	}
	
	public int sumaLados () {
		int resultado;
		resultado = alto + ancho;
		return resultado;
	}
	
	protected void finalize() {
		System.out.println("Adios!");
	}
	
	
 
}

