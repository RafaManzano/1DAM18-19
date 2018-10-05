public class testInteger {
	
	public static void main (String[] args) {
		Integer i1 = new Integer (5);
		Integer i2 = new Integer ("7");
		String s1 = i1.toString();
		System.out.println(s1); //5
		int i3 = Integer.parseInt("10",10);
		int i4 = Integer.parseInt("10",8); 
		int i5 = Integer.parseInt("BABA",16); 
		System.out.println(i3); //10
		System.out.println(i4); //8
		System.out.println(i5); //47802
		System.out.println(Integer.toOctalString(i4)); //10
		System.out.println(Integer.toHexString(i5)); //baba
		int i6 = Integer.valueOf("22").intValue();
		System.out.println(i6); //22
	}
}

