public interface Jugador {
	

  public String getNombre();
  public void setNombre (String nombre);
  
  
  public int getDorsal() ;
  public void setDorsal(int dorsal) throws ExcepcionJugador;

  public int getID();
}

