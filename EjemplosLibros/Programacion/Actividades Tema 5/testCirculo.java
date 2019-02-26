public class testCirculo {
	
	public static void main (String[] args) {
		circulo c = new circulo();
		//Haciendo el UpCast
		forma f = (forma) c;
		f.identidad();
		
		//Haciendo el DownCast
		if(f instanceof circulo) {
			((circulo)f).identidad();
		}
		else if(!(f instanceof circulo)) {
			System.out.println("f (forma) no es un circulo");
			
		}
		circulo.jerarquia(c);
	}
}

