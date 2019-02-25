package menus;

public class menuPadel {
    /*
    Interfaz
    Nombre: menuPrincipal
    Comentario:  Este subporgrama muestas las opciones del menu principal
    Cabecera: public void menuPrincipal ()
    Precondiciones: No hay
    Entrada: No hay
    Salida: No hay
    E/S: No hay
    Postcondiciones: Solo pinta en pantalla el menu
    */

    public void menuPrincipal() {
        System.out.println("MENU PRINCIPAL");
        System.out.println("1. Socios");
        System.out.println("2. Pistas");
        System.out.println("3. MostrarReservas");
    }

    /*
    Interfaz
    Nombre: menuSocios
    Comentario:  Este subporgrama muestas las opciones del menu socios
    Cabecera: public void menuSocios ()
    Precondiciones: No hay
    Entrada: No hay
    Salida: No hay
    E/S: No hay
    Postcondiciones: Solo pinta en pantalla el menu
    */

    public void menuSocios() {
        System.out.println("MENU SOCIOS");
        System.out.println("1. Por Defecto");
        System.out.println("2. Introducir Socios");
        System.out.println("3. Borrar Socios");
    }

    /*
    Interfaz
    Nombre: menuPistas
    Comentario:  Este subporgrama muestas las opciones del menu pistas
    Cabecera: public void menuPistas ()
    Precondiciones: No hay
    Entrada: No hay
    Salida: No hay
    E/S: No hay
    Postcondiciones: Solo pinta en pantalla el menu
    */

    public void menuPistas() {
        System.out.println("MENU PISTAS");
        System.out.println("1. Por Defecto");
        System.out.println("2. Introducir Pistas");
        System.out.println("3. Borrar Pistas");
    }

    /*
    Interfaz
    Nombre: menuMostrarReservas
    Comentario:  Este subporgrama muestas las opciones del menu mostrar las reservas
    Cabecera: public void menuMostrarReservas ()
    Precondiciones: No hay
    Entrada: No hay
    Salida: No hay
    E/S: No hay
    Postcondiciones: Solo pinta en pantalla el menu
    */

    public void menuMostrarReservas() {
        System.out.println("MENU MOSTRAR RESERVAS");
        System.out.println("1. MostrarSocios");
        System.out.println("2. MostrarPistas");
    }
}
