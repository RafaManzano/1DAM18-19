public class testPoli {
	
	public static void main (String[] args) {
		persona p1;
		p1 = new empleado();
		p1.setNombre("Isaac Sanchez");
		//p1.setSueldoBase(100);
		((empleado)p1).setSueldoBase(100);
		empleado e1;
		e1 = new encargado();
		e1.setSueldoBase(500);
		System.out.println(e1.getSueldo());
		
		//Casting esta es la segunda opcion porque la primera no lo deja claro
		empleado emp = new empleado();
		encargado enc = new encargado();
		emp = enc;
		enc = (encargado)emp;
		
	}
}

