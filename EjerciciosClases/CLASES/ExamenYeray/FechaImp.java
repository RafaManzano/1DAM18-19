/*
 * FechaImp
 * 
 * Propiedades basicas
 * Dia
 * Tipo: int
 * Cons: Si
 * Mod: Si
 * 
 * Mes
 * Tipo: int
 * Cons: Si
 * Mod: Si
 * 
 * Anio
 * Tipo: int
 * Cons: Si
 * Mod: Si
 * 
 * Propiedades derivadas
 * No hay
 * 
 * Propiedades compartidas
 * No hay
 * 
 * Get and Set 
 * Dia
 * public int getDia();
 * public void setDia(int dia);
 * 
 * Mes
 * public int getMes();
 * public void setMes(int mes);
 * 
 * Anio
 * public int getAnio();
 * public void setAnio(int anio);
 * 
 * Requisitos:
 * Dia tiene que ser entre 1 y 31
 * Mes tiene que ser entre 1 y 12
 * Anio tiene que ser mayor que 1582
 * 
 * Metodos anhadidos
 * No hay
 */


public class FechaImp implements Fecha, Cloneable {
	//Atributos
	private int dia;
	private int mes;
	private int anio;
	
	//Constructor
	public FechaImp() { //Por defecto
		dia = 0;
		mes = 0;
		anio = 0;
	}
	
	public FechaImp(int dia, int mes, int anio) { //Con parametros
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}
	
	public FechaImp(FechaImp cop) { //De copia
		this.dia = cop.getDia();
		this.mes = cop.getMes();
		this.anio = cop.getAnio();
	}
	
	//Get and Set
	//Dia
	public int getDia() {
		return dia;
	}
	
	public void setDia(int dia) throws ExcepcionFecha {
		if(dia >= 1 && dia <= 31) {
			this.dia = dia;
		}
		else {
			throw new ExcepcionFecha("El dia tiene que ser entre 1 y 31");
		}
	}
	
	//Mes
	public int getMes() {
		return mes;
	}
	
	public void setMes(int mes) throws ExcepcionFecha{
		if(mes >= 1 && mes <= 12) {
			this.mes = mes;
		}
		else {
			throw new ExcepcionFecha("El mes tiene que ser entre 1 y 12");
		}
	}
	
	//Anio
	public int getAnio() {
		return anio;
	}
	
	public void setAnio(int anio) throws ExcepcionFecha {
		if(anio >= 1582) {
			this.anio = anio;
		}
		else {
			throw new ExcepcionFecha("El anio tiene que ser 1582");
		}
	}
	
	//Metodos de la clase object
	//toString
	@Override
	public String toString() {
		return dia + " , " + mes + " , " + anio;
	}
	
	//hashCode
	@Override
	public int hashCode() {
		return dia * mes + anio * 7 + 21;
	}
	
	//Equals
	public boolean equals(Object obj) {
		boolean res = false;
		
		if(this == obj) {
			res = true;
		}
		
		else if(obj != null && obj instanceof FechaImp) {
			FechaImp otro = (FechaImp)obj;
			
				if(this.dia == otro.getDia() &&
				   this.mes == otro.getMes() &&
				   this.anio == otro.getAnio()) {
					   res = true;
				   }
			 }
		return res;
	}
	
	//Clone
	public FechaImp clone() {
		FechaImp copia = null;
		
		try {
			copia = (FechaImp)super.clone();
		}
		catch(CloneNotSupportedException err) {
			System.out.println("Objeto no clonado");
		}
		
		return copia;
	}
	
	//No necesita clone en profundidad
	//No necesita compareTo
}

