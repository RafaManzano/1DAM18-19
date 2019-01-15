/*
 * Tipo Circulo
 * 
 * Propiedades Basicas
 * Centro
 * Tipo: Punto
 * Cons: Si
 * Mod: Si
 * 
 * Radio
 * Tipo: Double
 * Cons: Si
 * Mod: Si
 * 
 * Propiedades Derivadas
 * Area
 * Tipo: Double
 * 
 * Propiedades Compartidas
 * PI
 * Tipo: Double
 * 
 * 
 * Longitud
 * Tipo: Double
 * 
 * Get and Set
 * Centro
 * public Punto getCentro();
 * public void setCentro(Punto p);
 * 
 * Radio
 * public double getRadio();
 * public void setRadio(Double r);
 * 
 * Area
 * public double getArea(); 
 * 
 * Longitud
 * public double getLongitud(); 
 * 
 * Metodos añadidos:
 * No hay
 * 
 * Requisitos:
 * Radio mayor que 0
 */

import java.util.*;

public class Circulo {
	//Atributos
	private Punto centro;
	private double radio;
	
	private static final double PI = 3.14;
	
	//Constructor
	public Circulo () { //Por defecto
		centro = new Punto();
		radio = 0.0;
	}
	
	public Circulo (double x, double y, double radio) { //Con parametros
		this.centro = new Punto(x,y);
		this.radio = radio;
	}
	
	public Circulo (Circulo copia) { //De copia
		this.centro = copia.centro;
		this.radio = copia.getRadio();
	}
	
	//Get and Set
	//Patron Delegacion
	//CoordenadaX
	public double getXCentro() {
		return centro.getX();
	}
	
	public void setXCentro(double x)  {
		centro.setX(x);
	}
  
	//CoordenadaY
	public double getYCentro() {
		return centro.getY();
	}
	public void setYCentro(double y) {
		centro.setY(y);
	}
	
	//Radio
	public double getRadio() {
		return radio;
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	//Metodos derivados
	public double area (double radio) {
		double resultado;
		
		resultado = PI * Math.pow(radio, 2);
		
		return resultado;
	}
	
}

