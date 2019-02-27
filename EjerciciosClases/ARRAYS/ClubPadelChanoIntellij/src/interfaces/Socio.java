package interfaces;
import excepciones.ExcepcionSocio;

public interface Socio {

	public int getNumSocio();
	public String getApellidos();
	public void setApellidos(String apellidos);
	public String getNombre();
	public void setNombre(String nombre);
	public double getCuota();
	public void setCuota(double cuota) throws ExcepcionSocio;
	public int getEdad();
	public void setEdad(int edad) throws ExcepcionSocio;
	public char getGenero();
	public void setGenero(char genero) throws ExcepcionSocio;

}
