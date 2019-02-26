import java.io.*;

public class claseFile {
	
	public static void main (String[] args) {
		File dir = new File("C:\\Users\\Rafael Manzano\\Desktop\\Prueba");
		if (dir.exists()) {
			System.out.println("Existe el directorio " + dir.getName());
		}
		else {
			System.out.println("El directorio no existe");
		}
		
		if(dir.canRead()) {
			System.out.println("El directorio existe y tiene permiso de lectura");
		}
		
		if(dir.canWrite()) {
			System.out.println("El directorio existe y tiene permiso de escritura");
		}
		File[] ficheros = dir.listFiles();
		
		for (File f : ficheros) 
			System.out.println(f.getName());
	}
}

