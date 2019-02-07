public class testCerrojo {
	
	public static void main (String[] args) {
		Cerrojo c1 = new Cerrojo();
		Cerrojo c2 = new Cerrojo(1,2,3,4,5,true);
		Cerrojo c3 = new Cerrojo(1,2,3,4,4,true);
		Cerrojo c4 = new Cerrojo(c3);
		Cerrojo c5 = null;
		
		//GetandSet
		try {
		c1.setNumero1(8);
		c2.setNumero2(8);
		
		}
		catch (ExcepcionCerrojo err) {
			System.out.println("ERROR! " + err);
		}
		System.out.println(c2.getNumero2());
		
		
		//Metodos clase object
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		System.out.println(c3.hashCode());
		System.out.println(c2.equals(c3));
		System.out.println(c4.equals(c3));
		System.out.println(c5);
		c5 = c3.clone();
		System.out.println(c5);
		
	}
}

