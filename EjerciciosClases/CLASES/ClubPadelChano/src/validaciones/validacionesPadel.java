package validaciones;
import java.util.*;
public class validacionesPadel {
    /*
    Interfaz
    Nombre: validarOpcionMenu
    Comentario: Este subprograma valida la opcion que va a ser usada
    Cabecera: public int validarOpcionMenu ()
    Precondiciones: No hay
    Entrada: No hay
    Salida: int numeroValidado
    E/S: No hay
    Postcondiciones: Asociado al nombre, el numero queda validado para la opcion de menu
    */

    public int validarOpcionMenu() {
        int numeroValidado;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Numeros de 1 a 3");
            numeroValidado = teclado.nextInt();
        }
        while(numeroValidado < 1 || numeroValidado > 3);

        return numeroValidado;
    }

    /*
    Interfaz
    Nombre: validarOpcionMenuReservas
    Comentario: Este subprograma valida la opcion que va a ser usada
    Cabecera: public int validarOpcionMenuReservas ()
    Precondiciones: No hay
    Entrada: No hay
    Salida: int numeroValidado
    E/S: No hay
    Postcondiciones: Asociado al nombre, el numero queda validado para la opcion de menu de reservas
    */

    public int validarOpcionMenuReservas() {
        int numeroValidado;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Numeros de 1 a 2");
            numeroValidado = teclado.nextInt();
        }
        while(numeroValidado < 1 || numeroValidado > 2);

        return numeroValidado;
    }
}
