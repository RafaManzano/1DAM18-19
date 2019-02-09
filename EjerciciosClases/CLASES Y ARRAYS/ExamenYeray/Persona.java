public interface Persona {
	public String getNombre();
	public void setNombre(String nombre);
	public String getApellidos();
	public void setApellidos(String apellidos);
	public char getGenero();
	public void setGenero(char genero)throws ExcepcionPersona;
	public int getSalario();
	public void setSalario(int salario)throws ExcepcionPersona;
}

