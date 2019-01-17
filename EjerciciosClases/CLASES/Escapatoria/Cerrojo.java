/*
 * Tipo Cerrojo
 * 
 * Propiedades Basicas
 * Numero1
 * Tipo: int
 * Cons: Si
 * Mod: Si
 * 
 * Numero2
 * Tipo: int
 * Cons: Si
 * Mod: Si
 * 
 * Numero3
 * Tipo: int
 * Cons: Si
 * Mod: Si
 * 
 * Oculto
 * Tipo: boolean
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
 * Numero1
 * public int getNumero1 ()
 * public void setNumero1 (int numero1)
 * 
 * Numero2
 * public int getNumero2 ()
 * public void setNumero2 (int numero2)
 * 
 * Numero3
 * public int getNumero3 ()
 * public void setNumero2 (int numero3)
 * 
 * Oculto
 * public boolean getOculto ()
 * public void setOculto (boolean oculto)
 * 
 * Restricciones
 * Numero1 (0-9)
 * Numero2 (0-9)
 * Numero3 (0-9)
 * 
 * Metodos anhadidos 
 * No hay por el momento
 */


public class Cerrojo implements Cloneable {
	
	//Atributos
	private int numero1;
	private int numero2;
	private int numero3;
	private boolean oculto;
	
	//Constructor
	public Cerrojo () { //Por defecto
		numero1 = 0;
		numero2 = 0;
		numero3 = 0;
		oculto = true;
	}
	
	public Cerrojo (int numero1, int numero2, int numero3, boolean oculto) { //Con parametros 
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.numero3 = numero3;
		this.oculto = oculto;
	}
	
	public Cerrojo (Cerrojo cp) { //De copia
		this.numero1 = cp.getNumero1();
		this.numero2 = cp.getNumero2();
		this.numero3 = cp.getNumero3();
		this.oculto = cp.getOculto();
	}
	
	//Metodos
	//Numero1
	public int getNumero1 () {
		return numero1;
	}
	
	public void setNumero1(int numero1) throws ExcepcionCerrojo{
		if(numero1 >= 0 && numero1 < 10) {
			this.numero1 = numero1;
		}
		else {
			throw new ExcepcionCerrojo("El numero es de 0 a 9");
		}
	}
	
	//Numero2
	public int getNumero2 () {
		return numero2;
	}
	
	public void setNumero2(int numero2) throws ExcepcionCerrojo{
		if(numero2 >= 0 && numero2 < 10) {
			this.numero2 = numero2;
		}
		else {
			throw new ExcepcionCerrojo("El numero es de 0 a 9");
		}
	}
	
	//Numero3
	public int getNumero3 () {
		return numero3;
	}
	
	public void setNumero3(int numero3) throws ExcepcionCerrojo {
		if(numero3 >= 0 && numero3 < 10) {
			this.numero3 = numero3;
		}
		else {
			throw new ExcepcionCerrojo("El numero es de 0 a 9");
		}
	}
	
	//Oculto
	public boolean getOculto() {
		return oculto;
	}
	
	public void setOculto (boolean oculto) {
		this.oculto = oculto;
	}
	
	//Metodos de la clase object
	//toString
	@Override
	public String toString () {
		return numero1 + " , " + numero2 + " , " + numero3 + " , " + oculto;
	}
	
	//hashCode
	@Override
	public int hashCode() {
		return 185723 * numero1 + numero2 * numero3 - numero2 - (numero1 * numero2);
	}
	
	//equals
	@Override
	public boolean equals (Object obj) {
		boolean res = false;
		
		if(this == obj) {
			res = true;
		}
		else if(obj != null && obj instanceof Cerrojo) {
			Cerrojo otro = (Cerrojo) obj;
			
			if(this.getNumero1() == otro.getNumero1() &&
			   this.getNumero2() == otro.getNumero2() &&
			   this.getNumero3() == otro.getNumero3() &&
			   this.getOculto() == otro.getOculto()) {
				   res = true;
			   }
		}
		return res;
	}
	
	//Clone superficial (No necesito profundidad)
	@Override
	public Cerrojo clone() {
		Cerrojo copia = null;
		
		try {
			copia = (Cerrojo)super.clone();
		}
		catch(CloneNotSupportedException error) {
			System.out.println("Objeto no clonado");
		}
		return copia;
	}
	
	//No hace falta compareTo	
	 
}

