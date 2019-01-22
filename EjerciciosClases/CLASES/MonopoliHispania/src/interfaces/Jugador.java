package interfaces;

import clases.Calle;

public interface Jugador {

	public String getNombre();
	public void setNombre(String nombre);
	public String getNombreFicha();
	public void setNombreFicha(String nombreFicha);
	public int getDinero();
	public void setDinero(int dinero);
	public Carta[] getCartas();
	public void setCartas(Carta[] cartas);
	
}
