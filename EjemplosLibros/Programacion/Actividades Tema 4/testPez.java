public class testPez {
	
	public static void main (String[] args) {
		Pez p1 = new Pez ();
		Pez p2 = new Pez ("Roberto");
		Pez p3 = new Pez (p2);
		Pez p4 = new Pez ();
		
		
		System.out.println(p1.getNumPeces());
		System.out.println(p3.getNumPeces());
		p1.setNombre ("Ricardo");
		System.out.println(p1.getNombre());
		System.out.println(p2.equals(p1));
		Pez p5 = (Pez)p1.clone();
		System.out.println(p1.getNombre());
		System.out.println(p5.getNumPeces());
		
	}
}

