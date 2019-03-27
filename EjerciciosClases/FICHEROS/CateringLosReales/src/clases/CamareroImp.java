package clases;

/*
Interfaz
Propiedades basicas

ID
Tipo: int
Cons: Si
Mod: No

Nombre
Tipo: String
Cons: Si
Mod: Si

Apellidos
Tipo: String
Cons: Si
Mod: Si

Propiedades derivadas
No hay

Propiedades compartidas
acumCamareros
Tipo: int
Cons: Si
Mod: No

Get and Set
ID
public int getID()

Nombre
public String getNombre()
public void setNombre(String nombre)

Apellidos
public String getApellidos()
public void setApellidos(String apellidos)
*/

import interfaces.Camarero;

public class CamareroImp implements Camarero, Cloneable, Comparable<CamareroImp> {
    //Atributos
    private int id;
    private String nombre;
    private String apellidos;
    private static int acumCamareros = 1;

    //Constructor
    public CamareroImp() { //Por defecto
        id = acumCamareros++;
        nombre = "NoDefinido";
        apellidos = "NoDefinido";
    }

    public CamareroImp(String nombre, String apellidos) { //Con parametros
        id = acumCamareros++;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public CamareroImp(CamareroImp cop) { //De copia
        id = acumCamareros++;
        this.nombre = cop.getNombre();
        this.apellidos = cop.getApellidos();
    }

    //Get and Set
    //ID
    public int getID() {
        return id;
    }

    //Nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Apellidos
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    //Metodos de la clase object
    //toString
    @Override
    public String toString() {
        return id + ", " + nombre + ", " + apellidos;
    }

    //hashCode
    @Override
    public int hashCode() {
        return id * 7 + nombre.hashCode() + apellidos.hashCode() * 21;
    }

    //equals
    @Override
    public boolean equals(Object obj) {
        boolean res = false;

        if(this == obj) {
            res = true;
        }
        else if(obj != null && obj instanceof CamareroImp) {
            CamareroImp otro = (CamareroImp) obj;

            if(id == otro.getID()) {
                res = true;
            }
        }
        return res;
    }

    //clone
    @Override
    public CamareroImp clone() {
        CamareroImp copia = null;

        try {
            copia = (CamareroImp) super.clone();
        }
        catch(CloneNotSupportedException err) {
            System.out.println("Objeto no clonado");
        }

        return copia;
    }

    //compareTo
    public int compareTo(CamareroImp otro) {
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
