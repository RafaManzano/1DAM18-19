import java.util.*;
public class dado extends sorteo {
	
	public int lanzar() {
		Random random = new Random();
		int valor = random.nextInt(6)+1;
		return valor;
	}
}

