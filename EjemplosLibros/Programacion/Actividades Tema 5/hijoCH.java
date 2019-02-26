public class hijoCH extends padreCH {
	
	private int dato1;
	private int dato2;
	
	hijoCH(int x, int y) {
		super(2,2);
		dato1 = x;
		dato2 = y;
	}
	
	hijoCH() {
		dato1 = 3;
		dato2 = 3;
	}
	
	public void getDato() {
		System.out.println("Padre dato1: " + super.dato1);
		System.out.println("Padre dato2: " + super.dato2);
		System.out.println("Hijo dato1: " + this.dato1);
		System.out.println("Hijo dato2: " + this.dato2);
	}
}

