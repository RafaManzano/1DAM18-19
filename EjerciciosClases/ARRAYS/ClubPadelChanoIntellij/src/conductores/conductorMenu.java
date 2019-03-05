package conductores;

import menus.menuPadel;

public class conductorMenu {
    public static void main(String[] args) {
        menuPadel menus = new menuPadel();

        menus.menuOrdenacion();
        menus.menuPistas();
        menus.menuPrincipal();
        menus.menuReservas();
        menus.menuSocios();
    }
}
