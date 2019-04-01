package clases;

/*
Propiedaes basicas
ID
Tipo: int
Cons: Si
Mod: Si

Propiedades derivadas
No hay

Propiedades compartidas
No hay

Get and Set
ID
public int getID()
public void setID(int id)

Requisitos
No hay

Metodos anhadidos
No hay, de momento
*/

import interfaces.Mesa;

public class MesaImp implements Mesa, Cloneable, Comparable<MesaImp> {
    //Atributos
    private int id;

    //Constructor
    public MesaImp() { //Por defecto
        id = 0;
    }

    public MesaImp(int id) { //Con parametros
        this.id = id;
    }

    public MesaImp(MesaImp cop) { //De copia
        this.id = cop.getID();
    }

    //Get and Set
    //ID
    public int getID() {
        return id;
    }
    public void setID(int id) {
        this.id = id;
    }


    //Metodos de la clase object
    //toString
    @Override
    public String toString() {
        return "" + id;
    }

    //hashCode
    @Override
    public int hashCode() {
        return id  * 7 * 21;
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
