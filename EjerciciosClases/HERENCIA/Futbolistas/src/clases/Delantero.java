package clases;

/*
Propiedades basicas
GolesMarcados
Tipo: int
Cons: Si
Mod: Si

Propiedades derivadas
No hay

Propiedades compartidas
No hay

Get and Set
GolesMarcados
public int getGolesMarcados()
public void setGolesMarcados(int golesMarcados)

Requisitos
golesMarcados tiene que ser mayor o igual a 0

Metodos anhadidos
No hay

*La clase es una clase hija de la clase FutbolistaImp (Herencia)
 */

public class Delantero extends FutbolistaImp {
    //Atributos
    private int golesMarcados;

    //Constructor
    public Delantero() {
        super();
        golesMarcados = 0;
    }

    public Delantero(String nombre, String apellidos, String alias, int dorsal, int edad, int golesMarcados) {
        super(nombre, apellidos, alias, dorsal, edad);
        this.golesMarcados = golesMarcados;
    }

    public Delantero(Delantero cop) {
        super(cop);
        this.golesMarcados = cop.getGolesMarcados();
    }

    //Atributos
    //GolesMarcados
    public int getGolesMarcados() {
        return golesMarcados;
    }

    public void setGolesMarcados(int golesMarcados) {
        this.golesMarcados = golesMarcados;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + ", " + golesMarcados;
    }
}
