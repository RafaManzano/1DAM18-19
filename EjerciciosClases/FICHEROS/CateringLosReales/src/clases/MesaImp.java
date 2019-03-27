package clases;

/*
Propiedaes basicas
ID
Tipo: int
Cons: Si
Mod: No

numComensales
Tipo: int
Cons: Si
Mod: Si

Propiedades derivadas
No hay

Propiedades compartidas
acumMesas
Tipo: int
Cons: Si
Mod: No

Get and Set
ID
public int getID()

numComensales
public int getNumComensales()
public void setNumComensales(int numComensales)

Requisitos
numComensales es mayor que 1
*/

import interfaces.Mesa;

public class MesaImp implements Mesa, Cloneable, Comparable<MesaImp> {
    //Atributos
    private int id;
    private int numComensales;
    private static int acumMesas = 1;

    //Constructor
    public MesaImp() { //Por defecto
        id = acumMesas++;
        numComensales = 0;
    }

    public MesaImp(int numComensales) { //Con parametros
        id = acumMesas++;
        this.numComensales = numComensales;
    }

    public MesaImp(MesaImp cop) { //De copia
        id = acumMesas++;
        this.numComensales = cop.getNumComensales();
    }

    //Get and Set
    //ID
    public int getID() {
        return id;
    }

    //NumComensales
    public int getNumComensales() {
        return numComensales;
    }

    public void setNumComensales(int numComensales) {
        this.numComensales = numComensales;
    }

    //Metodos de la clase object
    //toString
    @Override
    public String toString() {
        return id + ", " + numComensales;
    }

    //hashCode
    @Override
    public int hashCode() {
        return id * numComensales * 7 * 21;
    }

    //equals
    @Override
    public boolean equals(Object obj) {
        boolean res = false;

        if(this == obj) {
            res = true;
        }
        else if(obj != null && obj instanceof MesaImp) {
            MesaImp otro = (MesaImp) obj;

            if(this.id == otro.getID()) {
                res = true;
            }
        }

        return res;
    }

    //clone
    @Override
    public MesaImp clone() {
        MesaImp copia = null;

        try {
            copia = (MesaImp) super.clone();
        }
        catch (CloneNotSupportedException err) {
            System.out.println("Objeto no clonado");
        }

        return copia;
    }

    //compareTo
    public int compareTo(MesaImp otro) {
        int comparar = -1;

        if(this.id == otro.getID()) {
            comparar = 0;
        }
        else if(this.id > otro.getID()) {
            comparar = 1;
        }

        return comparar;
    }
}
