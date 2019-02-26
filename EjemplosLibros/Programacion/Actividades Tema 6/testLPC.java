import java.io.*;
public class testLPC  {
	
	public static void main (String[] args) throws IOException  {
		String cad;
		System.out.println("Este programa hace eco hasta que escribas para");
		
		do  {
			cad = LecturaPorConsola.leerCadena();
			System.out.println(cad);
		}
		while(!cad.equals("para"));
	}
}

