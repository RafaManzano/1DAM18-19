public class empleado extends persona {
	
	protected int sueldoBase;
	
	public int getSueldo() {
		return sueldoBase;
	}
	
	public void setSueldoBase (int s) {
		sueldoBase = s;
	}
	
	public static void m (empleado e) {
		System.out.println(e.getNombre());
	}
}

