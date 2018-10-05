import java.io.*;
public class EscrituraPorPantalla {
	
	public static void main (String[] args) throws IOException {
		PrintWriter pantalla = new PrintWriter(System.out);
		char[] array = {'M','a','r','i','a','D','e','l','C','a','r','m','e','n'};
		String str = new String("Guapa");
		pantalla.write(str);
		pantalla.write(" ");
		pantalla.write(array,0,14);
		pantalla.println("");
		pantalla.flush();
		
	}
}

