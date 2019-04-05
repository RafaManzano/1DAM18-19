package menus;

public class menuCatering {

     /*
    Interfaz
    Nombre: menuPrincipal
    Comentario: Este subprograma muestra el menu de opciones
    Cabecera: public void menuPrincipal()
    Precondiciones: No hay
    Entrada: No hay
    Salida: No hay
    E/S: No hay
    Postcondiciones: No hay, Solo pinta en pantalla el menu principal
    */

     public void menuPrincpal() {
         System.out.println("MENU PRINCIPAL");
         System.out.println("1. Camareros");
         System.out.println("2. Mesas");
         System.out.println("3. Turno");
         System.out.println("0. Salir");
     }

     /*
    Interfaz
    Nombre: menuCamareros
    Comentario: Este subprograma muestra el menu de camareros
    Cabecera: public void menuCamareros()
    Precondiciones: No hay
    Entrada: No hay
    Salida: No hay
    E/S: No hay
    Postcondiciones: No hay, Solo pinta en pantalla el menu camareros
    */

    public void menuCamareros() {
        System.out.println("MENU CAMAREROS");
        System.out.println("1. Introducir Camarero");
        System.out.println("2. Borrar Camarero");
        System.out.println("3. Modificar Camarero");
        System.out.println("0. Salir");
    }

    /*
    Interfaz
    Nombre: menuMesas
    Comentario: Este subprograma muestra el menu de mesas
    Cabecera: public void menuMesas()
    Precondiciones: No hay
    Entrada: No hay
    Salida: No hay
    E/S: No hay
    Postcondiciones: No hay, Solo pinta en pantalla el menu mesas
    */

    public void menuMesas() {
        System.out.println("MENU MESAS");
        System.out.println("1. Introducir Mesa");
        System.out.println("2. Borrar Mesa");
        System.out.println("3. Modificar Mesa");
        System.out.println("0. Salir");
    }

}
