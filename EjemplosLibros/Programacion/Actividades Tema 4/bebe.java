/*
 * Es como viene el libro
 */


public class bebe {
	
	bebe (int i) {
		this("Soy un bebe consentido");
		System.out.println("Hola, tengo " + i + " meses");
	}
	
	bebe (String s) {
		System.out.println(s);
	}
	
	void berrea () {
		System.out.println("Buaaa");
	}
	
	public static void main(String [] args) {
		new bebe (8).berrea();
	}
}

