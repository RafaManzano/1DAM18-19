import java.io.*;

public class EjSerializacion {
	
	public static void main (String[] args) {
		String [] amigos = {"Gonzalo","Martin","Julia","Alejandra","Enrique"};
		
		long [] telefono = {653364787, 627463746, 644567346, 623746348};
		
		//Escritura en el fichero
		try{
			FileOutputStream fs = new FileOutputStream ("amigos.txt");
			ObjectOutputStream oos = new ObjectOutputStream (fs);
			for(int i = 0; i < 4; i++) {
				amigo a = new amigo(amigos[i], telefono[i]);
				oos.writeObject(a);
			}
			
			if(oos != null){
				oos.close();
				fs.close();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		//Lectura del fichero
		try {
			File f = null;
			FileInputStream fe = null;
			ObjectInputStream ois = null;
			
			try{
				f = new File("amigos.txt");
				if(f.exists()) {
					fe = new FileInputStream(f);
					ois = new ObjectInputStream(fe);
					while(true) {
						amigo a = null;
						a = (amigo)ois.readObject();
						a.print();
						System.out.println("");
					}
				}
			}
			catch (EOFException eof) {
				System.out.println("------------------------------------------");
				
			}
			catch (FileNotFoundException fnf) {
				System.err.println("Fichero no encontrado" + fnf);
			}
			catch (IOException e) {
				System.err.println("Se ha producido una IOException");
				e.printStackTrace();
			}
			catch (Throwable e) {
				System.err.println("Error de programa" + e);
				e.printStackTrace();
			}
			finally {
				if (ois != null) {
					ois.close();
					fe.close();
				}
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}	
	}
}

