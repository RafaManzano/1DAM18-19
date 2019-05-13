package main.test;

import main.java.util.Articulo;
import main.java.util.ListaArticulos;

public class testListaArticulos {
    public static void main(String[] args) {
        ListaArticulos lista = new ListaArticulos();
        Articulo a1 = new Articulo();
        Articulo a2 = new Articulo();
        Articulo a3 = new Articulo();
        lista.addArticulo(a1);
        lista.addArticulo(a2);
        lista.remove(a2);
        lista.insert(a3, 1);
        lista.pintarArticulasDeLista();
        System.out.println(lista.contarArticulosLista());
        System.out.print("get"+lista.get(1));
    }	
}
