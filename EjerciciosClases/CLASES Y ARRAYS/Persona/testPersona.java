public class testPersona {
	
	public static void main (String[] args) {
	Persona p1 = new Persona ("nombre", 20, "hola", TipoSexo.NODEFINIDO, 19,2);
	Persona p2 = new Persona();
	Persona p3 = new Persona();
	Persona p4 = new Persona(p2);
	Persona p5 = new Persona(p2);
	
	System.out.println(p3.getIDPersona());
	System.out.println(p1.getIDPersona());
	System.out.println(p2.getIDPersona());
	System.out.println(p4.getIDPersona());
	System.out.println(p5.getIDPersona());
		
		try {
			p1.setAltura(-1);
		}
		catch(ExcepcionPersona error) {
			System.out.println("ERROR " + error);
		}
		
		try {
			p1.setPeso(0);
		}
		catch(ExcepcionPersona error) {
			System.out.println("ERROR " + error);
		}
		
		System.out.println(p1.getSexo());
		p1.setSexo(TipoSexo.MUJER);
		System.out.println(p1.getSexo());
		
		
		
		
	}
}

