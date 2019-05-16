package clases;

/*
Propiedades Basicas
Nombre
Tipo: String
Cons: Si
Mod: Si

Apellidos
Tipo: String
Cons: Si
Mod: Si

Alias
Tipo: String
Cons: Si
Mod: Si

Dorsal
Tipo: int
Cons: Si
Mod: Si

Edad
Tipo: int
Cons: Si
Mod: Si

Propiedades derivadas
No hay

Propiedades compartidas
No hay

Get and Set
Nombre
public String getNombre()
public void setNombre (String nombre)

Apellidos
public String getApellidos()
public void setApellidos (String apellidos)

Alias
public String getAlias()
public void setAlias (String alias)

Dorsal
public int getDorsal()
public void setDorsal(int dorsal)

Edad
public int getEdad()
public void setEdad(int edad)

Requisitos
Dorsal tiene que ser de 1 a 99
Edad tiene que ser de mayor de 16

Metodos anhadidos
No hay
 */

import interfaces.Futbolista;

public class FutbolistaImp implements Futbolista, Cloneable {
    //Atributos
    private String nombre;
    private String apellidos;
    private String alias;
    private int dorsal;
    private int edad;

    //Constructores
    public FutbolistaImp() {
        nombre = "NODEFINIDO";
        apellidos = "NODEFINIDO";
        alias = "NODEFINIDO";
        dorsal = 0;
        edad = 0;
    }

    public FutbolistaImp(String nombre, String apellidos, String alias, int dorsal, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.alias = alias;
        this.dorsal = dorsal;
        this.edad = edad;
    }

    public FutbolistaImp(FutbolistaImp cop) {
        this.nombre = cop.getNombre();
        this.apellidos = cop.getApellidos();
        this.alias = cop.getAlias();
        this.dorsal = cop.getDorsal();
        this.edad = cop.getEdad();
    }

    //Get and Set
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

    //Alias
    public String getAlias() {
        return alias;
    }


    public void setAlias(String alias) {
        this.alias = alias;
    }

    //Dorsal
    public int getDorsal() {
        return dorsal;
    }


    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    //Edad
    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Metodos de la clase object
    //toString
    @Override
    public String toString() {
        return nombre + ", " + apellidos + ", " + alias + ", " + dorsal + ", " + edad;
    }

    //hashCode
    @Override
    public int hashCode() {
        return nombre.hashCode() + apellidos.hashCode() * alias.hashCode() * 21;
    }

    //equals
    @Override
    public boolean equals(Object obj) {
        boolean res = false;

        if(this == obj) {
            res = true;
        }

        else if(obj != null && obj instanceof FutbolistaImp) {
                FutbolistaImp otro = (FutbolistaImp) obj;

                if(this.nombre == otro.getNombre() &&
                   this.apellidos == otro.getApellidos() &&
                   this.alias == otro.getAlias() &&
                   this.dorsal == otro.getDorsal() &&
                   this.edad == otro.getEdad()) {
                    res = true;
                }
             }
        return res;
    }

    //clone
    @Override
    public FutbolistaImp clone() {
        FutbolistaImp copia = null;

        try {
            copia = (FutbolistaImp) super.clone();
        }
        catch (CloneNotSupportedException err) {
            err.printStackTrace();
        }

        return copia;
    }
}
