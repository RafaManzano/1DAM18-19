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

public class Circulo implements Cloneable, Comparable<Circulo> {
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
	
	public void setRadio(double radio) throws ExcepcionCirculo {
		if (radio > 0) {
			this.radio = radio;
		}
		else {
			throw new ExcepcionCirculo("El radio no puede ser menor que 0");
		}
	}
	
	//Metodos derivados
	public double area (double radio) {
		double resultado;
		
		resultado = PI * Math.pow(radio, 2);
		
		return resultado;
	}
	
	public double longitud (double radio) {
		double resultado;
		
		resultado = 2 * PI * radio;
		
		return resultado;
	}
	
	//Metodos de la clase object
	//toString
	@Override
	public String toString() {
		return getXCentro() + " , " + getYCentro() + " , " + radio;
	}
	
	//hashCode
	@Override
	public int hashCode() {
		return 179208 + (int)radio * (int)radio - 3 * 2013;
	}
	
	//equals
	@Override
	public boolean equals (Object obj) {
		boolean res = false;
		
		if (this == obj) {
			res = true;
		}
		else if(obj != null && obj instanceof Circulo) {
			Circulo otra = (Circulo) obj;
			
			if(this.getXCentro() == otra.getXCentro() &&
			   this.getYCentro() == otra.getYCentro() &&
			   this.getRadio() == otra.getRadio()) {
				   res = true;
			   }
		}
		return res;
	}
	
	//clone
	@Override
	public Circulo clone() {
		Circulo copia = null;
		
		try {
			copia = (Circulo) super.clone();
		}
		catch(CloneNotSupportedException error) {
			System.out.println("Error al clonar");
		}
		
		return copia;
	}
	
	//Clone en profundidad
	public Circulo deepclone() {
		Circulo copia = null;
		try {
			copia = (Circulo) super.clone();
			copia.centro = new Punto(this.centro);
		}
		catch(CloneNotSupportedException error) {
			System.out.println("Error al clonar");
		}
		return copia;
	}
	
	//CompareTo
	// 0 radio son iguales
	// 1 el primer radio es mayor que el segundo
	// -1 el primer radio es menor que el segundo
	
	public int compareTo(Circulo otro) {
		int res = -1;
		
		if (this.getRadio() == otro.getRadio()) {
			res = 0;
		}
		else if(this.getRadio() > otro.getRadio()) {
			res = 1;
		}
		return res;
	}
}

