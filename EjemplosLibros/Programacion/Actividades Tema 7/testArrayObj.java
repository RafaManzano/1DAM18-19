
public class testArrayObj {
	
	public static void main (String[] args) {
		
		arrayObjeto a = new arrayObjeto();
		a.lista = new String[a.POS];
		
		for (int i = 0; i < a.POS; i++) {
			String ln = System.console().readLine();
			a.lista[i] = ln.toString();
		}
		
		System.out.println("");
		a.muestra();
		System.out.println("");
	}
}

