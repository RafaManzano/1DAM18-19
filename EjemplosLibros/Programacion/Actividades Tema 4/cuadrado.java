public class cuadrado extends figura {
	
	private int lado;
	
	public cuadrado (int lado) {
		this.lado = lado;
	}
	
	public int getArea () {
		return lado * lado;
	}
}

