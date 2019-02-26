class circulo extends forma {
	
	public String toString() {
		return "Circulo";
	}
	
	public static void jerarquia (Object obj) {
		Object o = obj;
		
		while (o.getClass().getSuperclass() != null) {
			try {
				System.out.println(o.getClass() + " es una subclase de " + o.getClass().getSuperclass());
				o = o.getClass().getSuperclass().newInstance();
			}
			catch(InstantiationException e){
				System.out.println("Imposible instanciar la clase " + o.getClass().getSuperclass());
				break;
			}
			
			catch(IllegalAccessException e) {
				System.out.println("No hay acceso");
				break;
			}
		}
	}
}

