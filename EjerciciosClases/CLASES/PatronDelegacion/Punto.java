/*
 * Clase Punto
 * Propiedades Basicas
 * CoordenadaX
 * Tipo: double
 * Cons: Si
 * Mod: Si
 * 
 * CoordenadaY
 * Tipo: double
 * Cons: Si
 * Mod: Si
 * 
 * Propiedades derivadas
 * No hay
 * 
 * Propiedades compartidas
 * No hay
 * 
 * Get and Set
 * CoordenadaX
 * public double getX()
 * public void setX(double x1) 
 * 
 * CoordenadaY
 * public double getY()
 * public void setY(double y1)
 * 
 * Metodos añadidos:
 * No hay
 * 
 * Requisitos:
 * X mayor que 0
 * Y mayor que 0
 * 
 */


public class Punto implements Cloneable {
	
	//Atributos
	private double x;
	private double y;
	
	//Constructor
	public Punto() { //Por defecto
		x = 0.0;
		y = 0.0;
	}
	
	public Punto(double x, double y) { //Con parametros
		this.x = x;
		this.y = y;
	}
	
	public Punto(Punto copia) { //De copia
		this.x = copia.getX();
		this.y = copia.getY();
	}
	
	//Get and Set
	//CoordenadaX
	public double getX() {
		return x;
	}
	
	public void setX(double x)  {
		this.x = x;
	}
  
	//CoordenadaY
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	//Metodos de la clase object
	//toString 
	@Override
	public String toString() {
		return x + " , " + y;
	}
	
	//hashCode
	@Override
	public int hashCode() {
		return 9820407 * (int)x - (int)y + (int)x * 1420;
	}
	
	//Equals
	@Override
	public boolean equals (Object obj) {
		boolean res = false;
		
		if (this == obj) {
			res = true;
		}
		else if(obj != null && obj instanceof Punto){
			Punto otra = (Punto) obj;
			
			if(this.getX() == otra.getX() &&
			   this.getY() == otra.getY()) {
				   res = true;
			 }
		}
		return res;
	}
	
	//Clone Superficial
	public Punto clone() {
		Punto copia = null;
		
		try {
			copia = (Punto) super.clone();
		}
		catch(CloneNotSupportedException error) {
			System.out.println("No se puede clonar");
		}
		return copia;
	}
}

