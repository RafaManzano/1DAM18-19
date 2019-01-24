package clases;

import interfaces.Carta;
import interfaces.Jugador;

/*
 * Interfaz Jugador
 * Propiedades Basicas 
 * Nombre
 * Tipo: String
 * Cons: Si
 * Mod: Si
 * 
 * NombreFicha
 * Tipo: String
 * Cons: Si
 * Mod: Si
 * 
 * Dinero
 * Tipo:
 * Cons:
 * Mod:
 * 
 * Calles
 * Tipo:
 * Cons:
 * Mod:
 * 
 * Ayudas
 * Tipo:
 * Cons:
 * Mod:
 */

public class JugadorImp implements Jugador {

	//Atributos
	private String nombre;
	private String nombreFicha;
	private int dinero;
	private Carta[] cartas;
	
	//Constructor
	public JugadorImp () { //Por defecto
		nombre = " ";
		nombreFicha = " ";
		dinero = 0;
		cartas = null;
	}
	
	public JugadorImp (String nombre, String nombreFicha, int precio, Carta[] calles) { //Con parametros
		this.nombre = nombre;
		this.nombreFicha = nombreFicha;
		this.dinero = precio;
		this.cartas = calles;
	}
	
	public JugadorImp (JugadorImp cop) { //De copia
		this.nombre = cop.getNombre();
		this.nombreFicha = cop.getNombreFicha();
		this.dinero = cop.getDinero();
		this.cartas = cop.getCartas();
	}
	
	//Get and Set
	//Nombre
	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//NombreFicha
	@Override
	public String getNombreFicha() {
		return nombreFicha;
	}

	@Override
	public void setNombreFicha(String nombreFicha) {
		this.nombreFicha = nombreFicha;
	}

	//Dinero
	@Override
	public int getDinero() {
		return dinero;
	}

	@Override
	public void setDinero(int dinero) {
		this.dinero = dinero;
	}

	//Cartas
	@Override
	public Carta[] getCartas() {
		return cartas;
	}

	@Override
	public void setCartas(Carta[] cartas) {
		this.cartas = cartas;
	}
	
	//Metodos de la clase object
	//toString
	@Override
	public String toString() {
		return nombre + " , " + nombreFicha + " , " + dinero + " , " + cartas.toString();
	}
	

}
