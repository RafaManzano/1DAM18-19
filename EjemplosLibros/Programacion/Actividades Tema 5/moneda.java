import java.util.*;
public class moneda extends sorteo {
	
	public int lanzar() {
		Random random = new Random();
		int valor = random.nextInt(2)+1;
		
		if (valor == 1) {
			System.out.println("Cara");
			return valor;
		}
		else {
			System.out.println("Cruz");
			return valor;
		}
	}
}

