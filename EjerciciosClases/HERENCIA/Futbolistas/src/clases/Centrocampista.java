package clases;

/*
Propiedades basicas
PasesCompletados
Tipo: int
Cons: Si
Mod: Si

Propiedades derivadas
No hay

Propiedades compartidas
No hay

Get and Set
PasesCompletados
public int getPasesCompletados()
public void setPasesCompletados(int pasesCompletados)

Requisitos
PasesCompletados tiene que ser mayor o igual a 0 a 100

Metodos anhadidos
No hay

*La clase es una clase hija de la clase FutbolistaImp (Herencia)
 */

public class Centrocampista extends FutbolistaImp {
    //Atributos
    private int pasesCompletados;

    //Constructor
    public Centrocampista() {
        super();
        pasesCompletados = 0;
    }

    public Centrocampista(String nombre, String apellidos, String alias, int dorsal, int edad, int pasesCompletados) {
        super(nombre, apellidos, alias, dorsal, edad);
        this.pasesCompletados = pasesCompletados;
    }

    public Centrocampista(Centrocampista cop) {
        super(cop);
        this.pasesCompletados = cop.getPasesCompletados();
    }

    //Atributos
    //GolesMarcados
    public int getPasesCompletados() {
        return pasesCompletados;
    }

    public void setPasesCompletados(int pasesCompletados) {
        this.pasesCompletados = pasesCompletados;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + ", " + pasesCompletados;
    }
}
