package interfaces;

import clases.SocioImp;
import excepciones.ExcepcionPista;

public interface Pista {

	//NumeroPista
	public int getNumeroPista();
	public void setNumeroPista(int numeroPista) throws ExcepcionPista;
	
	//Socio
	public SocioImp getSocio();
	public void setSocio(SocioImp socio);
	
	//Hora
	public int getHora();
	public void setHora(int hora) throws ExcepcionPista;
	
	//Rechazada
	public boolean getRechazada();
	public void setRechazada(boolean rechazada);
}
