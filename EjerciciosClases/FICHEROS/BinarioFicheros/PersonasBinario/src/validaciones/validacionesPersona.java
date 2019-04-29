package validaciones;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

import clases.PersonaImp;

public class validacionesPersona {
	/*
    Interfaz
    Nombre: leeryValidarPersona
    Comentario: Este subprograma lee y valida una nueva persona
    Cabecera: public PersonaImp leeryValidarPersona()
    Precondiciones: No hay
    Entrada: No hay
    Salida: PersonaImp persona //La persona creada y validada correctamente
    E/S: No hay
    Postcondiciones: Asociado al nombre. La persona estaria validada y creada correctamente
    */
	
	public PersonaImp leeryValidarPersona() {
		Scanner teclado = new Scanner(System.in);
		PersonaImp persona = null;
		String dni;
		String nombre;
		String apellidos;
		boolean repetido;
		
		do {
			System.out.println("Escriba su DNI");
			dni = teclado.next();
			repetido = comprobarDNIRepetido(dni, "movimiento.dat");
		}
		while(repetido == true);
		
		System.out.println("Escriba su nombre");
		nombre = teclado.next();
		System.out.println("Escriba su apellidos");
		apellidos = teclado.next();
		
		persona = new PersonaImp(dni, nombre, apellidos);
		
		return persona;
	}
	
	/*
	 * Interfaz
	 * Nombre: comprobarDNIRepetido
	 * Comentario: Este subprograma comprueba si el dni esta repetido en el fichero de movimiento
	 * Cabecera: public boolean comprobarDNIRepetido (String dni, String rutaFichero)
	 * Precondiciones: El fichero debe estar creado
	 * Entrada: - String dni //El dni tiene que ser el que quieres buscar
	 * 			- String rutaFichero //Es la ruta donde se encuentra el fichero
	 * Salida: - No hay
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre, si el dni esta repetido seria true y si el dni no esta repetido seria false
	 */
	 public boolean comprobarDNIRepetido(String dni, String rutaFichero) {
		ObjectInputStream mov = null;
		PersonaImp perMov = null;
		boolean repetido = false;
		
		try {
			mov = new ObjectInputStream(new FileInputStream(rutaFichero));
			perMov = (PersonaImp) mov.readObject();
			
			while(perMov != null) {
				if(perMov.getDNI().equals(dni)) {
					repetido = true;
				}
				//try {
					perMov = (PersonaImp) mov.readObject();
				//}
				/*
				catch(EOFException err) {
					Syste
				}
				*/
			}
			
		}
		catch(EOFException err) {
			System.out.println("Fin de fichero");
		}
		catch(IOException err) {
			err.printStackTrace();
		}
		catch(ClassNotFoundException err) {
			err.printStackTrace();
		}
		return repetido;
	}

	/*
    Interfaz
    Nombre: leeryValidarOpcion
    Comentario: Este subprograma lee y valida la opcion del menu
    Cabecera: public int leeryValidarOpcion()
    Precondiciones: No hay
    Entrada: No hay
    Salida: int opcion //La opcion del menu ya validada
    E/S: No hay
    Postcondiciones: Asociado al nombre, la opcion queda validada
    */

    public int leeryValidarOpcion() {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        do{
            System.out.println("La opcion tiene que ser de 0 a 3");
            opcion = teclado.nextInt();
        }
        while(opcion < 0 || opcion > 3);

        return opcion;
    }
    
    /*
    Interfaz
    Nombre: leeryValidarRespuesta
    Comentario: Este subprograma lee y valida la respuesta
    Cabecera: public char leeryValidarRespuesta()
    Precondiciones: No hay
    Entrada: No hay
    Salida: char respuesta //La respuesta para guardar
    E/S: No hay
    Postcondiciones: Asociado al nombre, la respuesta queda validada
    */

    public char leeryValidarRespuesta() {
        char respuesta;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("La respuesta tiene que ser s o n");
            respuesta = Character.toUpperCase(teclado.next().charAt(0));
        }
        while(respuesta != 'S' && respuesta != 'N');

        return respuesta;
    }
    
    /*
    Interfaz
    Nombre: ModificarPersona
    Comentario: Este subprograma modifica el nombre y los apellidos de una persona
    Cabecera: public PersonaImp modificarPersona(PersonaImp persona)
    Precondiciones: No hay
    Entrada: - PersonaImp persona //Es la persona que se desea modificar sus atributos
    Salida: PersonaImp persona //La persona modificada
    E/S: No hay
    Postcondiciones: Asociado al nombre. La persona quedaria modificada
    */
    
    public PersonaImp modificarPersona(PersonaImp persona) {
    	Scanner teclado = new Scanner(System.in);
    	
    	System.out.println("Escriba su nombre");
    	persona.setNombre(teclado.next()); 
    	System.out.println("Escriba su apellidos");
    	persona.setApellidos(teclado.next()); 
    	
    	return persona;
    }
	
}
