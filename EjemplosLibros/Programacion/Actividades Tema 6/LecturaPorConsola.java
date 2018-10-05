import java.io.*;
public class LecturaPorConsola {
	
	public static String leerCadena() {
		String cad = "";
		
		BufferedReader br;
		
		br = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			cad = br.readLine();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return cad;
	}
	
	
}
