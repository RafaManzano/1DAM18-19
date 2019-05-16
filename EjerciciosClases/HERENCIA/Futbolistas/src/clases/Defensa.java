package clases;

/*
Propiedades basicas
Robos
Tipo: int
Cons: Si
Mod: Si

Propiedades derivadas
No hay

Propiedades compartidas
No hay

Get and Set
Robos
public int getRobos()
public void setRobos(int robos)

Requisitos
Robos tiene que ser mayor o igual a 0 a 100

Metodos anhadidos
No hay

*La clase es una clase hija de la clase FutbolistaImp (Herencia)
 */

public class Defensa extends FutbolistaImp {
    //Atributos
    private int robos;

    //Constructor
    public Defensa() {
        super();
        robos = 0;
    }

    public Defensa(String nombre, String apellidos, String alias, int dorsal, int edad, int robos) {
        super(nombre, apellidos, alias, dorsal, edad);
        this.robos = robos;
    }

    public Defensa(Defensa cop) {
        super(cop);
        this.robos = cop.getRobos();
    }

    //Atributos
    //GolesMarcados
    public int getRobos() {
        return robos;
    }

    public void setRobos(int robos) {
        this.robos = robos;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + ", " + robos;
    }
}
