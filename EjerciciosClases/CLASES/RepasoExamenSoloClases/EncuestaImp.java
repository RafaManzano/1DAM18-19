/*
 * EncuestaImp
 * 
 * Propiedades basicas
 * Pregunta
 * Tipo: String
 * Cons: Si
 * Mod: Si
 * 
 * Respuesta
 * Tipo: int
 * Cons: Si
 * Mod: Si
 * 
 * Propiedades derivadas
 * No hay
 * 
 * Propiedades compartidas
 * ID
 * Tipo: int
 * Cons: Si
 * Mod: No
 * 
 * Get and Set
 * public String getPregunta()
 * public void setPregunta(String pregunta)
 * public int getRespuesta()
 * public void setRespuesta(int respuesta)
 * public int getID()
 * 
 * Requisitos
 * No hay
 * 
 * Metodos anhadidos
 * No hay, de momento
 */


public class EncuestaImp {
	
	//Atributos
	private String pregunta;
	private int respuesta;
	private static int acumulador = 1;
	private int id;
	
	//Constructor
	public EncuestaImp() { //Por defecto
		pregunta = " ";
		respuesta = 0;
		id = acumulador++;
	}
	
	public EncuestaImp(String pregunta, int respuesta) { //Con parametros
		this.pregunta = pregunta;
		this.respuesta = respuesta;
		id = acumulador++;
	}
	
	public EncuestaImp(EncuestaImp cop) {
		this.pregunta = cop.getPregunta();
		this.respuesta = cop.getRespuesta();
		id = acumulador++;
	}
	
	//Get and Set
	//Pregunta
	public String getPregunta() {
		return pregunta;
	}
	
	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}
	
	//Respuesta
	public int getRespuesta() {
		return respuesta;
	}
	
	public void setRespuesta(int respuesta) {
		this.respuesta = respuesta;
	}
	
	//ID
	public int getID() {
		return id;
	}
	
	//Metodos de la clase object
	//toString
	@Override
	public String toString() {
		return pregunta + " , " + respuesta + " , " + id;
	}
	
	//hashCode
	@Override
	public int hashCode() {
		return pregunta.hashCode() * respuesta + id * 7;
	}
	
	//equals
	@Override
	public boolean equals(Object obj) {
		boolean res = false;
		
		if(this == obj) {
			res = true;
		}
		else if(obj != null && obj instanceof EncuestaImp){
				EncuestaImp otro = (EncuestaImp) obj;
				
				if(this.id == otro.getId()) {
					res = true;
				}
			 }
		return res;
	}
	
	//clone
	@Override
	public EncuestaImp clone() {
		EncuestaImp copia = null;
		
		try {
			copia = (EncuestaImp)super.clone();
		}
		catch(CloneNotSupportedException err) {
			System.out.println("Objeto no clonado");
		}
	}
	
	//No necesita clone en profundidad
	
	//
}

