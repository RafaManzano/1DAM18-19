public class testTablero {
	
	public static void main (String[] args) {
		TableroImp t1 = new TableroImp(); 
		
		for(int i = 0; i <= 6; i++) {
		t1.introducirBarco(i);
		}
		
		t1.pintarTableroLleno();
	}
}

