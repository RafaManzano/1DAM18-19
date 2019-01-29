package interfaces;

import clases.Ayuda;
import clases.Calle;
import enumerados.TipoNombreFicha;

public interface Jugador {

	public String getNombre();
	public void setNombre(String nombre);
	public TipoNombreFicha getNombreFicha();
	public void setNombreFicha(TipoNombreFicha nombreFicha);
	public int getDinero();
	public void setDinero(int dinero);
	public Calle[] getCalles();
	public void setCalles(Calle[] calles);
	public Ayuda[] getAyudas();
	public void setAyuda(Ayuda[] ayudas);
	public int getTurno();
	public void setTurno(int turno);
}
