public class testAtaque {
	
	public static void main (String[] args) {
		
		Ataque a1 = new Ataque("Mortal", 15, 5);
		System.out.println(a1.toString());
		
		try {
		a1.setFallo(-2);
		}
		catch(ExcepcionAtaque err) {
			System.out.println("ERROR " + err);
		}
	}
}

