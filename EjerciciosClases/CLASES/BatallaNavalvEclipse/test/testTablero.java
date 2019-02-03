package test;
import clases.TableroImp;

public class testTablero {
	
	public static void main (String[] args) {
		TableroImp t1 = new TableroImp(); 
		for (int i = 1; i <= 6; i++) {
			t1.introducirBarco(i);
		}
			t1.pintarTableroLleno();
	}
}

