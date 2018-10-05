public class testJuego {
	
	public static void main (String[] args) {
		dado d1 = new dado();
		moneda m1 = new moneda();
		
		System.out.println(d1.lanzar());
		System.out.println(m1.lanzar());
	}
}

