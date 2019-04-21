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
		
	}
}
