/*
 * Tipo CasillaImp
 * Propiedades basicas
 * Dibujo
 * Tipo: String
 * Cons: Si
 * Mod: Si
 * 
 * Barco
 * Tipo: Barco
 * Cons: Si
 * Mod: No
 * 
 * Propiedades derivadas
 * No hay
 * 
 * Propiedades compartidas
 * No hay
 * 
 * Get and Set
 * Dibujo
 * public String getDibujo()
 * public void setDibujo(String dibujo)
 * 
 * Barco
 * public Barco getBarco() 
 * public void setBarco(Barco barco)
 * 
 * Requisitos
 * No hay
 * 
 * Metodos anhadidos
 * No hay
 * 
 */


public class CasillaImp {
	
	//Atributos
	private String dibujo;
	private BarcoImp barco;
	
	//Constructor
	public CasillaImp () { //Por defecto
		dibujo = "[]";
		barco = new Barco();
	}
	
	public CasillaImp (String dibujo, int id, int tamanho) { //Con parametros de barco
		this.dibujo = dibujo;
		this.barco = new Barco(id, tamanho); 
	}
	
	public CasillaImp (String dibujo) { //Con parametros para dibujo
		this.dibujo = dibujo;
	}
	
	public CasillaImp (CasillaImp cop) {
		this.dibujo = cop.getDibujo();
		this.barco = new Barco(barco); //Preguntar y cambiar circulo
	}
	
	//Get and Set
	//Dibujo
	public String getDibujo() {
		return dibujo;
	}
	
	public void setDibujo(String nombre) {
		this.dibujo = dibujo;
	}
	
	//Patron delegacion
	public int getIDBarco() {
		return barco.getID();
	}
	
	public void setIDBarco() {
}

