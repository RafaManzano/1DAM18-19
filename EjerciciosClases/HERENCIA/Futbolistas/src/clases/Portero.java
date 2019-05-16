package clases;

/*
Propiedades basicas
Paradas
Tipo: int
Cons: Si
Mod: Si

Propiedades derivadas
No hay

Propiedades compartidas
No hay

Get and Set
Paradas
public int getParadas()
public void setParadas(int paradas)

Requisitos
Paradas tiene que ser mayor o igual a 0

Metodos anhadidos
No hay

*La clase es una clase hija de la clase FutbolistaImp (Herencia)
 */

public class Portero extends FutbolistaImp {
    //Atributos
    private int paradas;

    //Constructor
    public Portero() {
        super();
        paradas = 0;
    }

    public Portero(String nombre, String apellidos, String alias, int dorsal, int edad, int paradas) {
        super(nombre, apellidos, alias, dorsal, edad);
        this.paradas = paradas;
    }

    public Portero(Portero cop) {
        super(cop);
        this.paradas = cop.getParadas();
    }

    //Atributos
    //GolesMarcados
    public int getParadas() {
        return paradas;
    }

    public void setParadas(int paradas) {
        this.paradas = paradas;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + ", " + paradas;
    }
}
