package validaciones;

import clases.TrabajadorImp;

import java.util.Scanner;

public class validacionesFichado {
    /*
    Interfaz
    Nombre: leeryValidarTrabajador
    Comentario: Este subprograma lee y valida un trabajador
    Cabecera: public TrabajadorImp leeryValidarTrabajador()
    Precondiciones: No hay
    Entrada: No hay
    Salida: - TrabajadorImp trabajador //Es el trabajador que hemos creado
    E/S: No hay
    Postcondiciones: Asociado al nombre, el trabajador nuevo creado
    */

    public TrabajadorImp leeryValidarTrabajador() {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        String apellidos;
        int edad;
        char sexo;
        TrabajadorImp trabajador;

        System.out.println("Escriba su nombre");
        nombre = teclado.next();
        System.out.println("Escriba sus apellidos");
        apellidos = teclado.next();
        edad = leeryValidarEdad();
        sexo = leeryValidarSexo();

        trabajador = new TrabajadorImp(nombre, apellidos, edad, sexo);

        return trabajador;
    }

    /*
    Interfaz
    Nombre: leeryValidarEdad
    Comentario: Este subprograma lee y valida la edad de un trabajador
    Cabecera: public int leeryValidarEdad()
    Precondiciones: No hay
    Entrada: No hay
    Salida: - int edad //Es la edad del trabajador
    E/S: No hay
    Postcondiciones: Asociado al nombre, la edad del trabajador
    */

    public int leeryValidarEdad() {
        Scanner teclado = new Scanner(System.in);
        int edad;
        do {
            System.out.println("Escriba su edad correctamente (Mayor de 16)");
            edad = teclado.nextInt();
        }
        while(edad < 16);

        return edad;
    }

    /*
    Interfaz
    Nombre: leeryValidarSexo
    Comentario: Este subprograma lee y valida el sexo de un trabajador
    Cabecera: public char leeryValidarSexo()
    Precondiciones: No hay
    Entrada: No hay
    Salida: - char sexo //Es el sexo del trabajador
    E/S: No hay
    Postcondiciones: Asociado al nombre, el sexo del trabajador
    */

    public char leeryValidarSexo() {
        Scanner teclado = new Scanner(System.in);
        char sexo;
        do {
            System.out.println("Escriba el sexo correctamente (M/F)");
            sexo = Character.toUpperCase(teclado.next().charAt(0));
        }
        while(sexo != 'M' && sexo != 'F');

        return sexo;
    }
}
