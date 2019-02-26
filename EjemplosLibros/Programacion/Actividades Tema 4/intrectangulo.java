public class intrectangulo implements intfigura {
	
	private int ancho;
	private int alto;
	
	public intrectangulo () { //Constructor definido y se usa sin parametros
		ancho = 0;
		alto = 0;
	}
	
	public intrectangulo (int ancho, int alto) { //Constructor definido con dos parametros
		this.ancho = ancho;
		this.alto = alto;
	}
	
	public intrectangulo (intrectangulo copia) { //Constructor definido con un objeto
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
	
	public int area () {
		return ancho * alto;
	}
	

	
	
 
}
