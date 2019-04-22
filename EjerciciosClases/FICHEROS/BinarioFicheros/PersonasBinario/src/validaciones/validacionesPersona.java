package validaciones;

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
		
		System.out.println("Escriba su DNI");
		dni = teclado.next();
		System.out.println("Escriba su nombre");
		nombre = teclado.next();
		System.out.println("Escriba su apellidos");
		apellidos = teclado.next();
		
		persona = new PersonaImp(dni, nombre, apellidos);
		
		return persona;
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
}
