package conductor;

import gestoras.gestoraFicha;

public class conductorGestora {

	public static void main(String[] args) {
		int[] cal = {0,1,1,1,1,1,1,0,0,1};
		gestoraFicha gestora = new gestoraFicha();
		
		System.out.println(gestora.fichaValida(cal));
		
		

	}

}
